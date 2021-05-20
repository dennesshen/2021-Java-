
package com.ocp.day04;

public class ATM {
    public static void main(String[] args) {
        Account act = new Account();
       act.withdraw(70);
       act.withdraw(50);
       act.withdraw(-50);
       act.withdraw(100000);
       act.deposit(1000000);
       act.deposit(200);
       act.deposit(201);
       
    }
}
