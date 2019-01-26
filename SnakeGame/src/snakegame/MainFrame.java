/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
    
    public MainFrame(){
        this.setLayout(new BorderLayout());
        
        MainBoard mainBoard = new MainBoard();
        InfoPanel infoPanel = new InfoPanel();
        this.add(infoPanel,BorderLayout.LINE_END);
        
        
        
        this.add(mainBoard,BorderLayout.CENTER);
        
        this.setSize(1280, 1024);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
