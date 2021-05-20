
package com.ocp.day09;


public class Main {
    public static void main(String[] args) {
        Employees john = new Employees();
        john.setName("John");
        john.setSalary(new Salary(30000,5000));
        
        
        Employees Mary = new Employees("Mary", new Salary(70000,8000));
        
    }
    
}
