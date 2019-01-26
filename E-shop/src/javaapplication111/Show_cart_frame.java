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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Show_cart_frame extends JFrame {
    public Show_cart_frame(){
        setTitle("E-Shop");
        setSize(650 ,250);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
        JButton back = new JButton("Back");
        add(back,BorderLayout.PAGE_END);
        
        int l=0;
        JPanel cartpanel = new JPanel(new GridLayout(l,2));
        float sinolopliromis=0;
        
        for(int i=0; i<Basi.getInstance().getCart().size(); i++){
            float price = Basi.getInstance().getCart().get(i).getPrice();
            
            l=i;
            if("company".equals(Basi.getInstance().getCurrentuser().get(0).getUsertype())){
                JLabel brandlabel = new JLabel(Basi.getInstance().getCart().get(i).getProduct());
                JLabel pricelabel = new JLabel(String.valueOf(price-0.23*price));
                cartpanel.add(brandlabel);
                cartpanel.add(pricelabel);
                sinolopliromis+=price-0.23*price;
            }
            if("user".equals(Basi.getInstance().getCurrentuser().get(0).getUsertype())){
                JLabel brandlabel = new JLabel(Basi.getInstance().getCart().get(i).getProduct());
                JLabel pricelabel = new JLabel(String.valueOf(price));
                cartpanel.add(brandlabel);
                cartpanel.add(pricelabel);
                sinolopliromis+=price;
            }
            
            
            
            
            
            
        }
        add(cartpanel,BorderLayout.CENTER);
        JPanel dexiPanel = new JPanel(new GridLayout(1,1));
        
        
        JLabel sinololabel = new JLabel(String.valueOf(sinolopliromis));
        dexiPanel.add(sinololabel);
        add(dexiPanel,BorderLayout.LINE_END);
        
        JPanel toppanel = new JPanel(new GridLayout(1,3));
        JLabel proiontalabel = new JLabel("Products");
        JLabel timeslabel = new JLabel("Price");
        toppanel.add(proiontalabel);
        toppanel.add(timeslabel);
        
        add(toppanel,BorderLayout.PAGE_START);
        
        
        back.addActionListener(new ActionListener(){

            
            public void actionPerformed(ActionEvent ae) {
               dispose();
            
            
            
            
            
            }
            
        });
        
        setVisible(true);
    }
}
