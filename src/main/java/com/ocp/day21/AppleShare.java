/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day21;

/**
 *
 * @author dennesshen
 */
public class AppleShare {
    public static void main(String[] args)  {
        int n = 0;
        try {
            submit(n);
        
        } catch (Exception e ) {
            System.out.println("錯誤原因"+e.getMessage());
            System.out.println("錯誤原因"+e.getLocalizedMessage());
            System.out.println(e);
            e.printStackTrace(System.out); // 印出程式碼詳細錯誤資訊

            
        }
                
    }
    
    public static void submit(int n) throws Exception {
        if (n<= 0 ) {
            Exception e = new Exception("n<=0");
            throw e;    
        }
        int apple = 10;
        int result = 0;
        result = apple / n ;
        System.out.println(result);
        
                
    }
    
}
