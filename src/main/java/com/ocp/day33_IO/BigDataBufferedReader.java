/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day33_IO;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author dennesshen
 */
public class BigDataBufferedReader {

    public static void main(String[] args) {
        String filePath = "src/main/java/com/ocp/day33_IO/1000 Sales Records.csv";
        try (FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr)) {

            String data = null;
            //逐行讀取
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception e) {
        }
    }

}
