/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day20;

/**
 *
 * @author dennesshen
 */
public class User {
    private String name;
    private Integer score;

    public User(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", score=" + score + '}';
    }
    
    
    
    
    
    
    
    
}
