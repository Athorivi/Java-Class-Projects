/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

import java.util.ArrayList;

/**
 *
 * @author CrAsH
 */
/*
edo ine i basi opou apothikevoume ta proionta kai tous users ana katigoria
ksexorista ta computer , smartphones kai televisions
*/
public class Basi {

    private static Basi instance;
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Computers> computers = new ArrayList<Computers>();
    private ArrayList<Smartphones> smartphones = new ArrayList<Smartphones>();
    private ArrayList<Televisions> televisions = new ArrayList<Televisions>();
    private ArrayList<Printers> printers = new ArrayList<Printers>();
    private ArrayList<Camera> camera = new ArrayList<Camera>();
    private ArrayList<Speakers> speakers = new ArrayList<Speakers>();
    private ArrayList<Cart> cart = new ArrayList<Cart>();
    private ArrayList<User> currentuser = new ArrayList<User>();

    public static Basi getInstance() {
        if (instance == null) {
            instance = new Basi();
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Computers> getComputers() {
        return computers;
    }
    
    public ArrayList<Smartphones> getSmartphones() {
        return smartphones;
    }
    
    
    public ArrayList<Televisions> getTelevisions() {
        return televisions;
    }
    
    public ArrayList<Printers> getPrinters() {
        return printers;
    }
    
    public ArrayList<Camera> getCamera() {
        return camera;
    }
    
    public ArrayList<Speakers> getSpeakers() {
        return speakers;
    }
    
    public ArrayList<Cart> getCart(){
        return cart;
    }
    
    public ArrayList<User> getCurrentuser(){
        return currentuser;
    }

}
