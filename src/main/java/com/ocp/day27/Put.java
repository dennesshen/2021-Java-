/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day27;

/**
 *
 * @author dennesshen
 */
public class Put implements Runnable{
    private Cookies cookies;

    public Put(Cookies cookies) {
        this.cookies = cookies;
    }
    
    
    @Override
    public void run() {
        for(int i =1 ; i<= cookies.getAmount() ; i++){
            cookies.put(i);
            
        }
        
    }
    
    
}
