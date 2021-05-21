/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day29;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Fibonacci extends RecursiveTask<Integer> {

    final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        } else {
            Fibonacci f1 = new Fibonacci(n - 1);
            Fibonacci f2 = new Fibonacci(n - 2);
            f1.fork();
            f2.fork();
            return f1.join() + f2.join();
        }
    }
}

public class ForkJoinFebonacci {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(10);
        int result = pool.invoke(new Fibonacci(7));
        System.out.println(result);
    }

}
