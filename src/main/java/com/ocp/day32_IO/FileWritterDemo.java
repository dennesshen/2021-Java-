/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day32_IO;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author dennesshen
 */
public class FileWritterDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_IO/data.text";
        //FileWritter設定
        //true 代表保留原檔案資料
        //False 清楚保留原檔案內容資料
        try(FileWriter fw = new FileWriter(path,true)) {
            fw.write("\nHello World");
        } catch (Exception e) {
        }
    }
    
}
