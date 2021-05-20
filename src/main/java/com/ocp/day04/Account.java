
package com.ocp.day04;

public class Account {
       private int money = 100;
        
       //餘額查詢的方法
       public void printMoney(){
           System.out.printf("餘額尚有$%d\n",money);
           
       }
       
       //提款方法
       
       public void withdraw( int x ){
           System.out.printf("提款$%d\n", x);  
          
           if ( x>= money ) {
               System.out.printf("餘額不足\n");
               return;
               }
           if (x<= 0 ){
                   System.out.printf("提款金額必須大於零\n");
                   return;
           }
           if (x > 10_0000 ){
                   System.out.printf("提款金額不可超過十萬\n");
                   return;
           }
           
           money -= x;
            System.out.printf("提款成功，餘額尚有$%d\n", money);
           
           
           
       }
       
 
       public void deposit ( int x ){
           
           if (x % 100 != 0){
               System.out.printf("存款金額必須要是100的倍數\n");  
               return;
           }
         
            if (x >10_0000){
               System.out.printf("存款金額不得高於十萬\n");  
               return;
           }
           
            money += x; 
            System.out.printf("存款$%d,餘額尚有$%d \n", x , money);  
          
         

       }
       

       
}
