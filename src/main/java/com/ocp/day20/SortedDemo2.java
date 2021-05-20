/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author dennesshen
 */
public class SortedDemo2 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(100, 40, 80 , 30 ,90 );
        List<Integer> sortedAntTestList1 = list.stream().filter(t-> t >=60).sorted(Comparator.naturalOrder()).collect(toList());
        List<Integer> sortedAntTestList2 = list.stream().filter(t-> t >=60).sorted(Comparator.reverseOrder()).collect(toList());

        
        System.out.println(sortedAntTestList1);
        System.out.println(sortedAntTestList2);

        
        
        
        
    }
    
    
    
}
