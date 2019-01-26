/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.Player;


public class TurtelSquare extends SpecialSquare  {

     public TurtelSquare(){
        super();
    }
    
    public TurtelSquare( int num)
    {
         super(  num,"icons/turtle_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Turtle) o "+player.getOnoma() + " δεν ανεβαίνει σκάλες \n");
        player.setCanUseLadder(false);
    }
    
}
