
package com.ocp.day10;


public class Son extends Father{

    public Son(int i) {
        super(i);
        System.out.println("兒子被建立");

    }

    
    public Son() {
        System.out.println("兒子被建立");
    }

    @Override
    public void hobby() {
        super.hobby(); //建立一個super的爸爸物件嗎?
        System.out.println("lol");
        
    }
    
    
}
