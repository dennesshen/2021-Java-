/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day32_IO;

import java.io.File;

/**
 *
 * @author dennesshen
 */
public class CheckFileOrDir {
    public static void main(String[] args) {
        String path1 = "src/main/java/com/ocp/day32_IO/res";
        String path2 = "src/main/java/com/ocp/day32_IO/res/num.txt";
        System.out.println(new File(path1).isDirectory());
        System.out.println(new File(path1).isFile());
        System.out.println(new File(path2).isDirectory());
        System.out.println(new File(path2).isFile());
        
    }
    
}
