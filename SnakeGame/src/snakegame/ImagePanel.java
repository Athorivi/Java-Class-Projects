/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {
    
 private final Image img;

  public ImagePanel(String img) {
    this.img = new ImageIcon(img).getImage();
  }

 @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    int x = (this.getWidth() - img.getWidth(null)) / 2;
    int y = (this.getHeight() - img.getHeight(null)) / 2;
    g2d.drawImage(img, x, y, null);
  }
}
