/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day30;

import java.util.stream.IntStream;
import java.util.stream.Stream;
//10^5無Parallel 2.415 s 有1.659 s ，10^10
public class ParallelExample5 {
    public static void main(String[] args) {
        int x = (int)Math.pow(10, 7);
        long count = Stream.iterate(0, n -> n+1)
                .limit(x)
                .parallel()
                .filter(t -> isPrime(t))
                .sequential()
                .peek(t ->System.out.println(t))
                .count();
        
        System.out.println("count："+count);
    }

    public static boolean isPrime(int x) {
        if(x<=1) return false;
        
        return !IntStream.rangeClosed(2, (int)Math.sqrt((double)x) ).anyMatch(i -> x % i ==0);
        
        
    }

}


//倒數計時器
//Febonacci java8處理