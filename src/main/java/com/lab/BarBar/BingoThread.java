/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.BarBar;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author dennesshen
 */
public class BingoThread extends Thread{
    private JLabel label;
    private static ImageIcon[] icons;
    public static Boolean play;

    public BingoThread(JLabel label, ImageIcon[] icons) {
        this.label = label;
        this.icons = icons;
    }

    @Override
    public void run() {
         Random r = new Random();
         while(play){
             int n = r.nextInt(icons.length);
             label.setIcon(icons[n]);
             try {
                 Thread.sleep(10);
             } catch (Exception e) {
             }
         }
         
    }
    
    
    
}
