/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprogamming.DogFeeding;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author dennesshen
 */
public class Dog extends Thread {

    private Cookies cookies;

    public Dog(Cookies cookies) {
        this.cookies = cookies;
    }

    public void run() {
        int setAmmount = 0;
        int NumberOfEat = 0;
        while (true) {
            try {
                sleep(10);
            } catch (Exception e) {
            }
            while (cookies.getNowAmount() != 0) {
                cookies.setIfDogEat(true);

                NumberOfEat++;
                System.out.printf("小狗吃第%d塊餅乾\n", NumberOfEat);
                setAmmount = cookies.getNowAmount();
                setAmmount--;
                cookies.setNowAmount(setAmmount);
                System.out.printf("狗狗說現在碗裡面有%d塊餅乾\n", cookies.getNowAmount());

            }

            cookies.setIfDogEat(false);

            if (NumberOfEat == cookies.getAmount()) {
                return;
            }

        }

    }

}
