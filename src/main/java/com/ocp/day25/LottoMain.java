/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day25;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dennesshen
 */
public class LottoMain {

    public static void main(String[] args) throws ExecutionException {
        FutureTask<Integer> task = new FutureTask<Integer>(new Lotto());
        new Thread(task).start();
        System.out.println("計算中");

        try {
            System.out.println(task.get());
        } catch (InterruptedException ex) {
        }

        System.out.println("結束");

    }

}
