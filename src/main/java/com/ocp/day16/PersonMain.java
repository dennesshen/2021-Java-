package com.ocp.day16;


public class PersonMain {
    public static void main(String[] args) {
        Person P1 = new Person("John",170.0, 60.0);
        Person P2 = new Person("John",170.0, 60.0);
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P1==P2);//?????????
        System.out.println(P1.equals(P2));//???????
        System.out.println(P1.hashCode());
        System.out.println(P2.hashCode());
        
    }
    
}
