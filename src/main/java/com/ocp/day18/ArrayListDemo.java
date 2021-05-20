/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day18;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dennesshen
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //四星彩(0~9)取四個可重複的數字
        ArrayList lotto = new ArrayList();
        Random r = new Random();
        
        for( int i=0 ; i< 4;  i ++ ){
            lotto.add(r.nextInt(10)); 
        }

        System.out.println(lotto);

    }
    
    
    
    
    
}
