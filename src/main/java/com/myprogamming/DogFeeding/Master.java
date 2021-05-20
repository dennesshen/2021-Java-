/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprogamming.DogFeeding;

import java.util.Random;

/**
 *
 * @author dennesshen
 */
public class Master extends Thread {

    private Cookies cookies;

    public Master(Cookies cookies) {
        this.cookies = cookies;
    }

    @Override
    public void run() {
        int setAmmount = 0;
        int NumberOfPut = 0;

        while (true) {
            while (!cookies.getIfDogEat()) {
                NumberOfPut++;
                System.out.printf("主人放第%d塊餅乾\n", NumberOfPut);
                setAmmount = cookies.getNowAmount();
                setAmmount++;
                cookies.setNowAmount(setAmmount);
                System.out.printf("主人說現在碗裡面有%d塊餅乾\n", cookies.getNowAmount());
                if (NumberOfPut == cookies.getAmount()) {
                    return;
                }

            }


        }

    }

}
