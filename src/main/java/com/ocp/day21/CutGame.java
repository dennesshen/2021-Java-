/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day21;

import java.util.Scanner;

/**
 *
 * @author dennesshen
 */
public class CutGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入繩子長度:(整數)");
        try {
            Integer rope = sc.nextInt();
            long b = rope;
            int day = 0;
            while (b >= 5) {
                b = b / 2;
                day++;
            }

            System.out.println(day);
            
        } catch (Exception e) {
            System.out.println("輸入錯誤，請輸入整數");
            System.out.println("錯誤原因"+e);
            System.out.println("請重新輸入");
            main(args);
            
        }
       
        
        
        
        
        
        
        
        
    }
    
}
