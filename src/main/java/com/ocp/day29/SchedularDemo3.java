/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day29;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author dennesshen
 */
public class SchedularDemo3 {
     public static void main(String[] args) {
        Runnable r =() -> {
            int delay = new Random().nextInt(3000);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9)+1;
            System.out.printf("開獎號碼：%d，花費時間%.1f，開獎時間：%s\n",n,delay/1000.0, new Date() );
        };
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        int initDelay = 0;
        int delay = 3;
        service.scheduleAtFixedRate(r, initDelay, delay, TimeUnit.SECONDS);
        
                
                
                
                
    }
    
}
