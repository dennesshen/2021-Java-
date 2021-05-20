
package com.ocp.day04;

import java.util.Scanner;//寫法不同差別(下次問老師)


public class ATMSystem {
    
    
        private Account  account = new Account();
    
        public void service ( int n ){
              Scanner sc = new Scanner(System.in); //寫法不同差別(下次問老師)
                    
                    switch(n){
                        case 1:
                            System.out.println("請輸入提款金額");
                            int withdrawMoney = sc.nextInt();
                            account.withdraw(withdrawMoney);
                            break;
                            
                        case 2:
                            System.out.println("請輸入存款金額");
                            int depositMoney = sc.nextInt();
                            account.deposit(depositMoney);
                            break;
                            
                        case 3:
                            account.printMoney();
                            break;//break跟return的差別
                        
                        case 0:
                            System.exit(0);//做筆記
                         
                   }
        }          

        public  void menu(){
            System.out.println("-----------------------");
            System.out.println("1.提款");
            System.out.println("2.存款");
            System.out.println("3.查詢");
            System.out.println("0.離開");
            System.out.println("-----------------------");
        
            Scanner sc = new Scanner(System.in); //為何這樣寫
            System.out.println("請選擇: ");
            int n = sc.nextInt();
            service(n); //為什麼不能換位置??
          }       
    
        
                    
                    
                    
        public static void main(String[] args) {
            ATMSystem atm = new ATMSystem();
                    while (true) {
                    atm.menu();//這個是直接跳到menu()的方法嗎？
                    System.out.println("按下Enter後繼續");
                    new Scanner(System.in).nextLine();//這是什麼?
                    
                     }
              
         }
          
}
        
             
                    
                    

    
    
    
    
    

