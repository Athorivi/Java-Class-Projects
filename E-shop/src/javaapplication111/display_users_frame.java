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
public class display_users_frame extends JFrame{
    public display_users_frame(){
    
    setTitle("E-Shop");
        setSize(650 ,250);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
        JButton back = new JButton("Back");
        add(back,BorderLayout.PAGE_END);
        
        int l=0;
        JPanel userspanel = new JPanel(new GridLayout(l,2));
        
        for(int i=0; i<Basi.getInstance().getUsers().size(); i++){
            l=i;
            
            JLabel usernamelabel = new JLabel(Basi.getInstance().getUsers().get(i).getUsername());
            JLabel typelabel = new JLabel(Basi.getInstance().getUsers().get(i).getUsertype());
            userspanel.add(usernamelabel);
            userspanel.add(typelabel);
            
            
            
            
        }
        add(userspanel,BorderLayout.CENTER);
        
        

       
        
        JPanel toppanel = new JPanel(new GridLayout(1,3));
        JLabel userslabel = new JLabel("Username");
        JLabel typeslabel = new JLabel("User Type");
        toppanel.add(userslabel);
        toppanel.add(typeslabel);
        
        add(toppanel,BorderLayout.PAGE_START);
        
        
        back.addActionListener(new ActionListener(){

            
            public void actionPerformed(ActionEvent ae) {
               dispose();
            
            
            
            
            
            }
            
        });
        
        setVisible(true);
    
    
    
    
    
    
    
    
    }
}
