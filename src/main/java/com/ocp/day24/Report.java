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
public class Report implements Runnable{

    @Override
    public void run() {
        String tname =Thread.currentThread().getName();
        System.out.println(tname+"寫ＰＰＴ報表");
    }
    
}
