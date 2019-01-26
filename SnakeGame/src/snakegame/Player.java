/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import javax.swing.*;


public class Player extends JLabel {
    
    private String onoma;
    private String imgPath;
    private boolean isPlayer;
    private boolean isMovingReverse;
    private boolean canUseLadder;
    private int currentNum;

    public Player()    {
        
    }
    public Player(String onoma, String imgPath, boolean isPlayer, boolean isMovingReverse, boolean canUseLadder, int currentNum) {
        this.onoma = onoma;
        this.imgPath = imgPath;
        this.isPlayer = isPlayer;
        this.isMovingReverse = isMovingReverse;
        this.canUseLadder = canUseLadder;
        this.currentNum = currentNum;
        
        this.setIcon(new ImageIcon("icons/"+imgPath+".png"));
    }
    
    //getters - setter

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public boolean isIsPlayer() {
        return isPlayer;
    }

    public void setIsPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }

    public boolean isIsMovingReverse() {
        return isMovingReverse;
    }

    public void setIsMovingReverse(boolean isMovingReverse) {
        this.isMovingReverse = isMovingReverse;
    }

    public boolean isCanUseLadder() {
        return canUseLadder;
    }

    public void setCanUseLadder(boolean canUseLadder) {
        this.canUseLadder = canUseLadder;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
    
    
    
}
