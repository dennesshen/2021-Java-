/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day32_IO;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dennesshen
 */
public class FileReaderDemo2 {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_IO/data.text";
        
        try(FileReader fr = new FileReader(path)) {
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }
        }  catch (IOException e1) {
            System.out.println(e1);
        } 
    }
    
}
