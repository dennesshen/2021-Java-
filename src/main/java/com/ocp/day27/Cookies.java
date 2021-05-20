/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day27;


public class Cookies {
    private boolean empty = true;
    private int amount;
    
    public Cookies(int amount ){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    
    public synchronized void put(int n ){
        if (!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.printf("主人放第%d塊餅乾\n", n);
        empty = false;
        notify();

    }
    
    
     public synchronized void eat(int n ){
         if (empty){
             try {
                 wait();
             } catch (Exception e) {
             }
             
         }
        
        System.out.printf("小狗吃第%d塊餅乾\n", n);
        empty = true;
        notify();

    }
    
}
