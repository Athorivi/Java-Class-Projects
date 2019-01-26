/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.Player;


public class ReverseSquare extends SpecialSquare  {

     public ReverseSquare(){
        super();
    }
    
    public ReverseSquare( int num)
    {
         super( num,"icons/reverse_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Reverse) o "+player.getOnoma() + " κινείται ανάποδα \n");
        player.setIsMovingReverse(true);
    }
}
