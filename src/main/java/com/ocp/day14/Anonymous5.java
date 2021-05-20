/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;

interface Bmi{
    double calc(double h, double w);
}

public class Anonymous5 {
    public static void main(String[] args) {
        Bmi bmi1 = (h, w) ->  w / Math.pow(h/100, 2) ;   
        System.out.printf("%.2f",bmi1.calc(170, 60));
    }
    
}
