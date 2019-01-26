package gr.teicrete.brickbreaker.gui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame {

    private final Brick[][] br;
    JPanel panel;

    public Board() {
        panel = new JPanel();
        br = new Brick[14][14];

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                br[i][j] = new Brick();
                panel.add(br[i][j].getBrick());
            }
        }
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(14, 14, 0, 0));
        add(panel);
        setVisible(true);

    }

    public boolean getVisited(int i, int j) {
        return br[i][j].getVisited();
    }
 
    public void setVisited(int i, int j, boolean visited) {
        br[i][j].setVisited(visited);
    }

    public JButton getIndex(int i, int j) {
        return br[i][j].getBrick();
    }

    public Color getColor(int i, int j) {
        return br[i][j].getColor();
    }
}
