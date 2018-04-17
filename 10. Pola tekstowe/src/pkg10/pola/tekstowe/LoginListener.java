/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pola.tekstowe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
    public void actionPerformed(ActionEvent event) {
        String name = loginPanel.getName();
        String password = loginPanel.getPassword();
        if (Validator.auth(name, password)) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // panel z edytorem html
                    JPanel htmlPanel = new HTMLPanel();
                    // usuwamy panel logowania
                    frame.getContentPane().removeAll();
                    // dodajemy panel html i odświeżamy widok
                    frame.add(htmlPanel);
                    frame.validate();
                }
            });
        }
    }
}
