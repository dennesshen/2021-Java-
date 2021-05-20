
package com.ocp.day19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {
    public static void main(String[] args) {
        
        Queue<String> names = new LinkedList<>();
        names.offer("John");
        names.offer("Mary");
        names.offer("Helen");
        System.out.println("排隊打針"+names);
        
        while (! names.isEmpty()) {
            String name = names.poll();
            System.out.println(name+"在打針，排隊打針的是"+names);
            
        }
        
        System.out.println("-------------------------------------");
        
        names.offer("John");
        names.offer("Mary");
        names.offer("Helen");
        System.out.println("排隊打針"+names);
         while (! names.isEmpty()) {
            String name = names.remove();
            System.out.println(name+"在打針，排隊打針的是"+names);
            
        }
         
        //System.out.println(names.remove());//????????
        
       System.out.println("-------------------------------------");
       
       
        names.offer("John");
        names.offer("Mary");
        names.offer("Helen");
        System.out.println("排隊打針"+names);
        Iterator iter = names.iterator();
        while (iter.hasNext()) {            
            String name = iter.next().toString();
            System.out.println(name+"在打針");
            
        }

          
        
        
        
    }
    
    
}
