/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;

interface Game{
    void print();
    
    
}

public class Anonymous2 {
    public static void main(String[] args) {
        Game game1 = new Game() {
            @Override
            public void print() {
                System.out.println("英雄聯盟");
            }
        };
        game1.print();
        
        Game game2 = () -> System.out.println("英雄聯盟");
        
        
           
    }
    
}
