/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day24;

/**
 *
 * @author dennesshen
 */
public class Jobs implements Runnable{
    Runnable[] runnables ;

    public Jobs(Runnable[] runnables) {
        this.runnables = runnables;
    }
    

    @Override
    public void run() {
        for(Runnable r : runnables){
            new Thread(r).start();
            r.run();
        }
        
    }
    
    
}
