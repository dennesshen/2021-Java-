/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class StackLab {
    public static void main(String[] args) {
        //我的版本
        String sc = new Scanner(System.in).nextLine();
        Stack<Character> stk = new Stack();
        int idx = sc.length();
        //System.out.println(idx);
        for(int i = 0 ;  i < idx ; i ++){
            stk.push(sc.charAt(i));
            //System.out.println(sc.charAt(i));
        }
        while (! stk.empty()) {        
            System.out.print(stk.pop());
        }
        
        System.out.println("\n-----------------------------");

        //老師版本
         char[] array = sc.toCharArray();
         for(char c : array){
             stk.push(c);
         }
         
        while (! stk.empty()) {        
            
            System.out.print(stk.pop());
        }
        
        System.out.println("\n-----------------------------");
        
        
        
        
    }
    
}
