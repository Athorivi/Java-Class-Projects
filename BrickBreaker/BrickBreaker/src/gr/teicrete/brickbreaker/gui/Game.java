package gr.teicrete.brickbreaker.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Game implements ActionListener {

    private final Board board;
    
    int[][] table = new int[14][2];
    

    public Game() {
        board = new Board();
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 2; j++) {
                table[i][j] = -1;
            }
        }
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                board.getIndex(i, j).addActionListener(this);
            }
        }
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        search(temp);
    }

    //searches for the neighbors
    public void search(JButton temp) {

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if (temp == board.getIndex(i, j)) {
                    int x = i;
                    int y = j;
                    board.setVisited(i, j, true);
                    //North
                    if (x > 0 && (board.getColor(i - 1, j) == board.getColor(i, j)) && !board.getVisited(i - 1, j)) {
                        board.panel.remove(board.getIndex(i - 1, j));
                        board.panel.remove(board.getIndex(i, j));
                        search(board.getIndex(i - 1, j));

                       
                    }
                    //South
                    if (x < 13 && (board.getColor(i + 1, j) == board.getColor(i, j)) && !board.getVisited(i + 1, j)) {
                        board.panel.remove(board.getIndex(i, j));
                        board.panel.remove(board.getIndex(i + 1, j));
                        search(board.getIndex(i + 1, j));

                    }
                    //West
                    if (y > 0 && (board.getColor(i, j - 1) == board.getColor(i, j)) && !board.getVisited(i, j - 1)) {
                        board.panel.remove(board.getIndex(i, j));
                        board.panel.remove(board.getIndex(i, j - 1));
                        search(board.getIndex(i, j - 1));

                    }
                    //East
                    if (y < 13 && (board.getColor(i, j + 1) == board.getColor(i, j)) && !board.getVisited(i, j + 1)) {
                        board.panel.remove(board.getIndex(i, j));
                        board.panel.remove(board.getIndex(i, j + 1));
                        search(board.getIndex(i, j + 1));

                    }
                    board.panel.repaint();
                }
            }

        }

    }
}

   