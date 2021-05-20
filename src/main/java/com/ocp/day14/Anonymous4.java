/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;

interface Sub{
    int calc(int x , int y);
}

class SubImp1 implements Sub{

    @Override
    public int calc(int x, int y) {
        return x-y;
        
    }
    
}

public class Anonymous4 {
    public static void main(String[] args) {
        Sub sub1= new SubImp1();
        sub1.calc(10, 5);
        
        Sub sub2 = new Sub() {
            @Override
            public int calc(int x, int y) {
                return x-y;
            }  
        };
        
        Sub sub3 = (x,y) -> {return x-y;};
        
        Sub sub4 = (x,y) -> x-y;
        System.out.println(sub4.calc(10, 5));
        
        
        
        
        
    }
    
}
