
/**
 * For my project I am planning to recreate the classic game snake in Java. 
 * Snake is the common name for a video game concept where the player maneuvers a line which grows in length, 
 * with the line itself being a primary obstacle.
 *
 * @author Ashwin Ellis
 * @version 20/05/2021 Version 1
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class snakeGame extends JFrame
{
    
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    JMenu menu2;
    
    public snakeGame()
    {

        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menu = new JMenu("A Menu");
        menuBar.add(menu);
        
        menu2 = new JMenu("Another Menu");
        menuBar.add(menu2);
        
        menuItem=new JMenuItem("First menu item");
        menu.add(menuItem);
        
        menuItem=new JMenuItem("Second menu item");
        menu.add(menuItem);
        
        menuItem=new JMenuItem("First menu item");
        menu2.add(menuItem);
        
        menuItem=new JMenuItem("Second menu item");
        menu2.add(menuItem);
 
        setTitle("Title");

        this.getContentPane().setPreferredSize(new Dimension(400,600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.toFront();
        this.setVisible(true);   
        
    }
}
