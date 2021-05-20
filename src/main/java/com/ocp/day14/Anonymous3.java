/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;


interface Add{
    void calc(int x, int y );
}
        
public class Anonymous3 {
    public static void main(String[] args) {
        Add add1 = (int x ,int y) ->System.out.println( x+y);
        add1.calc(10, 20);
        
        
    }
    
}
