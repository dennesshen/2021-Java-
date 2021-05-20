
package com.ocp.day17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ToArrayDemo {
    
    public static void main(String[] args) {
        //集合轉陣列
        Set<String> phones = new LinkedHashSet<>();
        phones.add("IPHONE");
        phones.add("PIXEL");
        phones.add("MI");
        
        //先準備一個空的字串
        String [] s1 = new String[phones.size()];
        phones.toArray(s1);
        System.out.println(s1);
        System.out.println(Arrays.toString(s1));
        

        String [] s3 = {"iphone", "Pixel"};
        
        System.out.println(Arrays.toString(phones.stream().toArray( t -> new String[t])));
        System.out.println(Arrays.toString(s3));
    }
    
}
