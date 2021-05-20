
package com.ocp.day02;

public class School {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student();
            
            Student.schoolname= "台大";
                    
            s1.age = 18;
            s1.name = "John";

            s2.age = 22;
            s2.name = "Mary";

 
            s1.print();
            s2.print();
          
            
    }
    
}
