
package com.ocp.day01;

public class BMIDemo2 {
        public static void main(String[] args) {
            printBMI ("Dennis", 170, 65 ) ;
            printBMI ("John ", 175, 90  ) ;
            printBMI ("Mary", 160, 50  ) ;
            
                 
            
    }
    
        public static void printBMI ( String name , double h ,double w ){
         
            double result = w / Math.pow(h/100, 2); 
            System.out.printf("%s 的身高 : %.1f  體重 : %.1f  BMI : %.2f \n", name, h , w, result);
            
         }
}
