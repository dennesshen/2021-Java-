/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.cdc;

/**
 *
 * @author dennesshen
 */
public class CDC {
    //官方欄位
    private String sent;
    private String headline;
    private String description;
    private String circle;
    //客製化資料
    private String distance;

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", headline=" + headline + ", description=" + description + ", circle=" + circle + ", distance=" + distance + '}';
    }
    
    
    
}
