/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author George E
 */
public class addcomputerframe extends JFrame {
    public addcomputerframe(){
        setTitle("E-Shop");
        setSize(650 ,250);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
        
        //mesa sto arxiko layout dimiourgoume ena gridlayout gia na mpainoun 
        //ta proionta to ena katw apo to all
        
        JPanel mainpanel = new JPanel(new GridLayout (6,1));
        
        JPanel addbrand = new JPanel();
        JLabel brandlabel = new JLabel("Brand: ");
        final JTextField brandtext = new JTextField(20);
        addbrand.add(brandlabel);
        addbrand.add(brandtext);
        mainpanel.add(addbrand);
        
        JPanel addcpu = new JPanel();
        JLabel cpulabel = new JLabel("Cpu: ");
        final JTextField cputext = new JTextField(20);
        addcpu.add(cpulabel);
        addcpu.add(cputext);
        mainpanel.add(addcpu);
        
        JPanel addram = new JPanel();
        JLabel ramlabel = new JLabel("Ram: ");
        final JTextField ramtext = new JTextField(20);
        addram.add(ramlabel);
        addram.add(ramtext);
        mainpanel.add(addram);
        
        JPanel addgrafics = new JPanel();
        JLabel graficslabel = new JLabel("Grafics: ");
        final JTextField graficstext = new JTextField(20);
        addgrafics.add(graficslabel);
        addgrafics.add(graficstext);
        mainpanel.add(addgrafics);
        
        JPanel addscreen = new JPanel();
        JLabel screenlabel = new JLabel("Screen: ");
        final JTextField screentext = new JTextField(20);
        addscreen.add(screenlabel);
        addscreen.add(screentext);
        mainpanel.add(addscreen);
        
        JPanel addos = new JPanel();
        JLabel oslabel = new JLabel("Os: ");
        final JTextField ostext = new JTextField(20);
        addos.add(oslabel);
        addos.add(ostext);
        mainpanel.add(addos);
        
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
                                 String brand = brandtext.getText();
                                 String cpu = cputext.getText();
                                 String ram = ramtext.getText();
                                 String grafics = graficstext.getText();
                                 String screen = screentext.getText();
                                 String os = ostext.getText();
                                 String price = pricetext.getText();
                                 
                                 writer = new BufferedWriter(new OutputStreamWriter(
                                 new FileOutputStream("proionta.txt",true), "utf-8"));
                                 writer.newLine();
                                 writer.write("computer");
                                 writer.write("@@");
                                 writer.write(brand);
                                 writer.write("@@");
                                 writer.write(cpu);
                                 writer.write("@@");
                                 //kathorizoume oti ine apla user otan dimiourgithi o logariasmos
                                 writer.write(ram);
                                 writer.write("@@");
                                 writer.write(grafics);
                                 writer.write("@@");
                                 writer.write(screen);
                                 writer.write("@@");
                                 writer.write(os);
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
                brandtext.setText("");
                cputext.setText("");
                ramtext.setText("");
                graficstext.setText("");
                screentext.setText("");
                ostext.setText("");
                pricetext.setText("");
                brandtext.requestFocus();
                
            }
        });
    }
}
