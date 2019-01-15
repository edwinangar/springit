/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author edwinangar
 */
@ConfigurationProperties("springit")
public class SpringitProperties {
    /**
     * this is our first welcome message
     */
    private String welcomeMsg="Hello,world";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
    
    
}
