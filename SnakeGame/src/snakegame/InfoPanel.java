/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import snakegame.Squares.LadderSquare;
import snakegame.Squares.SnakeSquare;


public class InfoPanel extends JPanel {

    static public String EPIPEDO;
    static int GOODSQUARES;
    static int BADSQUARES;
    public static Player PLAYER_TO_MOVE;
    private JButton nextMoveBnt;
    private JLabel zariLabel;
    private JLabel seiraLabel;
    public static JTextArea infoArea = new JTextArea();
    public static int move_num = 1;
    public static boolean luckyMove = false;


    
    public InfoPanel() {
        PLAYER_TO_MOVE = IntroFrame.PLAYER;

        nextMoveBnt = new JButton("Ρίξε Ζά�?ι");
        zariLabel = new JLabel(new ImageIcon(""));
        seiraLabel = new JLabel("Σει�?ά έχει ο/η: " + PLAYER_TO_MOVE.getOnoma());

        this.setLayout(new BorderLayout());

        JPanel mainInfo = new JPanel(new GridLayout(2, 2));
        mainInfo.add(new JLabel("�?νομα Παίκτη :"));
        mainInfo.add(new JLabel(IntroFrame.PLAYER.getOnoma()));
        mainInfo.add(new JLabel("Επίπεδο :"));
        mainInfo.add(new JLabel(InfoPanel.EPIPEDO));

        this.add(mainInfo, BorderLayout.PAGE_START);

        JPanel movementPanel = new JPanel(new GridLayout(3, 1));
        movementPanel.add(seiraLabel);
        movementPanel.add(zariLabel);
        movementPanel.add(nextMoveBnt);

        this.add(movementPanel, BorderLayout.PAGE_END);

        JScrollPane sp = new JScrollPane(infoArea);
        this.add(sp, BorderLayout.CENTER);

        switch (InfoPanel.EPIPEDO) {
            case "Easy":
                GOODSQUARES = 40;
                BADSQUARES = 5;
                break;
            case "Normal":
                GOODSQUARES = 30;
                BADSQUARES = 8;
                break;
            case "Hard":
                GOODSQUARES = 20;
                BADSQUARES = 15;
                break;
        }

        nextMoveBnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Random rand = new Random();
                int n = rand.nextInt(6) + 1;

                zariLabel.setIcon(new ImageIcon("icons/" + n + ".png"));
                zariLabel.invalidate();
                
                if (luckyMove) {
                    luckyMove = false;
                    if (n == 6) {
                        System.out.println("kerdise o " + PLAYER_TO_MOVE);
                        return;
                    }
                }

                if (PLAYER_TO_MOVE.isIsMovingReverse()) {
                        n = -n;
                }
                if (PLAYER_TO_MOVE.isIsMovingReverse() && (PLAYER_TO_MOVE.getCurrentNum() + n) <= 0) {
                    PLAYER_TO_MOVE.setIsMovingReverse(false);
                }
                
                if (!PLAYER_TO_MOVE.isCanUseLadder()) {
                    n = (int)n/2;
                }
                
                if (PLAYER_TO_MOVE.getCurrentNum() + n == 99) {
                    final JOptionPane optionPane = new JOptionPane( "Winner is +"+PLAYER_TO_MOVE.getOnoma()+"\n",JOptionPane.INFORMATION_MESSAGE,JOptionPane.OK_OPTION);
                }
                
                if (PLAYER_TO_MOVE.getCurrentNum() + n > 99) {
                    infoArea.append((move_num++) + ") Δεν μπο�?εί να τε�?ματήσει \n");
                    return;
                }

                if (PLAYER_TO_MOVE == IntroFrame.PLAYER) {
                    
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum() + n].add(PLAYER_TO_MOVE, BorderLayout.LINE_START);
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum()].repaint();
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum() + n].repaint();

                    infoArea.append((move_num++) + ") �?ετακίνηση " + PLAYER_TO_MOVE.getOnoma() + " απ�? " + (PLAYER_TO_MOVE.getCurrentNum() + 1) + " σε " + (PLAYER_TO_MOVE.getCurrentNum() + n + 1) + "\n");
                    PLAYER_TO_MOVE.setCurrentNum(PLAYER_TO_MOVE.getCurrentNum() + n);

                    PLAYER_TO_MOVE = IntroFrame.PC;

                    MainBoard.SQUARES[IntroFrame.PLAYER.getCurrentNum()].specialAction(IntroFrame.PLAYER);

                } else if (PLAYER_TO_MOVE == IntroFrame.PC) {
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum() + n].add(PLAYER_TO_MOVE, BorderLayout.LINE_END);
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum()].repaint();
                    MainBoard.SQUARES[PLAYER_TO_MOVE.getCurrentNum() + n].repaint();

                    infoArea.append((move_num++) + ") �?ετακίνηση " + PLAYER_TO_MOVE.getOnoma() + " απ�? " + (PLAYER_TO_MOVE.getCurrentNum() + 1) + " σε " + (PLAYER_TO_MOVE.getCurrentNum() + n + 1) + "\n");
                    PLAYER_TO_MOVE.setCurrentNum(PLAYER_TO_MOVE.getCurrentNum() + n);

                    PLAYER_TO_MOVE = IntroFrame.PLAYER;

                    MainBoard.SQUARES[IntroFrame.PC.getCurrentNum()].specialAction(IntroFrame.PC);
                }
                seiraLabel.setText("Σει�?ά έχει ο/η: " + PLAYER_TO_MOVE.getOnoma());
                
     
            }
        });
    }

    
}
