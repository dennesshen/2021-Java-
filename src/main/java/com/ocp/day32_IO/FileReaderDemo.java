/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day32_IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author dennesshen
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_IO/data.text";
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            char[] buffer = new char[1];
//            System.out.println(Arrays.toString(buffer));
//            fr.read(buffer);
//            System.out.println(Arrays.toString(buffer));
//            fr.read(buffer);
//            System.out.println(Arrays.toString(buffer));
            while (fr.read(buffer) != -1) {
                System.out.print(buffer[0]);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e2) {
                    System.out.println(e2);
                }

            }

        }

    }

}
