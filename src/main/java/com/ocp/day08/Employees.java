
package com.ocp.day08;

import java.util.stream.Stream;



public class Employees {
    
    //自行建立一個static的類別變數
    private static Employees _instance = new Employees();
    
    //設定private的建構子，讓其他類別不能建立本類別
    private Employees(){
    }
    
    //建立一個public static方法讓外界得到你建立的唯一物件
    public static Employees getEmployees(){   
        return _instance;
    }   
    
    private String[] employees ={"Mary", "John", "Helen" };
    
    
    public void print(){
    
        Stream.of(employees).forEach(System.out::println);
        
    }
    
    
            
    
}
