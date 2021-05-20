/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author dennesshen
 */
public class ArrayListDemo2 {
    //1-5取3個，取後不放回
    public static void main(String[] args) {
        ArrayList<Integer> population = new ArrayList();
        Random r = new Random();
        int topLimit = 5;
        for(int i = 1 ; i < topLimit+1 ; i ++ ){
            population.add(i);
        }
//        System.out.println(population);

        ListIterator<Integer> iter = population.listIterator();
        
        
         Set<Integer>sample = new LinkedHashSet();//?????
         while (sample.size() < 3) {
//             System.out.println(population);
             
             int idx = r.nextInt(population.size());
//             System.out.printf("idx=%d\n",idx );

             Integer spl = population.get(idx);
//             System.out.printf("spl=%d\n",spl);
             
             sample.add(spl);
             population.remove(idx);
             
//             System.out.println(population);
//             System.out.println(sample);
//             System.out.println("-------------------------------");
        }
         System.out.println(sample);
         System.out.println(population);
    }
    
    
}
