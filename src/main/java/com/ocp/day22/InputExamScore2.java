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
public class InputExamScore2 {

    public static void main(String[] args) {
        int score = -30;
        try {
            check(score);
        } catch (ScoreRangeException e) {
            System.out.println( e.getMessage());
            e.怎麼辦();
        }

    }

    public static void check(int score) throws ScoreRangeException {
        //  參數檢驗
        if (score < 0 || score > 100) {
            ScoreRangeException e = new ScoreRangeException(score);
            throw e;
        }

        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Pass");
        }

    }
    
}
