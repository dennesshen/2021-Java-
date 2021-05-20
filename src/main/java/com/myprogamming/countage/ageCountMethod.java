
package com.myprogamming.countage;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class ageCountMethod {
    
    private static Calendar now = Calendar.getInstance();//執行順序是什麼？
    
//    public static void today(){
//        
//        System.out.println(new Date());
//        
//    }
    
    public static int todayMonth(){//
        int month = now.get(Calendar.MONTH)+1;
        //System.out.println(month+"月");
        return month;
    }
    
    public static int todayYear(){
        int year = now.get(Calendar.YEAR)-1911;//為何這樣寫，而不能像19行一樣
        //System.out.println(month+"月");
        return year;
    }
        
    public static int todayDate(){
        int date = now.get(Calendar.DATE);//為何這樣寫，而不能像19行一樣
        //System.out.println(month+"月");
        return date;
    }
    
//    private static int CETransform(int s1){
//        
//        int today = ageCountMethod.todayYear();
//        
//        while(true){
//            if ( (s1 <= 0) || ((s1> today ) && (s1<=1870)) || (s1>(today+1911) )  ){
//                System.out.println("您輸入錯誤，請重新輸入");
//                System.out.println("請輸入客戶出生年（民國）為");
//                s1 = new Scanner(System.in).nextInt();
//            }
//            else if(( s1 <= (today+1911) ) && (s1>1870)){
//                System.out.println("請問您輸入的是西元年嗎？");
//                System.out.println("是請按1，不是請按2");
//                int assur = new Scanner(System.in).nextInt();
//                if (assur==1) {
//                    s1 = s1-1911;
//                    break;
//                }
//                if (assur==2) {
//                    System.out.println("請重新輸入");
//                    System.out.println("請輸入客戶出生年（民國）為");
//                    s1 = new Scanner(System.in).nextInt();
//                }
//
//            }
//            else{
//                break;
//            }
//         }
//        
//        return s1;
//    }
            
//    public static int[] scan() {
//    
//         System.out.println("請輸入客戶出生年（民國）為");
//         int s1 = new Scanner(System.in).nextInt();
//         s1 = ageCountMethod.CETransform(s1) ;
//         
//         System.out.println("請輸入客戶出生月份為");
//         int s2 = new Scanner(System.in).nextInt();
//         System.out.println("請輸入客戶出生日為");
//         int s3 = new Scanner(System.in).nextInt();
//        
//         System.out.printf("客戶生日為民國%d年%d月%d日\n",s1,s2,s3);
//         int[] s = {s1,s2,s3};
//         return  s ;
//         
//        
//    }
    
    
    public  static  int compare(int s1,int s2,int s3){
        int year      =ageCountMethod.todayYear() - s1;
        int month  =ageCountMethod.todayMonth()- s2;
        int day       =ageCountMethod.todayDate()-s3;
        /*System.out.println(year);
        System.out.println(month);
        System.out.println(day);
       */
        if (month<0){
            year = year-1;
            //System.out.println("1:"+year);
            month = 12+month;
            //System.out.println("2:"+month);
            if (day < 0 ){
            month = month - 1;
            //System.out.println("3:"+month);
            }
        }
        else{
            if (day < 0 ){
            month = month - 1;
            }
            //System.out.println("4:"+month);
        }
        if(month>= 6){
            year = year+1;
            //System.out.println("5:"+month);
        }
        int assuranceAge = year;
        /*System.out.println("6:"+year);     
        System.out.println(month);*/
        return assuranceAge;
    }   
    
    
    
}

