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
    final int YHEIGHT=700;
    public Snake(){
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        menuBar.add(Box.createRigidArea(new Dimension(100,25)));
      
        menu = new JMenu("A Menu");
        menuBar.add(menu);
        
        setTitle("Snake Game");
        this.getContentPane().setPreferredSize(new Dimension(XWIDTH,YHEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        final int YOFFSET=32;
        final int BORDERWIDTH=50;
        
        g.setColor(Color.black);
        g.fillRect(50,50+YOFFSET,XWIDTH-100,YHEIGHT-100);
        g.setColor(Color.white);
        for(int i=50;i<YHEIGHT;i+=50){
            g.drawLine(i,50+YOFFSET,i,YHEIGHT-100);//draw a vertical line
        }
        for(int i=50;i<750;i+=50){
            g.drawLine(50, i, 550, i);
        }
    }
     public void newApple(){
        int appleXGrid = random.nextInt(15);
        appleX = appleXGrid*DOTSIZE+XOFFSET;
        int appleYGrid = random.nextInt(15);
        appleY = appleYGrid*DOTSIZE+YOFFSET;       
    }
    public void gameOver(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize)); 
        g.drawString("Game Over", 300, 300);
    }
}+
}


