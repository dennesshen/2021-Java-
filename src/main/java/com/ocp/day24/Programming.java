/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day24;

/**
 *
 * @author dennesshen
 */
//要給執行緒執行的工作
public class Programming implements Runnable{

    @Override
    public void run() {//寫程式的工作
        String tname = Thread.currentThread().getName();
        System.out.println(tname+"寫Java程式");
    }
    
}
