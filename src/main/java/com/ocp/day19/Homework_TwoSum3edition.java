/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author dennesshen
 */
public class Homework_TwoSum3edition {
    public static void main(String[] args) {

        int doagain = 0 ; 
        do {
            System.out.println("請輸入要檢測的數字(請用空格分隔)");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            LinkedHashSet <Integer> nums = new LinkedHashSet<>();
            
            Scanner sc2 = new Scanner(str);
            
            while (sc2.hasNextInt()) {  
            nums.add(sc2.nextInt());
             }
            
            System.out.println("請輸入目標數字");
            Scanner sctarget = new Scanner(System.in);
            Integer  strTarget = sctarget.nextInt();                        
          

        
             if(twoSum2(nums,strTarget).isEmpty()){
                System.out.println("所有可能組合當中，沒有任何可以加總得出目標數字的組合");
                System.out.println("請重新輸入");
                doagain = 1;

             }else{  
                doagain = 0;
             }
        
             } while (   doagain == 1   );
        
         }
        
    public static ArrayList<Integer[]> twoSum2( LinkedHashSet<Integer> nums, int target) {
        ArrayList<Integer[]> returnArrayList = new ArrayList<>();
        ArrayList<Integer> middleArrayList = new ArrayList<>();

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {

            middleArrayList.add(iter.next());
            
        }
        
        
        for(int i1 = 0; i1 < middleArrayList.size(); i1++ ){
             for(int i2 = i1+1 ; i2 <middleArrayList.size() ; i2++){
                 Integer[] a = {middleArrayList.get(i1),middleArrayList.get(i2)};
                 returnArrayList.add(a);
             }  
             
         }
         
        returnArrayList.stream().filter(t -> t[0]+t[1] == target).forEach(t ->System.out.println( Arrays.toString(t) ));
        
        return returnArrayList;
        
     }
       
}
    
    
    
    
    
    
    
    
