/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakegame.Player;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import snakegame.ImagePanel;
import snakegame.InfoPanel;
import static snakegame.InfoPanel.PLAYER_TO_MOVE;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;


public class SnakeSquare extends Square {

    int numOfSquareToMove;
    
    public SnakeSquare(){
        super();
    }
    
    public SnakeSquare( int num){
        super(  num,"icons/snake.png");
        
        Random rand = new Random();
        int  n = rand.nextInt(12) +3;
        this.numOfSquareToMove = num-n;
        
        //this.add(image,BorderLayout.CENTER);
        this.setTopPanel(new JPanel(new FlowLayout(FlowLayout.RIGHT)));
        JLabel labelToMove = new JLabel(Integer.toString(numOfSquareToMove+1));
        labelToMove.setFont(new Font("Serif", Font.PLAIN, 18));
        labelToMove.setForeground(Color.RED);
        this.getTopPanel().add(labelToMove);
        this.add(this.getTopPanel(),BorderLayout.PAGE_START);
    }

    @Override
    public void specialAction(Player player) {
        int newPosition = this.numOfSquareToMove;
        InfoPanel.infoArea.append((move_num++)+")(Φιδαάκι) �?ετακίνηση "+player.getOnoma() + " απ�? "+(player.getCurrentNum()+1)+" σε "+(newPosition+1)+"\n");
        
        if (player == IntroFrame.PLAYER) {
            MainBoard.SQUARES[newPosition].add(player, BorderLayout.LINE_START);
        } else if (player == IntroFrame.PC) {
            MainBoard.SQUARES[newPosition].add(player, BorderLayout.LINE_END);    
        }
        MainBoard.SQUARES[player.getCurrentNum()].repaint();
        MainBoard.SQUARES[newPosition].repaint();
        player.setCurrentNum(newPosition);
    }
}
