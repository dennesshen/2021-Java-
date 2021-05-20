
package com.ocp.day16;


public class Innerclass {
    int x = 100;
    static int sx = 200;
    
           
    //一般內部類別
    class MyInner{
        void print(){
            System.out.println("Myinner");
            System.out.println(Innerclass.this.x);//?   
            System.out.println(Innerclass.sx);//?
            MyStaticInner.print();
            
        }
    }
    
    //靜態內部類別
    static class MyStaticInner{
        static void print(){
            System.out.println("MyStaticInner");
            System.out.println(sx);//為什麼不能呼叫物件變數？
            
        }
       
    }
    
    
    
    public static void main(String[] args) {
        Innerclass.MyInner mi = new Innerclass().new MyInner();
        mi.print();
        Innerclass.MyStaticInner msi = new Innerclass.MyStaticInner();
        msi.print();
        
        
    }
}


