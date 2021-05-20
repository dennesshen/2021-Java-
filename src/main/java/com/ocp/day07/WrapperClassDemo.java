
package com.ocp.day07;


public class WrapperClassDemo {
    public static void main(String[] args) {
        
        //java 5之前
        int a = 100;
        Integer b = new Integer(200);
        System.out.println(a+b.intValue());//java 5之前
        System.out.println(a+b);//java 5之後 -> Auto-unboxing 自動拆箱
        
        Integer c = 300;//java5之後取代 new Integer(300) -> auto-boxing 自動裝箱
        
        System.out.printf("取得 int 得最大值: %d\n", Integer.MAX_VALUE);
        System.out.println(Integer.max(a, b));
        String chinese = "1";
        String math = "50";
        System.out.println(chinese + math);
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
        
       
        
        
        
        
        
        
    }
    
}
