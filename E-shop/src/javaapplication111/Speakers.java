/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

/**
 *
 * @author admin
 */
public class Speakers extends Product{
    private String brand;
    private int watt;

    public Speakers(String brand, int watt, float price) {
        super(price);
        this.brand = brand;
        this.watt = watt;
    }

    public String getBrand() {
        return brand;
    }

    public int getWatt() {
        return watt;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    
    
    
    
    
    
}
