/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;

/**
 *
 * @author dennesshen
 */
public class test {
    void a(){
        final int x = 1;
        System.out.println(x);
    }  
    
    int x = 2;
    void b(){
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        test test = new test();
        test.b();
        
        
    }
    
}
