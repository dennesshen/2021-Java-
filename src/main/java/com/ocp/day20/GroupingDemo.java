/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author dennesshen
 */
public class GroupingDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "apple","apple","banana","orange","papaya","orange","apple"
        
        );
        
        Map<String , Long> result = names.stream().collect( Collectors.groupingBy(e ->e , Collectors.counting()  )   );
        
        System.out.println(result);
        
    }
    
}
