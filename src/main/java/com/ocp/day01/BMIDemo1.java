package com.ocp.day01;

public class BMIDemo1 {
        public static void main(String[] args) {
            System.out.println("Hello 哈囉 ! ");
            
            String name = "Dennis";
            double h = 170;
            double w = 65;
            double result = w / Math.pow(h/100, 2); 
            System.out.printf("%s 的身高 : %.1f  體重 : %.1f  BMI : %.2f \n", name, h , w, result);
            
            String name2 = "Mary";
            double h2 = 160;
            double w2 = 48;
            double result2 = w / Math.pow(h/100, 2); 
            System.out.printf("%s 的身高 : %.1f  體重 : %.1f  BMI : %.2f \n", name2, h2 , w2, result2);
                   
            
            
            
    }
        
 
     }
 

