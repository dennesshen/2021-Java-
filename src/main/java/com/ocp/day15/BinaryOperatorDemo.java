/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day15;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> Salary = (principleSalary, Bonus ) -> principleSalary+Bonus;
        System.out.println(Salary.apply(5_0000, 1_0000));
        
        Integer [] length = {10,20,30};
        UnaryOperator<Integer> area = (t) -> t*t;
        Stream.of(length).mapToInt(t -> area.apply(t)).forEach(System.out :: println);
        
        
        
        
    }
    
}
