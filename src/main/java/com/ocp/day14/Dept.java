/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day14;


public class Dept {
    String name = "軟體部門";
        class Job {
            void work(){
                String name = "寫程式";
                System.out.println(name);
                System.out.println(Dept.this.name);

            }
        }
    
}
