
package com.ocp.day11;

//課程錄音32.43 錄影32.56
public interface Animal {
    String name = "動物";
    void sound();
    void sleep();
    
    default void info() {
        System.out.println("小小動物世界");//介面的ㄧpublic static 實作方法，java8之後
    }
    
    default void x(){
        
    }
}
