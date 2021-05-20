/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;


public class DeptDemo {
       public static void main(String[] args) {
           Dept dept = new Dept();
           Dept.Job job = dept.new Job();
           job.work();
    }
    
}





