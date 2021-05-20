
package com.ocp.day07;

public class Employee {
    private String name;
    private String language;
    private int age;
    int salary;    
    
    //建構子
    public Employee(String name, String language, int age, int salary) {    
        this.name = name;
        this.language = language;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
    
    //進行屬性封裝
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

  
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", language=" + language + ", age=" + age + ", salary=" + salary + '}';
    }
    
    
    
    
    
}
