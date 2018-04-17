/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.przyciski;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class ButtonPanel extends JPanel implements ActionListener{
    
    public static final int height = 100;
    public static final int width = 300;
    private JButton greenButton;
    private JButton bluButton;
    private JButton redButton;
    
    public ButtonPanel(){
        
        greenButton = new JButton("Zielony");
        bluButton = new JButton("Niebieski");
        redButton = new JButton("Czerwony");
        
        greenButton.addActionListener(this);
        bluButton.addActionListener(this);
        redButton.addActionListener(this);
        
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(width, height));
        
        //greenButton.setBackground(Color.black);
        
        add(greenButton);
        add(bluButton);
        add(redButton);
        
    }
    
    @Override
        
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
            
        if(source == greenButton){
            setBackground(Color.GREEN);
        }else if(source == bluButton){
            setBackground(Color.BLUE);
        }else if(source == redButton){
            setBackground(Color.RED);
        }
            
            
            
    }
    
}
    
    

