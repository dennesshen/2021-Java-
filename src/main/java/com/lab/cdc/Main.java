/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.cdc;

import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class Main {
    public static void main(String[] args) {
        CDC[] cdcs = Util.getCds();
        //System.out.println();
        Stream.of(cdcs)
                .filter(c ->c.getSent().contains("2021-05-14"))
                .forEach(c -> System.out.println(c.getHeadline()+":"+c.getDescription().trim()));
    }
    
}
