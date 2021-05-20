/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortedDemo {
    public static void main(String[] args) {
        
        
        List<Integer> list = Arrays.asList(100,80,90);
        System.out.println(list);
        
        //排序(自然排序 : 小到大)
        
        Collections.sort(list);
        System.out.println(list);
        
        
        
         //排序(大到小)
         Collections.sort(list, new Comparator<Integer>(){
            
             @Override
            public int compare(Integer o1, Integer o2) {
                     return o2-o1;
            }
            });

        System.out.println(list);
        
        
        
        Collections.sort(list,  (o1, o2) -> o1-o2 );

        System.out.println(list);
        
        
                
        Collections.sort(list,  (o1, o2) -> o2-o1 );

        System.out.println(list);
        
        
        
    }
    
    
    
    
    
}
