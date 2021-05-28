/**
 * For my project I am planning to recreate the classic game snake in Java. 
 * Snake is the common name for a video game concept where the player maneuvers a line which grows in length, 
 * with the line itself being a primary obstacle.
 *
 * @author Ashwin Ellis
 * @version 21/05/2021 Version 2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake extends JFrame{ 
    
    JMenuBar menuBar;
    JMenu menu;
    
    final int XWIDTH=700;
    final int YHEIGHT=730;
    public Snake(){
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
      
        menu = new JMenu("A Menu");
        menuBar.add(menu);
        
        setTitle("Snake Game");
        this.getContentPane().setPreferredSize(new Dimension(XWIDTH,YHEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setVisible(true);
    }
    public void paint(Graphics g){
        int xOffset=50;
        int yOffset=70;
        
        g.setColor(Color.black);
        g.fillRect(xOffset,yOffset,XWIDTH-100,YHEIGHT-100);
        g.setColor(Color.white);
        for(int i=50;i<600;i+=50){
            g.drawLine(i+xOffset, yOffset, i+xOffset, YHEIGHT);
        }
        for(int i=50;i<600;i+=50){
            g.drawLine(0, i, 600, i);
        }
    }
}


