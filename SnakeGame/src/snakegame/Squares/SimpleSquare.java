/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import snakegame.MainBoard;
import snakegame.Player;


public class SimpleSquare extends Square {

    public SimpleSquare( int num) {
        super(num,null);
        
    }

    @Override
    public void specialAction(Player player) {
    }
    
}
