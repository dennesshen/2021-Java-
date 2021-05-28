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
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class WalkingHome {

    public static void main(String[] args)  {
        Path homePath = Paths.get(System.getProperty("user.home"));
        try {
            Stream<Path> files = Files.walk(homePath);
            files.forEach(p -> {
                Path path = p.toAbsolutePath();
                System.out.println(p + "：");
                try {
                    System.out.println(Files
                            .readAttributes(path, BasicFileAttributes.class)//???????????
                            .creationTime());
                } catch (Exception e) {
                    System.out.println(e);
                }

            });

        } catch (Exception e) {
            System.out.println("沒有存取權");
        }

    }

}
