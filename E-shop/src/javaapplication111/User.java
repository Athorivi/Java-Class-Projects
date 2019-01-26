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
public class User {

    private String username;
    private String password;
    private String usertype;


    public User() {
    }

    public User(String username, String password,String usertype) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getUsertype() {
        return this.usertype;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setUsertype(String usertype) {
        this.password = usertype;
    }
     
    
}

