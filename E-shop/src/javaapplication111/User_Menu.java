/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author George E
 */
public class User_Menu extends JFrame {
    public User_Menu(){
        setTitle("E-Shop");
        setSize(800,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5));
        
        //line start , aristeri plevra tou eshop
        JMenuBar client_menu = new JMenuBar();
                JMenu menu_client = new JMenu("Menu Πελάτη");
                client_menu.add(menu_client);
                JMenuItem productmenu = new JMenuItem("Παρουσίαση καταλόγου προϊόντων");
                
                
                JMenuItem logout = new JMenuItem("Αποσύνδεση");
                JMenuItem showcart = new JMenuItem("Παρουσίαση καλαθιού αγορών");
                JMenuItem item_14 = new JMenuItem("Δημιουργία νέας Παραγγελίας");
                JMenuItem item_15 = new JMenuItem("Προβολή κατάστασης Παραγγελίας");
                JMenuItem item_16 = new JMenuItem("Ενημέρωση κατάστασης Παραγγελίας");
                JMenuItem item_17 = new JMenuItem("");
                menu_client.add(productmenu);
                menu_client.add(logout);
                menu_client.add(showcart);
                menu_client.add(item_14);
                menu_client.add(item_15);
                menu_client.add(item_16);
                menu_client.add(item_17);
                JPanel p2 = new JPanel();
                p2.add(client_menu);
                p2.setBackground(new Color(129,222,243));
                add(p2,BorderLayout.LINE_START);
                
                //center border layout
                JPanel centerpanel = new JPanel();
                //backround
                JLabel background=new JLabel(new ImageIcon("eshop1.png"));
                centerpanel.add(background);
                centerpanel.setBackground(new Color(169,238,254));
                add(centerpanel,BorderLayout.CENTER);
        
        repaint();
        setVisible(true);  
        
        logout.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //logout
                new Login();
                dispose();
            }
        });
        
        
        showcart.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //logout
                new Show_cart_frame();

            }
        });
        
        productmenu.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou
                //new Katalogos_computers_frame();
                new katalogos();

                
            }
        });
        
    }
    
    
}
