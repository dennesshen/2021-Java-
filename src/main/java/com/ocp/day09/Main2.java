/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day09;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class Main2 {
    public static void main(String[] args) {
        Employees e1 = new Employees("John", new Salary(30000, 5000));
        Employees e2 = new Employees("Mary", new Salary(70000, 8000));
        Employees e3 = new Employees("Helen", new Salary(50000, 6000));
       
        Employees [] itEmployees = {e1 , e2};
        Employees [] salesEmployees = {e2 , e3};
        
        System.out.println( Stream.of(itEmployees).mapToInt(e -> e.getSalary().getMoney()).sum());
        
        IntSummaryStatistics statis = Stream.of(salesEmployees)
                                                            .mapToInt(e-> e.getSalary().getMoney())
                                                            .summaryStatistics();
        System.out.println(statis);
        System.out.println(Stream.of(salesEmployees).mapToInt(e-> e.getSalary().getMoney()).summaryStatistics().getSum());

        
        
        
    }
    
}
