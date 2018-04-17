/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.przyciski.cwiczenie;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
    
        super("Przyciski");
        JPanel buttons = new ButtonPanel();
        add(buttons);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        
    }
}
