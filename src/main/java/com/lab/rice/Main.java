/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.rice;

import java.util.stream.Stream;

/**
 *
 * @author dennesshen
 */
public class Main {
    public static void main(String[] args) {
        Rice[] rices = Util.getRice();
        Stream.of(rices)
                .filter(r -> r.get品名().contains("日本"))
                .forEach(c -> System.out.println(c.get品名()+":"+c.get不合格原因().trim()));
    }
    
}

//回家作業匯入不同套資料，進行資料篩選
//java網路程式設計，client
//什麼事java url物件
//網管課程
//網路概論