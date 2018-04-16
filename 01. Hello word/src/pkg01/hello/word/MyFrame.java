/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.hello.word;

import javax.swing.JFrame;

/**
 *
 * @author Dell E5510
 */
public class MyFrame extends JFrame{
    
    public MyFrame(int x, int y){ //konstruktor klasy MyFrame
        super("Hello word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(x, y);
    }
    
}
