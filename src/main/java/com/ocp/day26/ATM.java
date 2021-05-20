/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day26;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new WithdrawThread(account,5000);
        Thread t2 = new WithdrawThread(account,4000);
        Thread t3 = new WithdrawThread(account,3000);
        t1.setName("小明");
        t2.setName("小華");
        t3.setName("小英");
        t1.start();
        t2.start();
        t3.start();

        
        
        
    }
    
}
