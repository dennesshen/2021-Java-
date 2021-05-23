/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.test23;

import com.ocp.day23.Square;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author dennesshen
 */
public class TestSquare {

    @Test
    public void test() {
        // 測試要符合 3A
        // Arrange - 安排(目標物件)
        // Act - 目標方法
        // Assert - 驗證是否符合預期
        
        // Arrange - 安排(目標物件)
        Square square =new Square();
        int h = 10;
        int w = 5;
        //期望結果
        int exp = 50;
        //Act 目標方法
        int act = square.getArea(w, h);
        
        // Arrange - 安排(目標物件)
        Assert.assertEquals(exp, act);
        
        
        

    }

}
