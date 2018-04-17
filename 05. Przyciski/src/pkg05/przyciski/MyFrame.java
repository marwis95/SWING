/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.przyciski;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
        super("Przyciski");
        
        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
}
