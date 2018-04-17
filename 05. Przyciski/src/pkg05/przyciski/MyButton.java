/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.przyciski;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Dell E5510
 */
public class MyButton extends JButton implements ActionListener{

    
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Pressed");
    }
}
