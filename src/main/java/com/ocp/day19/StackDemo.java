/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day19;

import java.util.Stack;

/**
 *
 * @author dennesshen
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>  stk = new Stack();
        for(int i =1 ; i<=5; i++){
            stk.push(i);
            System.out.println(stk);
        }
        
        while (! stk.empty()) {
            System.out.println(stk.pop()+"剩下的數字是"+stk);
            
        }
        
        System.out.println(stk.pop());//??
    }
    
}
