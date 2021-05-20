/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprogamming.DogFeeding;

/**
 *
 * @author dennesshen
 */
public class Plate {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(10);
        Thread master = new Thread(new Master(cookies));
        Thread dog = new Thread(new Dog(cookies));
        
//        Thread check = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                
//            }
//        });
//        
//        check.start();
        dog.start();
        master.run();
       
        
        
    }
    
    
}

