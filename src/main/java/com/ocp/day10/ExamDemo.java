
package com.ocp.day10;


        
class Bar{

    Bar() {
        System.out.print("A");
    }
    
    Bar(int a) {
        this();
        System.out.print("B");
    }    
}

class Foo extends Bar {

    Foo() {
        this(0);
        System.out.print("C");
    }
    Foo(int a) {
        super(20);
        System.out.print("D");
    }
}

public class ExamDemo {
    public static void main(String[] args) {
        Foo F1 = new Foo();
        
        
    }
    
}
