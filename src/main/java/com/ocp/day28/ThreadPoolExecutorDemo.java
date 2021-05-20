/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;//???????

class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        return new Random().nextInt(100);
        
    }
    
}


public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("請給我Lotto數字");
        ExecutorService service = Executors.newCachedThreadPool();//???????之間的關係是什麼??
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf("第%d組 計算中\n",i);
            Future future = service.submit(new Lotto());
            System.out.println(future.get());
            
            service.shutdown();
            
        }
        
        
        
        
    }
}
