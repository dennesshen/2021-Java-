
package com.ocp.day05;


public class ArrayDemo2 {
        public static void main(String[] args) {
        
         // java7 for-loop
                int[] scores1 = {80,90,70,60,100,30};
                int sum = 0;
        
                for ( int i = 0, lens = scores1.length ; i<lens ;  i++){
                        sum += scores1[i];
                 }
        
                System.out.printf("總成績為%d\n",sum);
            
                
         //java7 for-in (for-each) //做筆記
                int sum2 = 0;
        
                for ( int x : scores1 ){
                        sum2+= x;
                 }
        
                System.out.printf("總成績為%d\n",sum2);
                
         //java7 算平均
         
                double average = (double)sum2/scores1.length;
                System.out.printf("平均為%.1f\n",average);//為何是f不是d
     
        }
        
       
}
