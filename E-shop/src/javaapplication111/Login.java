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
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;



/**
 *
 * @author admin
 */
public class Login extends JFrame{
    public Login() {
        setTitle("E-Shop");
        setSize(350,400);
        setLocationRelativeTo(null); 
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //gia to login
        setLayout(new BorderLayout(5,5));
        JPanel login = new JPanel();
        JLabel username = new JLabel("Username:");
        login.add(username);
        final JTextField text1 = new JTextField(20);
        login.add(text1);
        JLabel password = new JLabel("Password:");
        login.add(password);
        final JPasswordField text2 = new JPasswordField(20);
        login.add(text2);
        
        //dimiourgia tou panel gia ta koumpia pou tha topothetithi sto kato meros tou frame
        JPanel buttonpanel = new JPanel();
        JButton log = new JButton("Login");
        JButton reg = new JButton("Register");
        buttonpanel.add(log);
        buttonpanel.add(reg);
        buttonpanel.setBackground(new Color(129,222,243));
        add(buttonpanel,BorderLayout.PAGE_END);
        
        //Backround
        JLabel background=new JLabel(new ImageIcon("eshop1.png"));
        login.add(background);
        login.setBackground(new Color(129,222,243));
        add(login,BorderLayout.CENTER);
        setVisible(true);
        
        reg.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent ae)
            {
                //Eggrafi xristi
                Register_Form f1 = new Register_Form();
                dispose();
            }
        });
        
        
        log.addActionListener(new ActionListener() {

            @Override
            @SuppressWarnings("empty-statement")
            
            
            public void actionPerformed(ActionEvent ae) {
                
                
            
                
                boolean loginfailed = true;
                
                String username=text1.getText();
                char[] pwd= text2.getPassword();
                String password = new String(pwd);
                
                    for(int i=0; i<Basi.getInstance().getUsers().size(); i++){
                    if(username.equals(Basi.getInstance().getUsers().get(i).getUsername())){
                        if(password.equals(Basi.getInstance().getUsers().get(i).getPassword())){
                            if("admin".equals(Basi.getInstance().getUsers().get(i).getUsertype())){
                                new Adminframe();
                                loginfailed=false;
                                User j = new User(Basi.getInstance().getUsers().get(i).getUsername(),Basi.getInstance().getUsers().get(i).getPassword(),Basi.getInstance().getUsers().get(i).getUsertype());
                                Basi.getInstance().getCurrentuser().add(j);
                                dispose();
                                break;
                            }
                            if("user".equals(Basi.getInstance().getUsers().get(i).getUsertype()) || "company".equals(Basi.getInstance().getUsers().get(i).getUsertype())){
                                new User_Menu();
                                loginfailed=false;
                                User j = new User(Basi.getInstance().getUsers().get(i).getUsername(),Basi.getInstance().getUsers().get(i).getPassword(),Basi.getInstance().getUsers().get(i).getUsertype());
                                Basi.getInstance().getCurrentuser().add(j);
                                dispose();
                                break;
                            }
                        }
                    }
                }
                
                if(loginfailed=true){
                    text1.setText("");
                    text2.setText("");
                    text1.requestFocus();
                }
                
                /*      
              //validation 
                try {
                FileInputStream inputStream= new FileInputStream("users.txt");
                BufferedReader r = new BufferedReader (new InputStreamReader(inputStream));
                
                String temp;
                while((temp=r.readLine()) != null){
                String[] var = temp.split("-");
                
                //elegxos gia isodo admin
                if(username.equals(var[0]) && password.equals(var[1]) && "admin".equals(var[2]))
                {
                   new Adminframe();
                   c=0;
                   wrongusername=0;
                   wrongusername=0;
                   dispose();
                   break;
                }
                //elegxos gia isodo user
                else if(username.equals(var[0]) && password.equals(var[1]) && "user".equals(var[2]))
                {
                   new User_Menu();
                   c=0;
                   wrongusername=0;
                   wrongusername=0;
                   dispose();
                   break;
                }
                else if(username.equals(var[0]) && !password.equals(var[1]))
                {
                   wrongpassword=1;
                }
                
                else if(temp==null){
                    System.out.println("Not a user");
                    wrongusername=1;
                    break;
                }
                else if(!username.equals(var[0]) && !password.equals(var[1])){
                    wrongusername=1;
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
               
                
                
                //elegxos ean o kodikos ine lathos
                if(wrongpassword==1){
                     getContentPane().removeAll();
                     JLabel not_user = new JLabel("Wrong Password");
                     add(not_user,BorderLayout.CENTER);
                     System.out.println("Wrong Password");
                     setVisible(true);
                }
                //elegxos ean to username ine lathos
                else if(wrongusername==1){
                     getContentPane().removeAll();
                     JLabel not_user = new JLabel("User does not exist");
                     add(not_user,BorderLayout.CENTER);
                     System.out.println("User does not exist");
                     setVisible(true);
                }
                */
                  
              repaint();
              
            }
            
            });

    }
    
}