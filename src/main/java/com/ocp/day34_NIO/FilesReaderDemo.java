/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day34_NIO;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author dennesshen
 */
public class FilesReaderDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ocp/day33_IO/1000 Sales Records.csv");
        
        //Files.newBufferedReader
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
            
        } catch (Exception e) {
        }
        
        //2.Files.readAllLines
        List<String> list = Files.readAllLines(path);
        list.stream().forEach(System.out::println);
        
        //3.Files.Line
        Files.lines(path).forEach(System.out::println);
        
        
        
    }
    
}
