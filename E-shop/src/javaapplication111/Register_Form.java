/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author George E
 */
public class Register_Form extends JFrame {
    public Register_Form(){
        setTitle("E-Shop");
        setSize(250,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5));
        
        JPanel Regpanel = new JPanel(new FlowLayout());
        
                //onoma
                Regpanel.setBackground(new Color(129,222,243));
                JLabel namelabel = new JLabel("'Ονομα:");
                Regpanel.add(namelabel);
                final JTextField nametext = new JTextField(20);
                Regpanel.add(nametext);
                
                //epitheto
                JLabel lnamelabel = new JLabel("Επίθετο:");
                Regpanel.add(lnamelabel);
                final JTextField lnametext = new JTextField(20);
                Regpanel.add(lnametext);
                
                //username
                JLabel usernamelabel = new JLabel("Username:");
                Regpanel.add(usernamelabel);
                final JTextField usernametext = new JTextField(20);
                Regpanel.add(usernametext);
                
                //password
                JLabel passwordlabel = new JLabel("Password:");
                Regpanel.add(passwordlabel);
                final JPasswordField passwordtext = new JPasswordField(20);
                Regpanel.add(passwordtext);
                
                //confirmpassword
                JLabel confirmpasswordlabel = new JLabel("Confirm Password:");
                Regpanel.add(confirmpasswordlabel);
                final JPasswordField confirmpasswordtext = new JPasswordField(20);
                Regpanel.add(confirmpasswordtext);
                
                //sumbit button
                JButton submit = new JButton("Submit");
                Regpanel.add(submit);
                
                add(Regpanel,BorderLayout.CENTER);
                setBackground(Color.cyan);
              repaint();
              setVisible(true);
              
        submit.addActionListener(new ActionListener() {

            @Override
            @SuppressWarnings("empty-statement")
            
            
            public void actionPerformed(ActionEvent ae) {
                BufferedWriter writer = null;
                int userOK=0;
                String name = nametext.getText();
                String lname = lnametext.getText();
                String username = usernametext.getText();
                
                char[] pwd= passwordtext.getPassword();
                String password = new String(pwd);
                
                char[] confirmpwd= confirmpasswordtext.getPassword();
                String confirmpassword = new String(confirmpwd);
                
                //Elegxos ean iparxi to username i to email
                try {
                FileInputStream inputStream= new FileInputStream("users.txt");
                BufferedReader r = new BufferedReader (new InputStreamReader(inputStream));
                
                String temp;
                while((temp=r.readLine()) != null){
                String[] var = temp.split("-");
                //elegxos gia isodo admin
                if(username.equals(var[0]))
                {
                   System.out.println("User Already Exist");
                   userOK=0;
                   break;
                }
                else{
                    userOK=1;
                }
                
                }
                r.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("not fi");
                } catch (NullPointerException ex) {
                    System.out.println("not file");
                }catch (IOException ex){
                    System.out.println("not");
                }
                
                
                //dimiourgia logiariasmou
                if(userOK==1 && password.equals(confirmpassword)){
                

                     try {
                         writer = new BufferedWriter(new OutputStreamWriter(
                         new FileOutputStream("users.txt",true), "utf-8"));
                         writer.newLine();
                         writer.write(username);
                         writer.write("-");
                         writer.write(password);
                         writer.write("-");
                         //kathorizoume oti ine apla user otan dimiourgithi o logariasmos
                         writer.write("user");
                         writer.write("-");
                         writer.write(name);
                         writer.write("-");
                         writer.write(lname);
                         writer.close();
                    } catch (IOException ex) {
                         // report
                    } finally {
                    try {writer.close();} catch (Exception ex) {/*ignore*/}
                    }
                     //otan kanei register mpori na sinexisi os xristis
                     getContentPane().removeAll();
                     JPanel continuepanel = new JPanel();
                     JLabel loginas = new JLabel("Login as " + username + "?");
                     JButton yeslogin = new JButton("Yes");
                     JButton nologin = new JButton("No");
                     continuepanel.add(loginas);
                     continuepanel.add(yeslogin);
                     continuepanel.add(nologin);
                     add(continuepanel,BorderLayout.CENTER);
                     setVisible(true);
                     
                     //action listener gia to koumpi an theli na sinexisi sto katastima os user
                     yeslogin.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent ae)
                         {
                             //login
                             new User_Menu();
                             dispose();
                         }
                     });
                     
                     //action listener gia to koumpou an den theli na sinexisi
                     nologin.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent ae)
                         {
                             //login
                             new Login();
                             dispose();
                         }
                     });
                     
                }
                else if(userOK==0 && password.equals(confirmpassword)){
                    System.out.println("Cannot Continue");
                }
                else{
                    System.out.println("Password Doesn't Match");
                }
                
            }
        });
    }
}
