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
public class ScoreRangeException extends Exception{

    public ScoreRangeException(int score ) {
        super(score +"沒有在0~100之間");
    }
    
    public void 怎麼辦(){
        System.out.println("請重新輸入");
    }
    
    
}
