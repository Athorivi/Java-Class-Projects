/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import snakegame.Player;


public abstract class SpecialSquare extends Square {
    
    public SpecialSquare(){
        super();
    }
    
    public SpecialSquare( int num,String image)
    {
        super(  num,image);
    }

    @Override
    public abstract void specialAction(Player player);
    
}
