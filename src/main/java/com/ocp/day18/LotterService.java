/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author dennesshen
 */
public class LotterService {
    static Random  r = new Random();
    
    public static Set<String> get539(){
        Set<String> lotto = new LinkedHashSet<>();
        
        while( lotto.size() != 5){
            int n = r.nextInt(39)+1;
            String str = String.format("%02d", n) ;
          
            lotto.add(str);
        }
        return lotto ;
    }
    
     public static List<Integer> get4star(){
        ArrayList lotto = new ArrayList();
        
        for( int i=0 ; i< 4;  i ++ ){
            lotto.add(r.nextInt(10)); 
        }
        return lotto ;
    }
    
}
