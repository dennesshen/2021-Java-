/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day25;

/**
 *
 * @author dennesshen
 */
class Father extends Thread{

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒熱水");
        System.out.println("爸爸請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        
        //sleep寫法
//        try {
//            Father.sleep(6000);
//        } catch (Exception e) {
//        }

        //join寫法
        try {
            worker.join(8000);
        } catch (InterruptedException e) {
        }

        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
    
    
    
    
}

class Worker extends Thread{

    @Override
    public void run() {
        System.out.println("瓦斯工人準備送瓦斯");
        for(int i = 1; i<=10; i++){
            try{
                System.out.println(i+"秒鐘");
                Thread.sleep(1000);
            }catch(InterruptedException e ){
                System.out.println("工人發生意外:"+e);
            }    
        }
        System.out.println("瓦斯工人將瓦斯送到");
    }
    
    
}

public class  Shower {
    public static void main(String[] args) {
        new Father().start();
        
        
    }
    
    
}
