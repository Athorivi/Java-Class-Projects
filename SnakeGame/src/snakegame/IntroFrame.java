/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class IntroFrame extends JFrame {
    
    static public Player PLAYER;
    static public Player PC;
    public IntroFrame()
    {
        this.setSize(350, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 2));
        
        JTextField onomaTF = new JTextField();
        String[] colorStrings = { "�?πλέ", "Π�?άσινο", "Ροζ", "�?�?κκινο"};
        JComboBox colorCombo = new JComboBox(colorStrings);
        String[] epipedoStrings = { "Easy", "Normal", "Hard"};
        JComboBox levelCombo = new JComboBox(epipedoStrings);
        JButton startButton = new JButton("Start");

        this.add(new JLabel("�?νομα"));
        this.add(onomaTF);
        this.add(new JLabel("Χ�?�?μα"));
        this.add(colorCombo);
        this.add(new JLabel("Επίπεδο"));
        this.add(levelCombo);
        this.add(startButton);
        
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                self().setVisible(false);
                
                InfoPanel.EPIPEDO = levelCombo.getSelectedItem().toString();
                
                //kanw null to xroma pou epelekse o paiktis etsi oste na to apoklisw apo to pc na to epeleksei
                colorStrings[colorCombo.getSelectedIndex()] = null;
                System.out.println(colorCombo.getSelectedIndex());
                IntroFrame.PLAYER = new Player(onomaTF.getText(), colorCombo.getSelectedItem().toString() , true, false, true, 0);
                
                
                
                Random rand = new Random();
                int  n = rand.nextInt(3);
                while(colorStrings[n] == null){
                    n = rand.nextInt(3);
                }
                System.out.println("xroma gia pc : "+n);
                IntroFrame.PC = new Player("computer", colorStrings[n], false, false, true, 0);
                
                MainFrame mf = new MainFrame();
            }
        });
        
        this.setVisible(true);
    }
    
    private IntroFrame self()
    {
        return this;
    }
}
