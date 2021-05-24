/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day31;

/**
 *
 * @author dennesshen
 */
public class Lotto {
    private int lottoNumber;
    private int machineNumber;

    public Lotto(int lottoNumber, int machineNumber) {
        this.lottoNumber = lottoNumber;
        this.machineNumber = machineNumber;
    }

    public int getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(int lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    @Override
    public String toString() {
        return "Lotto{" + "lottoNumber=" + lottoNumber + ", machineNumber=" + machineNumber + '}';
    }
            
    
}
