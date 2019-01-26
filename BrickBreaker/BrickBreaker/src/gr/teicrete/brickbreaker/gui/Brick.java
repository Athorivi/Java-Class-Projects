
package gr.teicrete.brickbreaker.gui;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
 
public class Brick{
    
    private JButton but;
    private Color c;
    private boolean visited = false;
    
    public Brick(){
        but = new JButton();
        this.c = setRandomColor();
        
    } 
    
    public JButton getBrick(){
        return this.but;
    }
    
    public Color getColor(){
       return this.c;
    }
    
    public boolean getVisited(){
        return this.visited;
    }
    
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    
    public Color setRandomColor(){
        Random rand = new Random();
        int i = rand.nextInt(4)+1;
        switch(i){
            case 1:
                this.c = Color.BLUE;
                but.setBackground(this.c);
                break;
            case 2:
                this.c = Color.YELLOW;
                but.setBackground(this.c);
                break;
            case 3:
                this.c = Color.PINK;
                but.setBackground(this.c);
                break;
            case 4:
                this.c = Color.GREEN;
                but.setBackground(this.c);
                break;
        }
        return this.c; 
    }
}
