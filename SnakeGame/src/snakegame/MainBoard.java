/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snakegame.Squares.CancelReverseSquare;
import snakegame.Squares.ExchangeSquare;
import snakegame.Squares.ExplosionSquare;
import snakegame.Squares.GravityReversalSquare;
import snakegame.Squares.LadderSquare;
import snakegame.Squares.LoveSquare;
import snakegame.Squares.LuckySquare;
import snakegame.Squares.RethrowSquare;
import snakegame.Squares.ReverseSquare;
import snakegame.Squares.SimpleSquare;
import snakegame.Squares.SnakeSquare;
import snakegame.Squares.Square;
import snakegame.Squares.TurtelSquare;


public class MainBoard extends JPanel {
    
    public static Square[] SQUARES = new Square[100];
    private int goodSquares = 0;
    private int badSquares = 0;
    private int counter = 99;
    
    public MainBoard(){
        
        //dimiourgia board        
               
        this.setLayout(new GridLayout(10, 10));
        
        for (int i = 0; i < 10; i++) {
            if ((counter+1) % 10 == 0) {
                System.out.println("sto i "+i+" kathari dieresi");
                for (int j = 0; j < 10; j++) {
                    Square p = pickSquare(counter);
                    this.SQUARES[counter] = p;
                    System.out.println(counter);
                    counter--;
                //p.add(new Button(i+" "+j));
                    this.add(p);
                }
                counter++;
            } else {
               
                for (int j = 0; j < 10; j++) {
                    Square p = pickSquare(counter);
                    this.SQUARES[counter] = p;
                    System.out.println(counter + " "+ i + " "+j);
                    counter++;
                    this.add(p);
                }
                counter--;
            }
             counter -= 10;
        }
        //end dimiourgia board
        
        
        this.SQUARES[10].add(IntroFrame.PLAYER,BorderLayout.LINE_START);
        this.SQUARES[0].add(IntroFrame.PC,BorderLayout.LINE_END);
        
        //this.invalidate();
        SQUARES[0].repaint();
        SQUARES[0].repaint();
        
        
    }
    
    

    public Square pickSquare(int num){
        Square square;
        Random rand = new Random();
        int  n = rand.nextInt(12);
        
        //to proto square na einai panta aplo
        if (num==54)
            return new SnakeSquare(num);
        if (num == 0 || num == 99) {
            return new SimpleSquare(num);
        }
        

        ArrayList<Integer> goodList = new ArrayList<>();
        goodList.add(1);
        goodList.add(6);
        goodList.add(7);
        goodList.add(10);
        goodList.add(12);
        ArrayList<Integer> badList = new ArrayList<>();
        badList.add(2);
        badList.add(3);
        badList.add(4);
        badList.add(5);
        badList.add(8);
        badList.add(9);
        badList.add(11);
        
        
        while (this.goodSquares >= InfoPanel.GOODSQUARES && goodList.contains(n)) {
            n = rand.nextInt(12);
        }
        
        while (this.badSquares >= InfoPanel.BADSQUARES && badList.contains(n)) {
            n = rand.nextInt(12);
        }
        
        switch(n){
            case 0:
                square = new SimpleSquare(num);
                break;
            case 1:
                square = new LadderSquare(num);
                this.goodSquares++;
                break;
            case 2:
                square = new SnakeSquare(num);
                this.badSquares++;
                break;
            case 3:
                square = new ExplosionSquare(num);
                this.badSquares++;
                break;
            case 4:
                square = new LoveSquare(num);
                this.badSquares++;
                break;
            case 5:
                square = new ExchangeSquare(num);
                this.badSquares++;
                break;
            case 6:
                square = new RethrowSquare(num);
                this.goodSquares++;
                break;
            case 7:
                square = new LuckySquare(num);
                this.goodSquares++;
                break;
            case 8:
                square = new GravityReversalSquare(num);
                this.badSquares++;
                break;
            case 9:
                square = new ReverseSquare(num);
                this.badSquares++;
                break;
            case 10:
                square = new CancelReverseSquare(num);
                this.goodSquares++;
                break;
            case 11:
                square = new TurtelSquare(num);
                this.badSquares++;
                break;
            case 12:
                square = new CancelReverseSquare(num);
                this.goodSquares++;
                break;
            default:
                square = null;
                break;
        }
        
        return square;
    }
        

}
