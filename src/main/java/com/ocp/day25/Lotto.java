/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day25;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 *
 * @author dennesshen
 */
public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
        
    }
    
    
}
