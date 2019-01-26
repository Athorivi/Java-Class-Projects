/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.Player;


public class CancelTurtleSquare extends SpecialSquare  {

     public CancelTurtleSquare(){
        super();
    }
    
    public CancelTurtleSquare(int row, int col, int num)
    {
         super(  num,"icons/turtle_cancel_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Cancel Turtle) o "+player.getOnoma() + " ανεβαίνει σκάλες \n");
        player.setCanUseLadder(true);
    }
    
}
