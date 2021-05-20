/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dennesshen
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> exam = new LinkedHashMap<>();
        exam.put("國文", 100);
        exam.put("數學", 80);
        exam.put("英文", 90);
        exam.put("數學", 81);

        Set<String> Keys = exam.keySet();
        System.out.println(Keys);
        
        System.out.println("數學的成績為"+exam.get("數學"));
        Collection<Integer> value = exam.values();
        System.out.println(value);
    }
    
}
