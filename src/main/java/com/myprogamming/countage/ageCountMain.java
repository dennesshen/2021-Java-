
package com.myprogamming.countage;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;


public class ageCountMain {
    

        public int resultAge(int [] input){
            int [] s = input;
            //System.out.println(Arrays.toString(s));
            HumanData H1 = new HumanData(s[0], s[1], s[2]);
            
             return H1.assuranceAge();
          }

        
    }

