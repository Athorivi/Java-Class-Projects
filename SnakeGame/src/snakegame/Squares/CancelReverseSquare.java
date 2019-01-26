/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.Player;


public class CancelReverseSquare extends SpecialSquare {

     public CancelReverseSquare(){
        super();
    }
    
    public CancelReverseSquare( int num)
    {
         super(  num,"icons/reverse_cancel_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Cancel Reverse) o "+player.getOnoma() + " κινείται κανονικά \n");
        player.setIsMovingReverse(false);
    }
}
