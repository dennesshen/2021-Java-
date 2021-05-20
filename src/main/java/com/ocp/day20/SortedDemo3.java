/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author dennesshen
 */
public class SortedDemo3 {
    public static void main(String[] args) {
          List<User> users = Arrays.asList(
                    new  User("A",100),
                    new  User("B",40),
                    new  User("C",80),
                    new  User("D",30),
                    new  User("E",90)
                     );
    
    
          //請按照分數大小來排序置入新集合
    
    
          List<User> sortedUsers = users.stream()
                                            .sorted( (U1, U2) -> U2.getScore()-U1.getScore() )
                                            .collect(toList());
            
          System.out.println(sortedUsers);
    
          List<User> sortedUsers1 = users.stream()
                                            .sorted(Comparator.comparing(User::getScore))
                                            .collect(toList());
            
          System.out.println(sortedUsers1);
          
          
          List<User> sortedUsers2 = users.stream()
                                            .sorted(Comparator.comparing(User::getScore).reversed())
                                            .collect(toList());
            
          System.out.println(sortedUsers2);
    }
  
}
