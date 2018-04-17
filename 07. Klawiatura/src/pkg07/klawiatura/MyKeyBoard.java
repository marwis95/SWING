/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.klawiatura;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Dell E5510
 */
public class MyKeyBoard extends JFrame implements KeyListener{
    
    private String userInput = "";
    
    public MyKeyBoard(){
        super("Keyboard test");
        
        setPreferredSize(new Dimension(800, 600));
        addKeyListener(this);
        
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
            char c = e.getKeyChar();
            //System.out.println(c);
            check(c);
    }
    
    private void check(char c){
       userInput += c;
        System.out.println(userInput);
        setTitle(userInput);
    }
    
}
