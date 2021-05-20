/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day15;

import java.util.function.Consumer;

/**
 *
 * @author dennesshen
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        int[] radius = {10, -5 ,15 };
        Consumer<Integer> consumer = (t)->System.out.println(t);
        Consumer<Integer> consumer2 = (t)->System.out.print(t+", ");
        Consumer<Integer> consumer3 = System.out :: println;
        print(radius, consumer);
        print(radius, consumer2);
        print(radius, consumer3);
    }
    
    public static void print(int[] radius, Consumer<Integer> consumer) {
        for(Integer r : radius){
            consumer.accept(r);
        }
        
    }
    
}
