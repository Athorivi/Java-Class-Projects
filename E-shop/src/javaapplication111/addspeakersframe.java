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
public class addspeakersframe extends JFrame{
    public  addspeakersframe(){
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
        
        JPanel addWatt = new JPanel();
        JLabel Wattlabel = new JLabel("Watt: ");
        final JTextField Watttext = new JTextField(20);
        addWatt.add(Wattlabel);
        addWatt.add(Watttext);
        mainpanel.add(addWatt);
        
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
                                 String Watt = Watttext.getText();
                                 String price = pricetext.getText();
                                 
                                 writer = new BufferedWriter(new OutputStreamWriter(
                                 new FileOutputStream("proionta.txt",true), "utf-8"));
                                 writer.newLine();
                                 writer.write("speaker");
                                 writer.write("@@");
                                 writer.write(brand);
                                 writer.write("@@");
                                 writer.write(Watt);
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
                Watttext.setText("");
                
                pricetext.setText("");
                brandtext.requestFocus();
                
            }
        });
    }
}
