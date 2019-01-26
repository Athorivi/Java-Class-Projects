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
public class Smartphones extends Product {
    private String brand;
    private String cpu;
    private String ram;
    private String screen;
    
    public Smartphones(String brand, String cpu, String ram, String screen, float price){
        super(price);
        this.brand=brand;
        this.cpu=cpu;
        this.ram=ram;
        this.screen=screen;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public String getCpu(){
        return this.cpu;
    }
    
    public String getRam(){
        return this.ram;
    }
    
    public String getScreen(){
        return this.screen;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setCpu(String cpu){
        this.cpu=cpu;
    }
    
    public void setRam(String ram){
        this.ram=ram;
    }
    
    public void setScreen(String screen){
        this.screen=screen;
    }
    
}
