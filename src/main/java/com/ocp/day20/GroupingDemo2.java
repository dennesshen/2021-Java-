/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author dennesshen
 */
public class GroupingDemo2 {
    public static void main(String[] args) {
        List<String> sex = Arrays.asList("男","男","男", "女","女","女","男","男");
        
        Map<String, Long> result = sex.stream().collect( Collectors.groupingBy(Function.identity(), Collectors.counting()) );
        System.out.println(result);
        //如何弄出印出來時多的在前面????????
        List<Integer> score = Arrays.asList(100,30,60,40,90);
        
        Map<String, Long> groupingByScore = score.stream().collect(
                                            Collectors.groupingBy(e->{
                                                                                        if (e<60) {return "及格";}else{return "及格";}
                                                                                      }, Collectors.counting() )
                    
                    );
        
       
 
 
 
         Map<String, Long> groupingByScore1 = score.stream().collect(
                                           Collectors.groupingBy(e-> e< 60 ?"不及格":"及格", Collectors.counting() )
                                           );
            System.out.println(groupingByScore1);
            
            
 
 
        
    }
    
}
