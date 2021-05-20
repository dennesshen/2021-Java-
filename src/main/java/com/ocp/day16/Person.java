/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day16;

import java.util.Objects;

/**
 *
 * @author dennesshen
 */
public class Person {
    private String name ;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    //手動輸入equal跟hashcode
    /*
    @Override
    public boolean equals(Object obj) {//???????
        if(obj instanceof  Person){//??????
            Person p = (Person)obj;//???????
            if(name.equals(p.name) && //?????
               h.doubleValue() == p.h.doubleValue()&&//?????
               w.doubleValue() ==p.w.doubleValue()){//??????
                return true;
            }
        }
        return false; 
    }

    @Override
    public int hashCode() {
        return 7*11*name.hashCode()*h.intValue()*w.intValue() ; 
    }
    
    
    */
    
    //用ＮetBean 自動插入

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.h);
        hash = 47 * hash + Objects.hashCode(this.w);
        return hash;
    }

    @Override//?????????
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.h, other.h)) {
            return false;
        }
        if (!Objects.equals(this.w, other.w)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }

    public String getName() {
        return name;
    }

    public Double getH() {
        return h;
    }

    public Double getW() {
        return w;
    }
    
    
    
    
}


