/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        //我的版本1
        Map<String,Integer> exam = new LinkedHashMap<>();
        exam.put("國文", 100);
        exam.put("數學", 80);
        exam.put("英文", 90);
        exam.put("數學", 81);

        System.out.println(Stream.of(exam.values().toArray()).mapToInt(t ->(int)t).sum());
        
        
        //我的版本2

        
        //老師版本
        Map<String,Integer> exam3 = new LinkedHashMap<>();
        exam3.put("國文", 100);
        exam3.put("數學", 80);
        exam3.put("英文", 90);
        exam3.put("數學", 81);
        
        System.out.println(exam3.entrySet().stream().mapToInt(entry -> entry.getValue()).sum());
        
        //test
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        
        System.out.println(set.stream().mapToInt(t->t).sum());
        
        
        
        
        
    }
    
    
    
    
    
}
