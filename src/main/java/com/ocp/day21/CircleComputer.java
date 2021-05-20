/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day21;

import java.util.Scanner;

/**
 *
 * @author dennesshen
 */
public class CircleComputer {
    static int a =0 ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入半徑：");
        if (a ==3 ) {
            System.out.println("您輸入錯誤次數過多");
            return;
        }
       

                
         try {
            Double r = sc.nextDouble();
            Double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("area : %.2f \n", area);
                        return;

         }catch (Exception e) {
            
            System.out.println("輸入錯誤，錯誤次數："+a);
            System.out.println("錯誤原因"+e);
            System.out.println("請重新輸入");
            main(args);
            
         }finally{
            System.out.println("我是帥哥");
             a++;
         }

        
    }
    
}
