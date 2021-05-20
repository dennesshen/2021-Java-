
package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto539 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new LinkedHashSet<>();
        Random r = new Random();
        while( lotto2.size() != 5){
            int n = r.nextInt(39)+1;
            System.out.println(n);
           
                 lotto2.add(n);
        }
        System.out.println(lotto2);
        System.out.println(lotto2.size());
        
        
        
        
        
    }
}
