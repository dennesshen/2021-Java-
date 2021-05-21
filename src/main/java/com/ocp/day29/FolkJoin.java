/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day29;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {

    private long[] numbers;
    private int to;
    private int from;

    public SumTask(long[] numbers, int from, int to) {
        this.numbers = numbers;
        this.to = to;
        this.from = from;
    }

    @Override
    protected Long compute() {
        if (to - from <= 3) {
            long total = 0;
            for (int i = from; i < to; i++) {
                total += numbers[i];
            }
            System.out.printf("執行Task，from：%d，to：%d，Total：%d\n", from, to, total);
            return total;
        } else {
            int middle = (from + to) / 2;
            System.out.printf("拆分工作：Left from %d to %d\n", from, middle);
            SumTask taskLeft = new SumTask(numbers, from, middle);
            System.out.printf("拆分工作：Right from %d to %d\n", middle, to);
            SumTask taskRight = new SumTask(numbers, middle, to);
            taskLeft.fork();
            taskRight.fork();
            return taskLeft.join()+taskRight.join();
        }

    }

}

public class FolkJoin {
    public static void main(String[] args) {
        long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        ForkJoinPool pool = new ForkJoinPool(4);
        int from = 0; int to = numbers.length;
        long result = pool.invoke(new SumTask(numbers, from, to));
        System.out.println(result);
      
    }

}
