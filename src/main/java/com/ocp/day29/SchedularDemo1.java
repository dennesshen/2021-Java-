/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day29;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author dennesshen
 */
public class SchedularDemo1 {

    public static void main(String[] args) throws Exception {
        int amount = new Random().nextInt(100000);
        System.out.printf("匯款 %d 元\n", amount);

        Callable<Integer> callable = () -> amount;

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> future = service.schedule(callable, 3, TimeUnit.SECONDS);

        System.out.printf("得到$%d元\n", future.get());
        service.shutdown() ;

    }

    //倒數計時器ˋ
}
