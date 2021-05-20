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
public  class Cookies {

    private int amount;
    private int nowAmount = 0;
    private boolean IfDogEat = false;

    public Cookies(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public synchronized void setNowAmount(int nowAmount) {
        this.nowAmount = nowAmount;
    }

    public synchronized int getNowAmount() {
        return nowAmount;
    }

    public synchronized void setIfDogEat(boolean a) {
        this.IfDogEat = a;
    }
    
    public synchronized boolean getIfDogEat() {
        return IfDogEat;
    }

}
