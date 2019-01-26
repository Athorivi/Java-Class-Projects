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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class katalogos extends JFrame{
    public katalogos(){
        setTitle("E-Shop");
        setSize(900,400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(5,5)); //ARXIKO LAYOUT
       
       final JPanel options = new JPanel(new GridLayout(7,1));
       JButton computer = new JButton("Computers");
       JButton smartphones = new JButton("Smatphones");
       JButton tv = new JButton("Tv");
       JButton printer = new JButton("Printers");
       JButton camera = new JButton("Φωτογραφικές Μηχανές");
       JButton speakers = new JButton("Ηχεία");
       JButton back = new JButton("Back");
       
       
       options.add(computer);
       options.add(smartphones);
       options.add(tv);
       options.add(printer);
       options.add(camera);
       options.add(speakers);
       options.add(back);
       add(options,BorderLayout.LINE_START);
       
       
       computer.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel computer_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel comp1=new JLabel(new ImageIcon("computer1.png"));
                computer_photo.add(comp1);
                JLabel comp2=new JLabel(new ImageIcon("computer2.png"));
                computer_photo.add(comp2);
                JLabel comp3=new JLabel(new ImageIcon("computer3.png"));
                computer_photo.add(comp3);
                add(computer_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                
                comp1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getComputers().size(); i++){
                            if("Dell".equals(Basi.getInstance().getComputers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Dell");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getComputers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getComputers().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getComputers().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getComputers().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel oslabel = new JLabel("Os: "+Basi.getInstance().getComputers().get(i).getOs());
                                 desc.add(oslabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getComputers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getComputers().get(k).getBrand(),Basi.getInstance().getComputers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                        
                }

                });
                
                comp2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getComputers().size(); i++){
                            if("Microsoft Surface Pro 4".equals(Basi.getInstance().getComputers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Microsoft Surface Pro 4");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel(Basi.getInstance().getComputers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getComputers().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getComputers().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getComputers().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel oslabel = new JLabel("Os: "+Basi.getInstance().getComputers().get(i).getOs());
                                 desc.add(oslabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getComputers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                   buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getComputers().get(k).getBrand(),Basi.getInstance().getComputers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
       
                comp3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getComputers().size(); i++){
                            if("Turbo-X Sphere SP10 Desktop".equals(Basi.getInstance().getComputers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Turbo-X Sphere SP10 Desktop");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel(Basi.getInstance().getComputers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getComputers().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getComputers().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getComputers().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel oslabel = new JLabel("Os: "+Basi.getInstance().getComputers().get(i).getOs());
                                 desc.add(oslabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getComputers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                   buy.addActionListener(new ActionListener(){
                                       

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getComputers().get(k).getBrand(),Basi.getInstance().getComputers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                      
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
                
                
                
       
            }
        
       });
       
       back.addActionListener(new ActionListener (){

            
            public void actionPerformed(ActionEvent ae) {
               dispose();
            
            
            }

       
       
    });
    
       
       smartphones.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel smartphone_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel smart1=new JLabel(new ImageIcon("smartphone1.png"));
                smartphone_photo.add(smart1);
                JLabel smart2=new JLabel(new ImageIcon("smartphone2.png"));
                smartphone_photo.add(smart2);
                JLabel smart3=new JLabel(new ImageIcon("smartphone3.png"));
                smartphone_photo.add(smart3);
                add(smartphone_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                smart1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSmartphones().size(); i++){
                            if("Nokia Lumia 930".equals(Basi.getInstance().getSmartphones().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Nokia Lumia 930");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getSmartphones().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getSmartphones().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getSmartphones().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getSmartphones().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSmartphones().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSmartphones().get(k).getBrand(),Basi.getInstance().getSmartphones().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                      
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
                
                smart2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSmartphones().size(); i++){
                            if("Lenovo K50-t5".equals(Basi.getInstance().getSmartphones().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Samsung Galaxy S7");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel(Basi.getInstance().getSmartphones().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getSmartphones().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getSmartphones().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getSmartphones().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSmartphones().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                   buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSmartphones().get(k).getBrand(),Basi.getInstance().getSmartphones().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
       
                smart3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSmartphones().size(); i++){
                            if("Samsung Galaxy S7".equals(Basi.getInstance().getSmartphones().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Lenovo K50-t5");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel(Basi.getInstance().getSmartphones().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel cpulabel = new JLabel("Cpu: "+Basi.getInstance().getSmartphones().get(i).getCpu());
                                 desc.add(cpulabel);
                                 JLabel ramlabel = new JLabel("Ram: "+Basi.getInstance().getSmartphones().get(i).getRam());
                                 desc.add(ramlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getSmartphones().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSmartphones().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                   buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSmartphones().get(k).getBrand(),Basi.getInstance().getSmartphones().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
                
                
                
       
            }
       });
       
       tv.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel tv_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel tv1=new JLabel(new ImageIcon("tv1.png"));
                tv_photo.add(tv1);
                JLabel tv2=new JLabel(new ImageIcon("tv2.png"));
                tv_photo.add(tv2);
                JLabel tv3=new JLabel(new ImageIcon("tv3.png"));
                tv_photo.add(tv3);
                add(tv_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                tv1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getTelevisions().size(); i++){
                            if("LG".equals(Basi.getInstance().getTelevisions().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("LG");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getTelevisions().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getTelevisions().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel resolutionlabel = new JLabel("Resolution: "+Basi.getInstance().getTelevisions().get(i).getResolution());
                                 desc.add(resolutionlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getTelevisions().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getTelevisions().get(k).getBrand(),Basi.getInstance().getTelevisions().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
                
                tv2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getTelevisions().size(); i++){
                            if("Samsung".equals(Basi.getInstance().getTelevisions().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Samsung");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getTelevisions().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getTelevisions().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel resolutionlabel = new JLabel("Resolution: "+Basi.getInstance().getTelevisions().get(i).getResolution());
                                 desc.add(resolutionlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getTelevisions().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getTelevisions().get(k).getBrand(),Basi.getInstance().getTelevisions().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
       
                tv3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getTelevisions().size(); i++){
                            if("Sony".equals(Basi.getInstance().getTelevisions().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Sony");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getTelevisions().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel screenlabel = new JLabel("Screen Size: "+Basi.getInstance().getTelevisions().get(i).getScreen());
                                 desc.add(screenlabel);
                                 JLabel resolutionlabel = new JLabel("Resolution: "+Basi.getInstance().getTelevisions().get(i).getResolution());
                                 desc.add(resolutionlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getTelevisions().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getTelevisions().get(k).getBrand(),Basi.getInstance().getTelevisions().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                 break;
                            }
                        
                        }
                }

                });
       
                
                
       
      }
       
       });
       
        printer.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel print_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel print1=new JLabel(new ImageIcon("print1.png"));
                print_photo.add(print1);
                JLabel print2=new JLabel(new ImageIcon("print2.png"));
                print_photo.add(print2);
                JLabel print3=new JLabel(new ImageIcon("print3.png"));
                print_photo.add(print3);
                add(print_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                print1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getPrinters().size(); i++){
                            if("HP".equals(Basi.getInstance().getPrinters().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("HP");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getPrinters().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel sizelabel = new JLabel("Size: "+Basi.getInstance().getPrinters().get(i).getMegethos());
                                 desc.add(sizelabel);
                                 JLabel typelabel = new JLabel("Type: "+Basi.getInstance().getPrinters().get(i).getTipos());
                                 desc.add(typelabel);
                                 JLabel uselabel = new JLabel("Use: "+Basi.getInstance().getPrinters().get(i).getXrhsh());
                                 desc.add(uselabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getPrinters().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getPrinters().get(k).getBrand(),Basi.getInstance().getPrinters().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
                
                print2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getPrinters().size(); i++){
                            if("Sony".equals(Basi.getInstance().getPrinters().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Sony");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getPrinters().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel sizelabel = new JLabel("Size: "+Basi.getInstance().getPrinters().get(i).getMegethos());
                                 desc.add(sizelabel);
                                 JLabel typelabel = new JLabel("Type: "+Basi.getInstance().getPrinters().get(i).getTipos());
                                 desc.add(typelabel);
                                 JLabel uselabel = new JLabel("Use: "+Basi.getInstance().getPrinters().get(i).getXrhsh());
                                 desc.add(uselabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getPrinters().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getPrinters().get(k).getBrand(),Basi.getInstance().getPrinters().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
       
       
                print3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getPrinters().size(); i++){
                            if("Panasonic".equals(Basi.getInstance().getPrinters().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Panasonic");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getPrinters().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel sizelabel = new JLabel("Size: "+Basi.getInstance().getPrinters().get(i).getMegethos());
                                 desc.add(sizelabel);
                                 JLabel typelabel = new JLabel("Type: "+Basi.getInstance().getPrinters().get(i).getTipos());
                                 desc.add(typelabel);
                                 JLabel uselabel = new JLabel("Use: "+Basi.getInstance().getPrinters().get(i).getXrhsh());
                                 desc.add(uselabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getPrinters().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getPrinters().get(k).getBrand(),Basi.getInstance().getPrinters().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
       
       
            }
        });
       
       camera.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel camera_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel cam1=new JLabel(new ImageIcon("cam1.png"));
                camera_photo.add(cam1);
                JLabel cam2=new JLabel(new ImageIcon("cam2.png"));
                camera_photo.add(cam2);
                JLabel cam3=new JLabel(new ImageIcon("cam3.png"));
                camera_photo.add(cam3);
                add(camera_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                cam1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getCamera().size(); i++){
                            if("Sony".equals(Basi.getInstance().getCamera().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Sony");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getCamera().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel colorlabel = new JLabel("Color: "+Basi.getInstance().getCamera().get(i).getColor());
                                 desc.add(colorlabel);
                                 JLabel MPlabel = new JLabel("MP: "+Basi.getInstance().getCamera().get(i).getMP());
                                 desc.add(MPlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getCamera().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getCamera().get(k).getBrand(),Basi.getInstance().getCamera().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
                
               cam2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getCamera().size(); i++){
                            if("HP".equals(Basi.getInstance().getCamera().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("HP");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getCamera().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel colorlabel = new JLabel("Color: "+Basi.getInstance().getCamera().get(i).getColor());
                                 desc.add(colorlabel);
                                 JLabel MPlabel = new JLabel("MP: "+Basi.getInstance().getCamera().get(i).getMP());
                                 desc.add(MPlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getCamera().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getCamera().get(k).getBrand(),Basi.getInstance().getCamera().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
       
       
               cam3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getCamera().size(); i++){
                            if("Panasonic".equals(Basi.getInstance().getCamera().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Panasonic");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getCamera().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel colorlabel = new JLabel("Color: "+Basi.getInstance().getCamera().get(i).getColor());
                                 desc.add(colorlabel);
                                 JLabel MPlabel = new JLabel("MP: "+Basi.getInstance().getCamera().get(i).getMP());
                                 desc.add(MPlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getCamera().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getCamera().get(k).getBrand(),Basi.getInstance().getCamera().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
               
            }
        });
       
       speakers.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
            {
                getContentPane().removeAll();
                JPanel speaker_photo = new JPanel(new GridLayout(1,3,50,50));
                JLabel speak1=new JLabel(new ImageIcon("speak1.png"));
                speaker_photo.add(speak1);
                JLabel speak2=new JLabel(new ImageIcon("speak2.png"));
                speaker_photo.add(speak2);
                JLabel speak3=new JLabel(new ImageIcon("speak3.png"));
                speaker_photo.add(speak3);
                add(speaker_photo,BorderLayout.CENTER);
                add(options,BorderLayout.LINE_START);
                setVisible(true);
                
                speak1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSpeakers().size(); i++){
                            if("logitech".equals(Basi.getInstance().getSpeakers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("logitech");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getSpeakers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel wattlabel = new JLabel("Watt: "+Basi.getInstance().getSpeakers().get(i).getWatt());
                                 desc.add(wattlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSpeakers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSpeakers().get(k).getBrand(),Basi.getInstance().getSpeakers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
                
               speak2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSpeakers().size(); i++){
                            if("Sony".equals(Basi.getInstance().getSpeakers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Sony");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getSpeakers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel wattlabel = new JLabel("Watt: "+Basi.getInstance().getSpeakers().get(i).getWatt());
                                 desc.add(wattlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSpeakers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSpeakers().get(k).getBrand(),Basi.getInstance().getSpeakers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
       
       
               speak3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    
                        for(int i=0; i<Basi.getInstance().getSpeakers().size(); i++){
                            if("Philips".equals(Basi.getInstance().getSpeakers().get(i).getBrand())){
                                JFrame perigrafi = new JFrame();
                                perigrafi.setTitle("Philips");
                                perigrafi.setSize(650 ,250);
                                perigrafi.setLocationRelativeTo(null);
                                perigrafi.setResizable(true);
                                setDefaultCloseOperation(perigrafi.EXIT_ON_CLOSE); 
                               
                                perigrafi.setLayout(new BorderLayout(5,5));
                                 
                                 JPanel desc = new JPanel(new GridLayout(3,3));
                                 JLabel brandlabel = new JLabel("Brand: "+Basi.getInstance().getSpeakers().get(i).getBrand());
                                 desc.add(brandlabel);
                                 JLabel wattlabel = new JLabel("Watt: "+Basi.getInstance().getSpeakers().get(i).getWatt());
                                 desc.add(wattlabel);
                                 JLabel pricelabel = new JLabel("Price: "+Basi.getInstance().getSpeakers().get(i).getPrice());
                                 desc.add(pricelabel);
                                 JButton buy = new JButton("Add to cart");
                                 perigrafi.add(buy,BorderLayout.PAGE_END);
                                 perigrafi.add(desc,BorderLayout.CENTER);
                                 perigrafi.setVisible(true);
                                 final int k = i;
                                 buy.addActionListener(new ActionListener(){

                                    
                                    public void actionPerformed(ActionEvent ae) {
                                      Cart j = new Cart(Basi.getInstance().getSpeakers().get(k).getBrand(),Basi.getInstance().getSpeakers().get(k).getPrice());  
                                      Basi.getInstance().getCart().add(j);
                                    
                                    
                                    
                                    }
                                 
                                 
                                 
                                 
                                 });
                                         break;
                            }
                        
                        }
                }

                });
               
            }
        });
       setVisible(true);
    

    }
}
                
               