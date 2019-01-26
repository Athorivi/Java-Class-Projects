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
public class Computers extends Product {
    private String brand;
    private String cpu ;
    private String ram;
    private String grafics;
    private String screen;
    private String os;

    public Computers(String brand, String cpu,String ram,String grafics,String screen,String os,float price) {
        super(price);
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.grafics = grafics;
        this.screen = screen;
        this.os = os;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCpu() {
        return this.cpu;
    }
    
    public String getRam() {
        return this.ram;
    }
    
    public String getGrafics() {
        return this.grafics;
    }
    
    public String getScreen() {
        return this.screen;
    }
    
    public String getOs() {
        return this.os;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    public void setRam(String ram) {
        this.ram = ram;
    }
    
    public void setGrafics(String grafics) {
        this.grafics = grafics;
    }
    
    public void setScreen(String screen) {
        this.screen = screen;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
}
