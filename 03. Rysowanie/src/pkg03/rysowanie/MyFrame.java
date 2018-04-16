/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.rysowanie;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){ //konstruktor klasy MyFrame
        super("Rysowanie");
        JPanel panel = new MyPanel();
        
        add(panel);
        pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
