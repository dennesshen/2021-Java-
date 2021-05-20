/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprogamming.countage;



public class HumanData {
    private int yearOfBorn;
    private int monthOfBorn;
    private int dateOfBorn;
    
    public HumanData(int yearOfBorn, int monthOfBorn,int dateOfBorn){
        this.yearOfBorn = yearOfBorn;
        this.monthOfBorn = monthOfBorn;
        this.dateOfBorn = dateOfBorn;       
    }
    
    public int assuranceAge(){
         int assuranceAge = ageCountMethod.compare(yearOfBorn, monthOfBorn, dateOfBorn);
        
         return assuranceAge;

    }
    

}
