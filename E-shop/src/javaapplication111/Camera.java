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
public class Camera extends Product{
    private String color;
    private String brand;
    private int MP;

    public Camera(String color, String brand, int MP, float price) {
        super(price);
        this.color = color;
        this.brand = brand;
        this.MP = MP;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMP() {
        return MP;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
    
    
    
    
}
