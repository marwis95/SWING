/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pola.tekstowe;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import pkg10.pola.tekstowe.LoginListener;

/**
 *
 * @author Dell E5510
 */
public class LoginPanel extends JPanel{
    
    private JTextField loginField; //nazwa
    private JPasswordField passField; //hasło
    private JButton submitBtn; //submit
    private LoginListener listener; //listener
    
    public String getName(){
        return loginField.getText();
    }//Pobieranie nazwy użytkownika
   
    
    public String getPass(){
        String pass="";
        char[] passChr = passField.getPassword();
        
        for(int i=0; i<passChr.length; i++){
            pass += passChr[i];
        }
        
        return pass;
    }//Pobieranie hasła i konwertowanie na String
    
    
    public LoginPanel(LoginListener loginListener){
        super();
        
        //Ustawianie layoutu
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.fill = GridBagConstraints.CENTER;
        gridBag.setConstraints(this, constraints);
        setLayout(gridBag);
        
        //panel logowania z listenerem
        this.listener = listener;
        this.listener.setPanel(this);
        
        createComponents();
    }
    
    
    private void createComponents(){
        
        JLabel login = new JLabel("Login: ");
        JLabel password = new JLabel("Haslo: ");
        
        //Panel do logowania
        JPanel loginPanel = new JPanel(new GridLayout(2, 2));
        loginPanel.add(login);
        loginPanel.add(loginField);
        loginPanel.add(password);
        loginField.add(passField);
        submitBtn = new JButton("Zaloguj");
        submitBtn.addActionListener(listener);
        
        //Panel pomocniczy
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(loginPanel, BorderLayout.CENTER);
        parentPanel.add(submitBtn, BorderLayout.SOUTH);
        this.add(parentPanel);
        
    }//metoda do tworzenia komponentow
    
}
