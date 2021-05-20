/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

public class Book {
    
    private int pages;

    public Book(int pages) {
        this.pages = pages;
    }
    
    //物件方法
    public int getPages(){
        return pages;
    }
    //類別方法
    public static  String getpublic(){
        return "機鋒資訊";
    }
    
    
    
}
