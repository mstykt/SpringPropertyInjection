/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.springpropertyinjection.xml;

import org.springframework.stereotype.Component;

/**
 *
 * @author mesut
 */
public class SRepo {
    private String soyadi1="Soy isim 1";

    public String getSoyadi1() {
        return soyadi1;
    }

    public void setSoyadi1(String soyadi1) {
        this.soyadi1 = soyadi1;
    }
    
}
