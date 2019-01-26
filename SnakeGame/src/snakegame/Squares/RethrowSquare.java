/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.InfoPanel;
import static snakegame.InfoPanel.move_num;
import snakegame.MainBoard;
import snakegame.Player;


public class RethrowSquare extends SpecialSquare  {

     public RethrowSquare(){
        super();
    }
    
    public RethrowSquare( int num)
    {
         super(  num,"icons/rethrow_dice_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Rethrow) �?ανα παίζει ο/η "+player.getOnoma()+"\n");
        InfoPanel.PLAYER_TO_MOVE = player;
        MainBoard.SQUARES[player.getCurrentNum()].invalidate();
    }
    
}
