/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class addcameraframe extends JFrame {
    public addcameraframe(){
        setTitle("E-Shop");
        setSize(650 ,250);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
        
        //mesa sto arxiko layout dimiourgoume ena gridlayout gia na mpainoun 
        //ta proionta to ena katw apo to all
        
        JPanel mainpanel = new JPanel(new GridLayout (6,1));
        
        JPanel addcolor = new JPanel();
        JLabel colorlabel = new JLabel("Color: ");
        final JTextField colortext = new JTextField(20);
        addcolor.add(colorlabel);
        addcolor.add(colortext);
        mainpanel.add(addcolor);
        
        JPanel addbrand = new JPanel();
        JLabel brandlabel = new JLabel("Brand: ");
        final JTextField brandtext = new JTextField(20);
        addbrand.add(brandlabel);
        addbrand.add(brandtext);
        mainpanel.add(addbrand);
        
        JPanel addMP = new JPanel();
        JLabel MPlabel = new JLabel("MP: ");
        final JTextField MPtext = new JTextField(20);
        addMP.add(MPlabel);
        addMP.add(MPtext);
        mainpanel.add(addMP);
        
        
        
        JPanel addprice = new JPanel();
        JLabel pricelabel = new JLabel("Price: ");
        final JTextField pricetext = new JTextField(20);
        addprice.add(pricelabel);
        addprice.add(pricetext);
        mainpanel.add(addprice);
        
        JPanel addbuttonpanel = new JPanel();
        JButton confirmbutton = new JButton("Confirm");
        JButton clearbutton = new JButton("Clear");
        addbuttonpanel.add(confirmbutton);
        addbuttonpanel.add(clearbutton);
        add(addbuttonpanel,BorderLayout.PAGE_END);
        
        add(mainpanel,BorderLayout.CENTER);
        //add(addconfirm,BorderLayout.PAGE_END)
        
        setVisible(true);
         repaint();
        
         
         confirmbutton.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent ae)
                         {
                             
                             BufferedWriter writer = null;
                             
                             try {
                                 String color = colortext.getText();
                                 String brand = brandtext.getText();
                                 String MP = MPtext.getText();
                                 String price = pricetext.getText();
                                 
                                 writer = new BufferedWriter(new OutputStreamWriter(
                                 new FileOutputStream("proionta.txt",true), "utf-8"));
                                 writer.newLine();
                                 writer.write("camera");
                                 writer.write("@@");
                                 writer.write(color);
                                 writer.write("@@");
                                 writer.write(brand);
                                 writer.write("@@");
                                 //kathorizoume oti ine apla user otan dimiourgithi o logariasmos
                                 writer.write(MP);
                                 writer.write("@@");
                                 writer.write(price);
                                 writer.close();
                             } catch (IOException ex) {
                                // report
                             }
                             Parser p = new Parser();
                             new Adminframe();
                             dispose();
                         }
                         
         });
         
         clearbutton.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //katharismos olon ton pedion sto frame
                colortext.setText("");
                brandtext.setText("");
                MPtext.setText("");
                pricetext.setText("");
                colortext.requestFocus();
                
            }
        });
    }
}
