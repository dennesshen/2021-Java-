/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.rice;

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

/**
 *
 * @author dennesshen
 */
public class Util {
    public static Rice[] getRice(){
        String path =  "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx" ;
        RiceJsonThread r1 = new RiceJsonThread(path);
        FutureTask<String> task = new FutureTask<>(r1);
        new Thread(task).start();
        try {
            String json = task.get();
            Rice[] rices = new Gson().fromJson(json, Rice[].class);
            return rices;
        } catch (Exception e) {
        }
        
        return null;
        
    }
    
}
