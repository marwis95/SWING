/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pola.tekstowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Dell E5510
 */
public class LoginListener implements ActionListener{
    
    private final JFrame frame; //main program
    private LoginPanel loginPanel; //logowanie
    
    public void setPanel(LoginPanel loginPanel){
        this.loginPanel = loginPanel;
    }
    
    public LoginListener(JFrame frame){
        this.frame = frame;
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Main");
    }
    
    
}
