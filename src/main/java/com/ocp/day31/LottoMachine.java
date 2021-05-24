/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day31;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 *
 * @author dennesshen
 */
public class LottoMachine implements Callable<Lotto>{
    private int  num;

    public LottoMachine(int num) {
        this.num = num;
        
    }
    

    @Override
    public Lotto call() throws Exception {
        Random r = new Random();
        Thread.sleep(r.nextInt(3000));
        Lotto lotto = new Lotto(num, r.nextInt(10));
        return lotto;
        
    }
    
}
