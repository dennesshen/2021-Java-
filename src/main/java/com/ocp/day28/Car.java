/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author dennesshen
 */
public class Car extends Thread {

    private CyclicBarrier cb;
    private String name;

    public Car(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        String tname = Thread.currentThread().getName();
        System.out.printf("%s從台北出發\n", tname);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s到台中了\n", tname);
            cb.await(10,TimeUnit.SECONDS);
        } catch (Exception e) {
        }
        System.out.printf("%s繼續往高雄出發\n", tname);

    }

}
