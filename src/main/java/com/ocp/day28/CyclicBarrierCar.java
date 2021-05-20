/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day28;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author dennesshen
 */
public class CyclicBarrierCar {

    public static void main(String[] args) {
        int n = 4;
        Runnable r1 = () -> {
            String tname = Thread.currentThread().getName();
            System.out.printf("%s 說開動,吃飯!\n", tname);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        };

        Runnable r2 = () -> {
            String tname = Thread.currentThread().getName();
            System.out.printf("%s 說吃飯,開動!\n", tname);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        };

        CyclicBarrier cb1 = new CyclicBarrier(n, r1);
        CyclicBarrier cb2 = new CyclicBarrier(3, r2);

        new Car(cb1, "A1").start();
        new Car(cb1, "A2").start();
        new Car(cb1, "A3").start();
        new Car(cb1, "A4").start();

        new Car(cb2, "B1").start();
        new Car(cb2, "B2").start();
        new Car(cb2, "B3").start();
        new Car(cb2, "B4").start();
        new Car(cb2, "B5").start();

    }

}
