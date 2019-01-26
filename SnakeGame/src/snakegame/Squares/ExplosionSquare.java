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
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakegame.InfoPanel;
import static snakegame.InfoPanel.PLAYER_TO_MOVE;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;
import snakegame.Player;


public class ExplosionSquare extends SpecialSquare  {

    public ExplosionSquare(){
        super();
    }
    
    public ExplosionSquare( int num)
    {
         super(  num,"icons/explosion_icon.png");
    }
    
    
    @Override
    public void specialAction(Player player) {
        int newPosition = 0;
        InfoPanel.infoArea.append((move_num++)+")(Explosion) �?ετακίνηση "+player.getOnoma() + " απ�? "+(player.getCurrentNum()+1)+" στην ένα�?ξη\n");
        
        if (player == IntroFrame.PLAYER) {
            MainBoard.SQUARES[newPosition].add(player, BorderLayout.LINE_START);
        } else if (PLAYER_TO_MOVE == IntroFrame.PC) {
            MainBoard.SQUARES[newPosition].add(player, BorderLayout.LINE_END);    
        }
        MainBoard.SQUARES[player.getCurrentNum()].repaint();
        MainBoard.SQUARES[newPosition].repaint();
        player.setCurrentNum(newPosition);
    }
    
}
