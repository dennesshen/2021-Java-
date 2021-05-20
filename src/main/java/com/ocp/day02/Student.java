
package com.ocp.day02;

public class Student {
    //屬性
    public static String schoolname; //類別屬性
    public String name; //物件屬性
    public int age;
    //方法-印出學生資料
    
    public void print( ){
        System.out.printf("%s %s %d \n", schoolname, name, age );
    
    }
    
}
