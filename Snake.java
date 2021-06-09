/**
 * For my project I am planning to recreate the classic game snake in Java. 
 * Snake is the common name for a video game concept where the player maneuvers a line which grows in length, 
 * with the line itself being a primary obstacle.
 *
 * @author Ashwin Ellis
 * @version 21/05/2021 Version 3
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
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Snake extends JFrame{ 
    private final int WINDOWXWIDTH=680;//Determines the width of the window
    private final int WINDOWYHEIGHT=680;//Determines the height of the window
    private final int XWIDTH=680;//Determines the width of the window
    private final int YHEIGHT=680;//Determines the height of the window
    private final int XOFFSET=40;//Determines the border for the width
    private final int YOFFSET=40;//Determines the border for the height
    private final int DOTSIZE=40;//Determines the size of the apple
    
    //Timer Variables
    Timer timer;
    private int DELAY=140;
    
    //Apple Variables
    int appleX;
    int appleY;
    
    //Snake Variables
    int snakeX;
    int snakeY;
    int snakeLength;
    
    //Random variable
    Random random;
    
    //Movement Variables
    boolean leftDirection = false;
    boolean rightDirection = true;
    boolean upDirection = false;
    boolean downDirection = false;
    boolean inGame = true;
    
    //Font variables
    int fontSize=30;
    
    public Snake(){   
        random = new Random();
        this.setTitle("Snake Game");
        this.getContentPane().setPreferredSize(new Dimension(WINDOWXWIDTH,WINDOWYHEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.toFront();
        this.setVisible(true);
        this.pack();
        startGame();
    }
    public void startGame(){
        firstApple();
    }
    public void paint(Graphics g){
        g.setColor(Color.white);  
        g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        g.drawString("Score:"+"0"+"", 35, 30);
        for(int i=0;i<640;i+=40){
            g.drawLine(i+XOFFSET, YOFFSET, i+XOFFSET, 640);
        }
        for(int i=0;i<640;i+=40){
            g.drawLine(XOFFSET, i+YOFFSET, 640, i+XOFFSET);
        }
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, DOTSIZE, DOTSIZE);  
        for(int i=0;i<1;i++){
            int snakeX1 = 5;
            snakeX = snakeX1*DOTSIZE+XOFFSET;
            int snakeY1 = 7;
            snakeY = snakeY1*DOTSIZE+XOFFSET;
        }
        g.setColor(Color.green);
        g.fillOval(snakeX, snakeY, DOTSIZE, DOTSIZE);  
    }
    public void firstApple(){
        for(int i=0;i<1;i++){
            int appleX1 = 9;
            appleX = appleX1*DOTSIZE+XOFFSET;
            int appleY1 = 7;
            appleY = appleY1*DOTSIZE+XOFFSET;
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
}



