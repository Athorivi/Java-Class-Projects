/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.IntroFrame;
import snakegame.MainBoard;
import snakegame.Player;


public class GravityReversalSquare extends SpecialSquare  {

     public GravityReversalSquare(){
        super();
    }
    
    public GravityReversalSquare( int num)
    {
         super( num,"icons/gravity_reversal_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(GravityChange) Αλλαγή Φίδια με σκάλες \n");
    }
}
