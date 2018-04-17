/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.przyciski.cwiczenie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class ButtonPanel extends JPanel{
    
    public static final int height = 100;
    public static final int width = 300;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton redButton2;
    
    private JPanel buttonPanel;
    
    public ButtonPanel(){
        buttonPanel = this;
        greenButton = new GreenButton();
        blueButton = new BlueButton();
        redButton = new RedButton();
        redButton2 = new RedButton();
        
        
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(width, height));
        add(greenButton);
        add(blueButton);
        add(redButton);
        add(redButton2);
    }
    
    class GreenButton extends JButton implements ActionListener{
    
    GreenButton(){
        super("Green");
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("GREEN");
        buttonPanel.setBackground(Color.GREEN);
    }
    
    }
    
    
    
    class BlueButton extends JButton implements ActionListener{

        public BlueButton() {
        super("Blue");
            addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            Random rand = new Random();
            float r = rand.nextFloat();
            float b = rand.nextFloat();
            float g = rand.nextFloat();
            
            Color color = new Color(r, b, g);
            
            System.out.println("BLUE");
            buttonPanel.setBackground(color);
        }
        
    }
    
    class RedButton extends JButton implements ActionListener{
        
        public RedButton(){
            super("Red");
            addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("RED");
            setText("Wcisniety");
        }
        
    }
    
}
