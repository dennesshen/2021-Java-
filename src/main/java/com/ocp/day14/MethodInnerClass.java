/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;


public class MethodInnerClass {
    
    void foo(){
        int x =1;
        int y = 2;
        
        class Hello{
            void print(){
                System.out.println(x);
                
            }
            
          
        }
    }
    
}
