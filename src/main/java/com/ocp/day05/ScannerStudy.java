
package com.ocp.day05;

import java.util.Scanner;


public class ScannerStudy {
        public static void main(String[] args) {
                Scanner sc = new Scanner("170 60 小明的資料 明天 228 放假");
                double h = sc.nextDouble();
                int w = sc.nextInt();
                String s = sc.nextLine();
                System.out.println(h);
                System.out.println(w);
                System.out.println(s);//如何取資料
                
                System.out.println("請輸入任意字串");
                Scanner sc2 = new Scanner(System.in);
                String any = sc2.nextLine();
                System.out.printf("您輸入的是 : %s",any);
                
                
                System.out.println("請輸入任意字串");
                String any2 = new Scanner(System.in).nextLine();
                System.out.printf("您輸入的是 : %s",any2);
                
                System.out.println("請輸入任意字串");
                System.out.printf("您輸入的是 : %s",new Scanner(System.in).nextLine());
                
                
                
        }
    
}
