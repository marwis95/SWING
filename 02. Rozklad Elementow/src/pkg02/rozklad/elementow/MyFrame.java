/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.rozklad.elementow;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){ //konstruktor klasy MyFrame
        super("My Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(300, 100);
        setLocation(50, 50);
        
        //setLayout(new FlowLayout());
        setLayout(new GridLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        
        setVisible(true);
        
    }
    
}
