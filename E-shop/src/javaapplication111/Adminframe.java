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
public class Adminframe extends JFrame {
    public Adminframe(){
        setTitle("E-Shop");
        setSize(800,400);
        setLocationRelativeTo(null);
        setBackground(new Color(129,222,243));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5));
        
        //line start , aristeri plevra tou eshop
        JMenuBar admin_menu = new JMenuBar();
                JMenu menu = new JMenu("Menu Admin");
                admin_menu.add(menu);
                JMenuItem createuser = new JMenuItem("Δημιουργία Λογαριασμού Χρήστη");
                JMenuItem logout = new JMenuItem("Αποσύνδεση");
                JMenuItem parousiasi_katalogou = new JMenuItem("Παρουσίαση Καταλόγου Προϊόντων");
                JMenuItem add_product = new JMenuItem("Προσθήκη/Αφαίρεση προϊόντων από το κατάστημα");
                JMenuItem item_5 = new JMenuItem("Ενημέρωση Προϊόντος");
                JMenuItem item_6 = new JMenuItem("Ενημέρωση Κατάστασης Παραγγελίας");
                JMenuItem display_users = new JMenuItem("Παρουσίαση Πελατολογίου");
                JMenuItem item_8 = new JMenuItem("Παρουσιάση παραγγελιών/πελάτη και κατάσταση παραγγελίας");
                JMenuItem item_9 = new JMenuItem("Υπολογισμός Κύκλου Εργασιών");
                menu.add(createuser);
                menu.add(logout);
                menu.add(parousiasi_katalogou);
                menu.add(add_product);
                menu.add(item_5);
                menu.add(item_6);
                menu.add(display_users);
                menu.add(item_8);
                menu.add(item_9);
                JPanel p2 = new JPanel();
                p2.add(admin_menu);
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
            
            createuser.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //dimiourgia xristi
                new Register_Form();
                dispose();
            }
        });
            
        parousiasi_katalogou.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou
                //new Katalogos_computers_frame();
                new katalogos();
                
            }
        });
        
        add_product.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //parousiasi katalogou gia prosthiki prointos
                new categoryoptionsframe();
                dispose();
                //new addproductframe();
                
            }
        });
           
                
         display_users.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
                
            new display_users_frame();
            dispose();
            
            }
         
         
         });
           
            
            
    }
}
