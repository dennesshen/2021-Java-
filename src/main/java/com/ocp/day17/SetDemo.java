
package com.ocp.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {
        Set set  = new HashSet();
        set.add("國文");
        set.add(100);
        set.add("英文");
        set.add(90);
        set.add("數學");
        set.add(80);
        set.add(null);
        
        System.out.println(set);
        System.out.println(set.size());
        set.remove(null);
        System.out.println(set);
        
         Iterator iter = set.iterator();
         System.out.println(iter);
        /*尋訪元素
       
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        */
        //迴圈尋訪
        while(iter.hasNext()){
            
            System.out.println(iter.next());
            
            
        }
        //如果只要印出科目
        System.out.println("------------------------------");

        Iterator iter2 = set.iterator();
        while (iter2.hasNext()) {
            Object next = iter2.next();
            if (next instanceof String ){
                System.out.println(next);
            }
        }
        
        
        //如果計算總分
        System.out.println("------------------------------");

        iter2 = set.iterator();//二次調用
        Integer sum = 0;
        while (iter2.hasNext()) {
            Object next = iter2.next();
            if (next instanceof Integer ){
                sum = sum+(Integer) next;
            } 
        }
         System.out.println(sum);
        

        //如果計算總分java8
        System.out.println("------------------------------");
        
        System.out.println(set.stream().filter( t -> t instanceof Integer)
                                                           //.mapToInt( t -> ((Integer)t).intValue())
                                                            .mapToInt( t -> (Integer)t ).sum());
        
        
        
        
      
    }
    
}
