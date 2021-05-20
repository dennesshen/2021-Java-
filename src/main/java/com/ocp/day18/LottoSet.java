/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author dennesshen
 */
public class LottoSet {
    public static void main(String[] args) {
        //for 迴圈處理
        Set<Integer> lotto = new LinkedHashSet<>();
        Random r = new Random();
        for(int i = 0; i<5; i++ ){
            int n = r.nextInt(10);
            System.out.printf("n=%d\n",n );
            lotto.add(n); 
        }
        
        System.out.println(lotto);
        System.out.println(lotto.size());
        System.out.println("-------------------------------------");
        //while 處理
        
        Set<Integer> lotto2 = new LinkedHashSet<>();
        while( lotto2.size() != 5){
            int n = r.nextInt(10);
            System.out.printf("n=%d\n",n );
            lotto2.add(n); 
        }
        System.out.println(lotto2);
        System.out.println(lotto2.size());
        
        
    }
    
}
