/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.hello.word;

import java.awt.EventQueue;

/**
 *
 * @author Dell E5510
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame(200, 100);
            }
        });
    }
        
 }
    

