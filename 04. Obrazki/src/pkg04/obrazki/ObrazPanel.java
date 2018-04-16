/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.obrazki;

import java.awt.*;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 *
 * @author Dell E5510
 */
public class ObrazPanel extends JPanel{
    
    private BufferedImage image;
    
    public ObrazPanel(){
        super();
        File imageFile = new File("java.jpg");
        
        try{//czttanie obrazka z pliku "imageFile"
            image = ImageIO.read(imageFile);
        } catch (IOException e){
            System.err.println("Blad odczytu obrazka");
            e.printStackTrace();
        }
        
        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);
           
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(image, 0, 0, this);
    }
    
}
