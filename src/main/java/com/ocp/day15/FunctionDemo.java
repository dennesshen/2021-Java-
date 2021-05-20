/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day15;


import java.util.function.Consumer;
import java.util.function.Function;


public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] radius = {10, -5 ,15 };
        Consumer<Double> consumer = System.out :: println;
        Function<Integer , Double> function = (t) -> Math.pow(t, 2)*Math.PI;
        print(radius, consumer, function);
    }
    
    public static void print(Integer[] radius,Consumer<Double> consumer,Function<Integer , Double> function) {
        for( Integer r : radius){
            Double area = function.apply(r);
            consumer.accept(area);   
        }
        
    }
}


