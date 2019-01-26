/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication111;

/**
 *
 * @author George E
 */
public class Product {
    private float price;
    
    public Product(float price){
        this.price=price;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public void setPrice(float price){
        this.price=price;
    }
}
