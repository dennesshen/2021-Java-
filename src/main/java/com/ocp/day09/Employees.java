
package com.ocp.day09;

public class Employees {
    private String name;
    private Salary salary;

    public Employees() {
    }

    public Employees(String name) {
        this.name = name;
    }

    public Employees(Salary salary) {
        this.salary = salary;
    }

    public Employees(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    
    
}
