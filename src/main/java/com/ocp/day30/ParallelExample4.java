/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day30;

import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class ParallelExample4 {
    public static void main(String[] args) {
        long count = Stream.iterate(0, n->n+1)
                .limit(100)
                .parallel()
                .filter(x -> x % 3 == 0 && x % 5 != 0)
                .peek(x -> System.out.println(x))
                .count();
    }
    
}
