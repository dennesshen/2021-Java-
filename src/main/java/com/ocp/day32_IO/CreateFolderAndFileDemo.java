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
public class CreateFolderAndFileDemo {

    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_IO";
        String folderName = "res";
        String pathAddFolderName = path + File.separator + folderName;
        File folder = new File(pathAddFolderName);

        System.out.printf("%s是否存在? %b\n", folderName, folder.exists());
        if (!folder.exists()) {
            Boolean success = folder.mkdir();
            System.out.printf("%s 資料夾建立: %b\n", folderName, success);
            if (success) {
                String fileName = "num.txt";
                String fullName = pathAddFolderName + File.separator + fileName;
                File file = new File(fullName);
                try {
                    success = file.createNewFile();
                    System.out.printf("%s 檔案建立: %b\n", fullName, success);

                } catch (IOException e) {
                    System.out.println(e);
                }

            }

        }
    }

}
