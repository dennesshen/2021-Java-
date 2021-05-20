/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 *
 * @author dennesshen
 */
public class GroupingDemo3 {
    public static void main(String[] args) {
        
   
        List<Fruit> fruits = Arrays.asList(
                    new Fruit("apple", 10, 9.9),
                    new Fruit("banana", 20, 19.9),
                    new Fruit("orange", 10, 29.9),
                    new Fruit("watermelon", 10, 29.9),
                    new Fruit("papaya", 20, 9.9),
                    new Fruit("apple", 10, 9.9),
                    new Fruit("banana", 10, 19.9),
                    new Fruit("apple", 20, 9.9)
        );

        //相同price來分類

        Map<Double, List<Fruit>> groupingByPrice = fruits.stream().collect(Collectors.groupingBy( Fruit::getPrice));

        System.out.println(groupingByPrice);


         //相同price的是哪些水果
         Map<Double, List<String>> groupingByPrice2 = fruits.stream()
                 .collect(Collectors.groupingBy( Fruit::getPrice, Collectors.mapping(Fruit::getName, toList()) ));

         System.out.println(groupingByPrice2);
    
    
        //相同price的是哪些水果，結果不重複

        Map<Double, Set<String>> groupingByPrice3 = fruits.stream()
                 .collect(Collectors.groupingBy( Fruit::getPrice, Collectors.mapping(Fruit::getName, toSet()) ));

         System.out.println(groupingByPrice3);
    
                }
    
}
