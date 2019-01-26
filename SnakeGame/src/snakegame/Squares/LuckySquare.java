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


public class LuckySquare extends SpecialSquare  {

     public LuckySquare(){
        super();
    }
    
    public LuckySquare( int num)
    {
         super(  num,"icons/lucky_icon.png");
    }
    
    @Override
    public void specialAction(Player player) {
        InfoPanel.infoArea.append((move_num++)+")(Lucky) �?ανα παίζει ο/η "+player.getOnoma()+"\n");
        InfoPanel.luckyMove = true;
        InfoPanel.PLAYER_TO_MOVE = player;
    }
    
}
