/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.cdc;

import java.io.InputStreamReader;
import static java.lang.System.in;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 *
 * @author dennesshen
 */
public class JsonThread implements Callable<String>{
    private String path; // json 網路路徑位置

    public JsonThread(String path) {
        this.path = path;
    }
    
    @Override
    public String call() throws Exception {
        URL url = new URL(path); // 建立 URL 物件  //URL是什麼東西？？？？？？
        // \A 這個 pattern 代表的是全部選擇
        // 透過 Scanner 可以將網路串流(openStream())變成字串
        InputStreamReader isr = new InputStreamReader(url.openStream(),"utf-8");
        String json = new Scanner(isr).useDelimiter("\\A").next();
        return json;
        
    }
    
}