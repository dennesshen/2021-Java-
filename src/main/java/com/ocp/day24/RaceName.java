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
public class RaceName {
    public static void main(String[] args) {
        Race race = new Race();
        Race race2 = new Race();
        Race race3 = new Race();
        race.setName("烏龜");
        race2.setName("兔子");
        race3.setName("程咬金");//200~600步
        //設定權限
        race.setPriority(10);
        race2.setPriority(1);
        //執行緒啟動
        race.start();
        race2.start();
        race3.start();
    }
    
}
