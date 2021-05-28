/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day34_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dennesshen
 */
public class PathDemo {

    public static void main(String[] args) {
        Path path = Paths.get("/Users/dennesshen/NetBeansProjects/Java20210219");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
    }
}
