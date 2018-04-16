/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.rysowanie;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Dell E5510
 */
public class MyPanel extends JPanel{
    public MyPanel(){
        setPreferredSize(new Dimension(400, 400));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        
        //Sposób 1
        //g2d.drawRect(10, 10, 380, 380);
        //g2d.drawOval(10, 10, 380, 380);
        
        //Sposób 2
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 380, 380);
        Ellipse2D ellipse = new Ellipse2D.Double(10, 10, 380, 380);
        
        g2d.draw(rectangle);
        g2d.draw(ellipse);
        
    }
    
}
