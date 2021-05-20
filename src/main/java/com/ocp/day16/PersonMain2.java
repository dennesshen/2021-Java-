/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day16;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class PersonMain2 {
    public static void main(String[] args) {
        Person [][] people = {
            {
                new Person("John", 170.0 , 60.0),
                new Person("Mary", 150.0 , 50.0),
                new Person("John", 165.0 , 85.0),
            },//A班
                
            {
                new Person("Bob", 180.0 , 80.0),
                new Person("Jo", 168.0 , 58.0),
            }    
        };
        
        //請印出這五人的ＢＭＩ

        //Stream.of(people).flatMap(p ->Stream.of(p)).forEach(System.out::println);
        ToDoubleFunction<Person> getBMI = p -> p.getW()/Math.pow(p.getH()/100 , 2);
        DoubleUnaryOperator  fBMI = bmi ->Math.round(bmi*100)/100.0;
        
        Stream.of(people).flatMap(p ->Stream.of(p))
                                    .mapToDouble(p -> getBMI.applyAsDouble(p))
                                    .map(fBMI)
                                    .forEach(System.out::println);
        
        
        
        
    }
    
}
