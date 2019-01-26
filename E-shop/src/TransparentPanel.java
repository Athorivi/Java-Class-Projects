import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author admin
 */
public class TransparentPanel extends JFrame
{
JPanel p1,p2;

    public TransparentPanel()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        // Set title and default close operation
        setTitle("Transparent Panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Set a background for JFrame
        setContentPane(new JLabel(new ImageIcon("eshop1.jpg")));
        
        // Set some layout, say FlowLayout
        setLayout(new FlowLayout());
        
        
        // Create a JPanel
        p1=new JPanel();
        
        // Set the background, black with 125 as alpha value
        // This is less transparent
        p1.setBackground(new Color(0,0,0,125));
        
        // Create another JPanel
        p2=new JPanel();
        
        // This is more transparent than the previous
        // one
        p2.setBackground(new Color(0,0,0,65));
        
        // Set some size to the panels
        p1.setPreferredSize(new Dimension(250,150));
        p2.setPreferredSize(new Dimension(250,150));
        
        // Add the panels to the JFrame
        add(p1);
        add(p2);
        
        // Set the size of the JFrame and
        // make it visible
        setSize(600,400);
        setVisible(true);
    }
    
    
    
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

