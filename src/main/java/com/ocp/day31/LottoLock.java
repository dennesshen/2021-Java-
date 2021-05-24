/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day31;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 *
 * @author dennesshen
 */
public class LottoLock implements Runnable {

    private String userName;
    private static final ReentrantLock Lock = new ReentrantLock();

    public LottoLock(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        try {
            Lock.lock();
            IntStream.rangeClosed(1, 5)
                    .forEach(t -> {
                        try {
                            Thread.sleep(3000);
                        } catch (Exception e) {
                        }
                        int number = new Random().nextInt(10);
                        System.err.printf("%s得到第%d組號碼：%d，時間：%s\n", userName, t, number, new Date().toString());
                    }
                    );
        } catch (Exception e) {

        } finally {
            Lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService service =Executors.newCachedThreadPool();
        service.execute( new LottoLock("Vincent") );
        service.execute( new LottoLock("Anita") );
        service.shutdown();
        
    }
    
    
    
    
}
