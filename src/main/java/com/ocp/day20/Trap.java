/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class Trap {
    public static void main(String[] args) {
        
        Stream.of(10,20,30).forEach(System.out:: println);
        
        Integer [][] a = {{1,2},{3},{1,2,3}};
                
        List<Integer> list1 = Arrays.asList(10, 20 ,30);
        Stream.of(list1).forEach(System.out::println);
        Stream.of(a).forEach(t -> System.out.println(Arrays.toString(t)) );
       
          
    }
    
}
