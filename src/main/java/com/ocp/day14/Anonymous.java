/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;

interface Salary {
    public int amount();
    
}

public class Anonymous {
    public static void main(String[] args) {
        Salary salary1 = new Salary() {
            @Override
            public int amount() {   
                return 5_0000;
            }
            
        };

        Salary salary2 = new Salary() {
            @Override
            public int amount() {
                return 8_0000;
            }
            
        };
        
        System.out.println(salary1.amount());
        System.out.println(salary2.amount());
        
        
    }
    

}
