/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Random;
import javax.sound.midi.MidiDevice;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakegame.InfoPanel;
import static snakegame.InfoPanel.PLAYER_TO_MOVE;
import static snakegame.InfoPanel.infoArea;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;
import snakegame.Player;


public class LadderSquare extends Square {

    int numOfSquareToMove;

    public LadderSquare() {
        super();
    }

    public LadderSquare( int num) {
        super( num, "icons/ladder.png");

        Random rand = new Random();
        int n = rand.nextInt(10) + 3;
        this.numOfSquareToMove = num + n;

        //this.add(image,BorderLayout.CENTER);
        this.setTopPanel(new JPanel(new FlowLayout(FlowLayout.RIGHT)));
        JLabel labelToMove = new JLabel(Integer.toString(numOfSquareToMove+1));
        labelToMove.setFont(new Font("Serif", Font.PLAIN, 18));
        labelToMove.setForeground(Color.blue);
        this.getTopPanel().add(labelToMove);
        this.add(this.getTopPanel(), BorderLayout.PAGE_START);
    }

    @Override
    public void specialAction(Player player) {
        if (!player.isCanUseLadder()) {
            return;
        }
        int newPosition = this.numOfSquareToMove;
        InfoPanel.infoArea.append((move_num++)+")(Σκάλα) �?ετακίνηση "+player.getOnoma() + " απ�? "+(player.getCurrentNum()+1)+" σε "+(newPosition+1)+"\n");
        
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
