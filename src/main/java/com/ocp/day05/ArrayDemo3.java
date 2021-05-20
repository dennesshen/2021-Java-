
package com.ocp.day05;

import java.util.stream.IntStream;


public class ArrayDemo3 {
        public static void main(String[] args) {
        
                int[] scores1 = {80,40,70,60,100,30};
                
                //java8 算總和及平均的方法
                int sum = IntStream.of(scores1).sum();
                double avg = IntStream.of(scores1).average().getAsDouble();
                
                System.out.printf("總和是：%d，平均是:%.1f",sum,avg);
                
                
                //算有及格的總分及平均
                //java7算法
                
                
                
                //java8算法
                
                sum = IntStream.of(scores1).filter(x -> x>= 60).sum();
                avg  = IntStream.of(scores1).filter(x -> x>= 60 ).average().getAsDouble();
                System.out.printf("總和是：%d，平均是:%.2f",sum,avg);
                
                
                
                
                
                
                
        }
    
}
