/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day22;

/**
 *
 * @author dennesshen
 */
public class InputExamScore {

    public static void main(String[] args) {
        int score = -30;
        try {
            check(score);
        } catch (Exception e) {
            System.out.println("score : "+score+"\n錯誤原因："+e.getMessage());
        }
                

    }

    public static void check(int score) throws Exception {
        //  參數檢驗
        if (score < 0 || score > 100) {
            Exception e = new Exception("分數必須介於0~100之間");
            throw e;
        }

        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Pass");
        }

    }

}
