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
public class MaryMain {
    public static void main(String[] args) {
        Runnable job1 = new Programming();
        Runnable job2 = new Report();
        
        Thread mary = new Thread(job1, "Mary");
        mary.start();
        
        Runnable[] runnables = {job1,job2,job1};
        Runnable jobs = new Jobs(runnables);
        Thread helen = new Thread(jobs,"Helen");
        helen.start();
        
    }
    
}
