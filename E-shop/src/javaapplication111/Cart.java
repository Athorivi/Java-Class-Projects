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
public class Cart {
    private String product;
    private float price;
    
    public Cart(String product,float price){
        this.product=product;
        this.price=price;
    }
    
    public String getProduct()
    {
        return product;
    }    

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    
    public void setCart(String product){
        this.product=product;
    }
}
