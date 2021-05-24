/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day32_IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dennesshen
 */
public class CreatFileDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_IO";
        String name = "data.text";
        String pathAddName = path +File.separator +name;
        System.out.println(pathAddName);
        File file = new File(pathAddName);
        System.out.printf("%s是否存在? %b\n",pathAddName,file.exists());
        if( ! file.exists()){
            System.out.print("建立檔案：");
            try {
                Boolean success = file.createNewFile();
                System.out.print(success+"\n");
                
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    
}
