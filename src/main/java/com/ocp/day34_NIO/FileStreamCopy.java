/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day34_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author dennesshen
 */
public class FileStreamCopy {
    public static void main(String[] args) throws Exception {
        String o_url = "src/main/java/com/ocp/day33_IO/car.jpg";
        String d_url ="src/main/java/com/ocp/day34_NIO/car.jpg";
        Path source = Paths.get(o_url);
        Path dest = Paths.get(d_url);
        Files.copy(source, dest , StandardCopyOption.COPY_ATTRIBUTES);
        
    }
    
}
