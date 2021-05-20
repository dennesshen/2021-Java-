/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.leetcodePractice.LongestSubstring;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dennesshen
 */
public class test {

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> compareString2 = new ArrayList<>();
        ArrayList<Character> arrayList1 = new ArrayList<>();

        arrayList1.add('a');
        arrayList1.add('b');
        arrayList1.add('c');

        System.out.println(arrayList1);
        compareString2.add(arrayList1);
        System.out.println(compareString2);

        arrayList1.clear();
        System.out.println(arrayList1);
        
        arrayList1.add('d');
        arrayList1.add('e');
        arrayList1.add('f');
        System.out.println(arrayList1);
        
        compareString2.add(arrayList1);
        System.out.println(compareString2);

    }

}
