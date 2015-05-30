/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.springpropertyinjection;

import org.springframework.stereotype.Component;

/**
 *
 * @author mesut
 */
@Component
public class SourceRepo {
    private String soyadi="Soy isim";

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    
}
