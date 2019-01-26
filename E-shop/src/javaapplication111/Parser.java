/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CrAsH
 */
/*
diavazoume ta arxia mas kai fortonoume ta dedomena stin vasi klasi Basi.java
*/
public class Parser {

    public Parser() {
        parseUsers();
        parseProionta();
    }
    
    /*
    diavasma users
    */
    private void parseUsers(){
     try {
                FileInputStream inputStream= new FileInputStream("users.txt");
                BufferedReader r = new BufferedReader (new InputStreamReader(inputStream));
                
                String temp;
                while((temp=r.readLine()) != null){
                String[] var = temp.split("-");
                
                User u = new User(var[0], var[1], var[2]);
                Basi.getInstance().getUsers().add(u);
                
    }
    
     }  catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    /*
    diavasma proionton kai ksexorismos ana katigoria
    */
    private void parseProionta(){
        try {
                FileInputStream inputStream= new FileInputStream("proionta.txt");
                BufferedReader k = new BufferedReader (new InputStreamReader(inputStream));
                
                String temp;
                while((temp=k.readLine()) != null){
                String[] var = temp.split("@@");
                
                if("computer".equals(var[0])){
                    Float price = Float.parseFloat(var[7]);
                    Computers j = new Computers(var[1], var[2], var[3],var[4], var[5], var[6], price);
                    Basi.getInstance().getComputers().add(j);
                }
                if("smartphone".equals(var[0])){
                    Float price = Float.parseFloat(var[5]);
                    Smartphones j = new Smartphones(var[1], var[2], var[3],var[4], price);
                    Basi.getInstance().getSmartphones().add(j);
                }
                if("television".equals(var[0])){
                    Float price = Float.parseFloat(var[4]);
                    Televisions j = new Televisions(var[1], var[2], var[3], price);
                    Basi.getInstance().getTelevisions().add(j);
                }
                if("printer".equals(var[0])){
                    Float price = Float.parseFloat(var[5]);
                    Printers j = new Printers(var[1], var[2], var[3],var[4], price);
                    Basi.getInstance().getPrinters().add(j);
                }
                if("camera".equals(var[0])){
                    Float price = Float.parseFloat(var[4]);
                    Camera j = new Camera(var[1], var[2], Integer.parseInt(var[3]), price);
                    Basi.getInstance().getCamera().add(j);
                }
                if("speaker".equals(var[0])){
                    Float price = Float.parseFloat(var[3]);
                    Speakers j = new Speakers(var[1], Integer.parseInt(var[2]), price);
                    Basi.getInstance().getSpeakers().add(j);
                }
                
    }
    
     }  catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
