/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("普通任務");
    }

}

class LongTask implements Runnable {

    @Override
    public void run() {
        System.out.println("長任務開始");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
        }
        System.out.println("長任務結束");

    }

}

public class ThreadPoolExecutorDemo2 {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        Future future = service.submit(new Task());
        System.out.println(future.get());

        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new Task());

        System.out.println("任務配置完畢");
        service.shutdown();

        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("還有工作在進行");
        }
        System.out.println("任務完成停止");

    }

}
