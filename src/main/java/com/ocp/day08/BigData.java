/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

import java.util.Date;


public class BigData {
    private String data;
    private String author;
    private static String version;
    
    //物件初始區段(會自動覆寫進所有建構子並視為建構子內首項執行內容)
    {
        if(new Date().getTime() % 3 ==0 ){
            data = "盤中資料";
        }
        else{
            data = "盤後資料";
        }
    }
    
    //類別變數初始階段，優先於物件初始區段執行
    static {
        if(new Date().getTime() % 3 ==0 ){//Date()類別是什麼?
            version = "1.0";
        }
        else{
           version = "2.0";
        }
    }

    @Override
    public String toString() {
        return "BigData{" + "data=" + data + ", author=" + author + ", version=" + version + '}';
    } 



    
    
    }
    
  
    
   








