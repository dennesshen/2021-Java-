
package com.ocp.day17;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //加入泛型
        
        Set<Integer> set = new LinkedHashSet<>();
        set.add(100);
        set.add(90);
        set.add(80);
        set.add(null);
        
        //計算總分java7
        Iterator<Integer>iter = set.iterator();//??
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            if (next != null ){
                sum += next;
                
            }
        }
        System.out.println(sum);     
        
        //計算總分java8
        
         iter = set.iterator();//??
         
         System.out.println(set.stream().filter(t -> t != null).mapToInt(t -> t.intValue()).sum());
        
    }
}
