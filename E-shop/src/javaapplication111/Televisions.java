/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

/**
 *
 * @author CrAsH
 */
public class Televisions extends Product {
    private String brand;
    private String screen;
    private String resolution;
    
    public Televisions(String brand, String screen, String resolution, float price){
        super(price);
        this.brand=brand;
        this.screen=screen;
        this.resolution=resolution;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public String getScreen(){
        return this.screen;
    }
    
    public String getResolution(){
        return this.resolution;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setScreen(String screem){
        this.screen=screen;
    }
    
    public void setResolution(String resolution){
        this.resolution=resolution;
    }
    
}
