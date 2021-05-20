package com.ocp.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
*/
public class Homework_TwoSum {

    public static void main(String[] args) {
//        System.out.println("請輸入要檢測的數字(請用空格分隔)");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        
//        System.out.println("請輸入目標數字");
//        Scanner sctarget = new Scanner(System.in);
//        Integer strTarget = sctarget.nextInt();
        //System.out.println(strTarget);
        //System.out.println(str);
        
//        while (sc.hasNextInt()) {              //??????????????????????????
//            nums.add(sc.nextInt());
//            System.out.println(nums);
//        }
//        while (sc.hasNext()) {              
//            nums.add(sc.nextInt());
//            System.out.println(nums);
//         }
        int doagain = 0 ; 
        do {
            
            String[] scanMid = scan();
            
          
             //建立一個List 放置 讀取到的數字
            ArrayList <Integer> nums = new ArrayList<>();
            Scanner sc2 = new Scanner(scanMid[0]);
            
            while (sc2.hasNextInt()) {  
            nums.add(sc2.nextInt());
             }
        
        //輸出結果
             if(twoSum(nums, Integer.parseInt(scanMid[1])).isEmpty()){
                System.out.println("所有可能組合當中，沒有任何可以加總得出目標數字的組合");
                System.out.println("請重新輸入");
                doagain = 1;

             }else{  
                System.out.println(twoSum(nums, Integer.parseInt(scanMid[1])));
                doagain = 0;
             }
        
        } while (   doagain == 1   );
       
    }

    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {//為何可以直接list??
//第二次嘗試方法   
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
//第一次嘗試方法       
//        Integer s = nums.size();
//        ArrayList< Integer[] > combo = new ArrayList<>();//??????ArrayList跟ＬinkedList的差別
//        
//        for (Integer iter1 =0 ; iter1 < s ; iter1++){
//            for (Integer iter2= iter1+1; iter2<s ; iter2 ++){
//                //System.out.println("["+nums.get(iter1)+","+nums.get(iter2)+"]");
//                Integer[] array = {nums.get(iter1),nums.get(iter2)};
//                //System.out.println(Arrays.toString(array));
//                combo.add(array);
//            }
//         //Iterator iter = combo.iterator() //????????????為什麼iterator 是Integer []
//         }
//        
//        for (int i = 0; i < combo.size(); i++) {
//            //System.out.println(Arrays.toString(combo.get(i)));
//            combo.get(i);
//         }
//        
//        
        return returnArrayList;
    }
    
    
    public static String [] scan(){
        System.out.println("請輸入要檢測的數字(請用空格分隔)");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println("請輸入目標數字");
        Scanner sctarget = new Scanner(System.in);
        String  strTarget = sctarget.nextLine();
        
        String[]  returnBackString = {str, strTarget};
       
        return returnBackString;
        // return {str , strTarget}; ////????????????
    }
    
    
}