/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Squares;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakegame.ImagePanel;
import snakegame.Player;


public abstract class Square extends JPanel {
    
    private int row;
    private int col;
    private int num;
    private String image;
    private JPanel topPanel;

    public Square() {
        this.row = 0;
        this.col = 0;
        this.num = 0;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
        
    public Square( int num,String image) {
        this.setLayout(new BorderLayout());
        this.num = num;
        this.image = image;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        
        
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel numLabel = new JLabel(Integer.toString(num+1));
        numLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        bottomPanel.add(numLabel);
        
//        this.add(topPanel,BorderLayout.PAGE_START);
        if (image != null) {
            this.add(new ImagePanel(image),BorderLayout.CENTER);
        }
        
        this.add(bottomPanel,BorderLayout.PAGE_END);

    }
    


    //abstract methodos etsi oste na tin ilopoiisoun oi ipoklaseis opos xriazete
    public abstract void specialAction(Player player);
    
    public JPanel getTopPanel() {    
        return topPanel;
    }
    
    public String getImage() {    
        return image;
    }

    //setters - getters
    public void setImage(String image) {
        this.image = image;    
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
