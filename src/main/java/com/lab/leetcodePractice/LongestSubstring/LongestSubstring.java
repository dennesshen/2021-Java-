/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//題目來源https://leetcode.com/problems/longest-substring-without-repeating-characters/
package com.lab.leetcodePractice.LongestSubstring;

import java.util.ArrayList;
import java.util.Arrays;


class changeType{
    public static Character[] change(ArrayList<Character> arrayList){
        Character[] charSequence = new Character[arrayList.size()];
        for (int i = 0; i < arrayList.size() ; i++) {
            charSequence[i] = arrayList.get(i);
            
        }
 
        return charSequence;
    }
}


public class LongestSubstring {

    public static void main(String[] args) {
        String com = "abcdefafeecdaeghijklareewwhk";
        ArrayList<Character> originalString = new ArrayList<>();
        for (int i = 0; i < com.length(); i++) {
            originalString.add(com.charAt(i));
        }
        
        ArrayList<Character> compareString1 = new ArrayList<>();
        ArrayList <Character[]> compareString2 = new ArrayList<>();
        compareString1.add(originalString.get(0));

        for (int i = 1; i < originalString.size(); i++) {
            char nowChar = originalString.get(i);
            //System.out.println(nowChar);

            for (int j = 0; j < compareString1.size(); j++) {
                if (nowChar == compareString1.get(j)) {
                    
                    compareString2.add(changeType.change(compareString1));
                    //System.out.println(compareString2);

                    compareString1.clear();
                    //System.out.println(compareString1);

                    break;
                }
            }
            compareString1.add(nowChar);
            //System.out.println(compareString1);

        }
        
        compareString2.add(changeType.change(compareString1));
        //compareString2.stream().forEach(t -> System.out.println(Arrays.toString(t)) );
        int result = compareString2.get(0).length;
        Character[] resultSequence = compareString2.get(0);
        
        //System.out.println(result);
        for (int i = 1; i < compareString2.size() ; i++) {
            if (result < compareString2.get(i).length) {
                result = compareString2.get(i).length;
                resultSequence = compareString2.get(i);
            }
        }
        
        
        System.out.println(result);
        System.out.println(Arrays.toString(resultSequence));
        compareString2.stream().forEach(t -> System.out.println(Arrays.toString(t)));
                
        

    }

}
