/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import snakegame.InfoPanel;
import static snakegame.InfoPanel.PLAYER_TO_MOVE;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;
import snakegame.Player;


public class LoveSquare extends SpecialSquare  {

     public LoveSquare(){
        super();
    }
    
    public LoveSquare(int num)
    {
         super(  num,"icons/love_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
         int newPosition = 0;
        
        
        if (player == IntroFrame.PLAYER) {
            InfoPanel.infoArea.append((move_num++)+")(Love) �?ετακίνηση "+IntroFrame.PC.getOnoma() + " απ�? "+(IntroFrame.PC.getCurrentNum()+1)+" στην ένα�?ξη\n");
            MainBoard.SQUARES[IntroFrame.PC.getCurrentNum()].repaint();
            MainBoard.SQUARES[newPosition].add(IntroFrame.PC, BorderLayout.LINE_START);
            IntroFrame.PC.setCurrentNum(0);
        } else if (player == IntroFrame.PC) {
            InfoPanel.infoArea.append((move_num++)+")(Love) �?ετακίνηση "+IntroFrame.PLAYER.getOnoma() + " απ�? "+(IntroFrame.PLAYER.getCurrentNum()+1)+" στην ένα�?ξη\n");
            MainBoard.SQUARES[IntroFrame.PLAYER.getCurrentNum()].repaint();
            MainBoard.SQUARES[newPosition].add(IntroFrame.PLAYER, BorderLayout.LINE_END);    
            IntroFrame.PLAYER.setCurrentNum(0);
        }
        MainBoard.SQUARES[player.getCurrentNum()].repaint();
        MainBoard.SQUARES[newPosition].repaint();
        player.setCurrentNum(newPosition);
    }
}
