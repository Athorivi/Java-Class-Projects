/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;
import snakegame.Player;


public class ExchangeSquare extends SpecialSquare  {

     public ExchangeSquare(){
        super();
    }
    
    public ExchangeSquare( int num)
    {
         super(  num,"icons/exchange_pawns_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        
        int tmpPos = IntroFrame.PLAYER.getCurrentNum();
        //kinisi paikti
        InfoPanel.infoArea.append((move_num++)+")(Exchange) �?ετακίνηση "+IntroFrame.PLAYER.getOnoma() + " απ�? "+(IntroFrame.PLAYER.getCurrentNum()+1)+" σε "+(IntroFrame.PC.getCurrentNum()+1)+"\n");
        IntroFrame.PLAYER.setCurrentNum(IntroFrame.PC.getCurrentNum());
        MainBoard.SQUARES[IntroFrame.PC.getCurrentNum()].add(IntroFrame.PLAYER, BorderLayout.LINE_START);
        //kinisi pc
        InfoPanel.infoArea.append((move_num++)+")(Exchange) �?ετακίνηση "+IntroFrame.PC.getOnoma() + " απ�? "+(IntroFrame.PC.getCurrentNum()+1)+" σε "+(tmpPos+1)+"\n");
        IntroFrame.PC.setCurrentNum(tmpPos);
        MainBoard.SQUARES[tmpPos].add(IntroFrame.PC, BorderLayout.LINE_END);
        
       
        MainBoard.SQUARES[IntroFrame.PLAYER.getCurrentNum()].repaint();
        MainBoard.SQUARES[IntroFrame.PC.getCurrentNum()].repaint();
        
    }
    
}
