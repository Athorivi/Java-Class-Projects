/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author CrAsH
 */
public class categoryoptionsframe extends JFrame {
    
    public categoryoptionsframe(){
        setTitle("E-Shop");
        setSize(650 ,250);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
        
        JPanel options = new JPanel();
        JRadioButton computers = new JRadioButton("Computers");
        JRadioButton smartphones = new JRadioButton("Smartphone");
        JRadioButton televisions = new JRadioButton("Tv");
        JRadioButton printers = new JRadioButton("Printers");
        JRadioButton camera = new JRadioButton("Camera");
        JRadioButton speakers = new JRadioButton("Speakers");
        options.add(computers);
        options.add(smartphones);
        options.add(televisions);
        options.add(printers);
        options.add(camera);
        options.add(speakers);
        add(options,BorderLayout.CENTER);
        setVisible(true);
        
        computers.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addcomputerframe();
                //new addcomputerframe();
                
            }
        });
        
        smartphones.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addsmartphoneframe();
                //new addcomputerframe();
                
            }
        });
        
        televisions.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addtelevisionframe();
                //new addcomputerframe();
                
            }
        });
        
        printers.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addprinterframe();
                //new addcomputerframe();
                
            }
        });
        
        camera.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addcameraframe();
                //new addcomputerframe();
                
            }
        });
        
        speakers.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new addspeakersframe();
                //new addcomputerframe();
                
            }
        });
        
        
        
        
        
    }
    
}
