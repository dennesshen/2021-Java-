/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day24;

/**
 *
 * @author dennesshen
 */
public class Race extends Thread {
    public void run(){
        job();
    }
    
    private void job(){
        //抓取執行緒名稱
        String Tname = Thread.currentThread().getName();
        for(int i =0 ; i<=1000; i++){
            if(Tname.equals("程咬金")  && (i<200 || i >600)){
                continue;
            }
            
            System.out.printf("%s目前跑了%d步\n",Tname,i);
        }
        
        
    }
    
}
