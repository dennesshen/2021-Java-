/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day28;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

/**
 *
 * @author dennesshen
 */
class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }

}

public class ExecutorDemo {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(new Date());
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        MyExecutor exe = new MyExecutor();
        exe.execute(r1);
        exe.execute(r2);

        Executor exe2 = (command) -> new Thread(command).start();
        exe2.execute(r1);
        exe2.execute(r2);
        exe2.execute( ()->System.out.println("停電了") );

    }

}
