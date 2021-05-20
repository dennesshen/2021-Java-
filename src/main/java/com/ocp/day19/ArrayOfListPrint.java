/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.ArrayList;
import java.util.stream.Stream;


public class ArrayOfListPrint {
    public static void main(String[] args) {
        ArrayList<Integer [] > list = new ArrayList<>();
        
        Integer[] a = {1,2,3};
        Integer[] b = {4,5,6};  
        
        list.add(a);
        list.add(b);
        //  為什麼不能        list.add({1,2,3});
        
        arrayPrint(list.get(0));
        list.stream().forEach(t -> arrayPrint(t));    
    }
    
    
    public static void arrayPrint(Integer[] array ) {
        System.out.print("[");
        for (int i = 0; i < array.length ; i++) {
            if(i != (array.length-1)){
                System.out.print(array[i]+",");
            }else{
                System.out.print(array[i]);

            }
        }
        
        System.out.print("]");

        
        
        
    }
    
    
}
