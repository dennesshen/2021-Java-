/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dennesshen
 */
public class Homework_TwoSum2edition {
    
     public static void main(String[] args) {

        int doagain = 0 ; 
        do {
            System.out.println("請輸入要檢測的數字(請用空格分隔)");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            ArrayList <Integer> nums = new ArrayList<>();
            Scanner sc2 = new Scanner(str);
            
            while (sc2.hasNextInt()) {  
            nums.add(sc2.nextInt());
             }
            
            System.out.println("請輸入目標數字");
            Scanner sctarget = new Scanner(System.in);
            Integer  strTarget = sctarget.nextInt();                        
          

        
             if(twoSum(nums,strTarget).isEmpty()){
                System.out.println("所有可能組合當中，沒有任何可以加總得出目標數字的組合");
                System.out.println("請重新輸入");
                doagain = 1;

             }else{  
                System.out.println(twoSum(nums, strTarget));
                doagain = 0;
             }
        
        } while (   doagain == 1   );
       
    }

    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {
         ArrayList<Integer> returnArrayList = new ArrayList<>();
         for(int i1 = 0; i1 < nums.size(); i1++ ){
             for(int i2 = i1+1 ; i2 <nums.size() ; i2++){
                 Integer compareNumber = nums.get(i1)+nums.get(i2);
                 if ( compareNumber == target  ) {
                     returnArrayList.add(nums.get(i1));
                     returnArrayList.add(nums.get(i2));
                     break;
                 }
             }
             if(!returnArrayList.isEmpty()){break;}
             
         }
        return returnArrayList;
    }
    
    

    
    
    
    
}
