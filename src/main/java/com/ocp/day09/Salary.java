
package com.ocp.day09;

public class Salary {
    private int principleSalary;//本薪
    private int bonus;//獎金

    public Salary(int principleSalary, int bonus) {
        this.principleSalary = principleSalary;
        this.bonus = bonus;
    }
    
    
    public int getMoney(){

        int money = util.add(principleSalary,bonus);
        return money;
        
    }
    
    
}
