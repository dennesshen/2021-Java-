/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author dennesshen
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        System.out.println("size1:"+vc.size());
        System.out.println("capacilty1:"+vc.capacity());
        System.out.println("-----------------------------------");

        
        for(int i =1; i<=10;i++){
            vc.add(i);
        }
        System.out.println("size1:"+vc.size());
        System.out.println("capacilty1:"+vc.capacity());
        System.out.println("-----------------------------------");
        
        for(int i =11; i<=13;i++){
            vc.add(i);
        }
        System.out.println("size1:"+vc.size());
        System.out.println("capacilty1:"+vc.capacity());
        System.out.println("-----------------------------------");
        
        
        Vector<Integer> vc2 = new Vector<>(641);
        System.out.println("size2:"+vc2.size());
        System.out.println("capacilty2:"+vc2.capacity());
        System.out.println("-----------------------------------");
        
         for(int i =1; i<=642;i++){
            vc2.add(i);
        }
        System.out.println("size2:"+vc2.size());
        System.out.println("capacilty2:"+vc2.capacity());
        System.out.println("-----------------------------------");
         
        Vector<Integer> vc3 = new Vector<>(641,10);
        System.out.println("size3:"+vc3.size());
        System.out.println("capacilty3:"+vc3.capacity());
        System.out.println("-----------------------------------");
        
         for(int i =1; i<=642;i++){
            vc3.add(i);
        }
        System.out.println("size3:"+vc3.size());
        System.out.println("capacilty3:"+vc3.capacity());
        System.out.println("-----------------------------------");
        
        //刪除偶數資料
        Iterator<Integer> iter = vc3.iterator();
        
        while(iter.hasNext()){
            if (iter.next() % 2 == 0) {
                iter.remove();
                
            }  
        }
        System.out.println("size3:"+vc3.size());
        System.out.println("capacilty3:"+vc3.capacity());
        System.out.println("-----------------------------------");
         
        
        
        
        
    }
    
    
}
