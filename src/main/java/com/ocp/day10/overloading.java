
package com.ocp.day10;


public class overloading {
    public static void print(Integer x){
        System.out.println("Integer : "+x);
        
    }
    public static void print(int x){
        System.out.println("Int : "+x);
    }

    public static void print(double x){
        System.out.println("double : "+x);

    }    

    public static void print(float x){
        System.out.println("float : "+x);
        
    }

    public static void main(String[] args) {
        print(100);
        print(100.0f);//??
        print(Integer.valueOf(100));
    }
}
