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
public class Printers extends Product {
    private String brand;
    private String tipos;
    private String megethos;
    private String  xrhsh;

    public Printers(String brand, String tipos, String megethos, String xrhsh, float price) {
        super(price);
        this.brand=brand;
        this.tipos = tipos;
        this.megethos = megethos;
        this.xrhsh = xrhsh;
    }

    public String getBrand() {
        return brand;
    }

    public String getTipos() {
        return tipos;
    }

    public String getMegethos() {
        return megethos;
    }

    public String getXrhsh() {
        return xrhsh;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    
    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void setMegethos(String megethos) {
        this.megethos = megethos;
    }

    public void setXrhsh(String xrhsh) {
        this.xrhsh = xrhsh;
    }


}
