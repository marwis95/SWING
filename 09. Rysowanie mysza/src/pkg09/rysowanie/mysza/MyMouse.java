/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.rysowanie.mysza;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import java.util.ArrayList;

/**
 *
 * @author Dell E5510
 */
public class MyMouse extends JPanel implements MouseListener, MouseMotionListener{
    
    private static final int width = 800;
    private static final int height = 600;
    private int x, y;
    
    ArrayList<Point> points = new ArrayList<Point>();
    
    public MyMouse(){
        addMouseListener(this);
        addMouseMotionListener(this);
        setPreferredSize(new Dimension(width, height));
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        points.add(new Point(x, y));
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.BLACK);
        drawRectangles(g2d);
    }
    
    private void drawRectangles(Graphics2D g2d){
        int x, y;
        
        for(Point p : points){
            x = (int) p.getX();
            y = (int) p.getY();
            g2d.fillRect(x, y, 50, 50);
        }
        
    }
    
}
