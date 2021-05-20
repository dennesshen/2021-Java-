
package com.ocp.day05;

import java.util.Arrays;


public class ArrayDemo {
        public static void main(String[] args) {
                int[] scores1 = {80,90,70,60,100,30};
                int[] scores2 = new int[6];
                scores2[0] = 50;
                scores2[1] = 40;
                scores2[2] = 30;
                scores2[3] = 20;
                scores2[4] = 70;
                scores2[5] = 60;
                
                System.out.printf("數學 : %s \n", Arrays.toString(scores2));
                System.out.printf("國文 : %s \n", Arrays.toString(scores1)); // Arrays.toString 做筆記
        }
    
}
