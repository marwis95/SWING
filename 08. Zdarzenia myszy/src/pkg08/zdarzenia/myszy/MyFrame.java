/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.zdarzenia.myszy;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
        
        super("Mouse");
        add(new MyMouse());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        setSize(800, 600);
        
    }
    
}
