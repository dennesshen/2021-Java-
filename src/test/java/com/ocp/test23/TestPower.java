/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.test23;

import com.ocp.day23.Power;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author dennesshen
 */
public class TestPower {
    @Test
    public void testW(){
        Power power = new Power();
        int v =10;
        int a = 100;
        int exp = 1000;
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }
}
