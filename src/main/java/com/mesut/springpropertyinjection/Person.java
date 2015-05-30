/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mesut.springpropertyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author mesut
 */
@Component
public class Person {
    @Value("${adi}")//Propery dosyasından alınan değerdir
    private String adi;
    @Value("#{sourceRepo.soyadi}")
    private String soyadi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "Person{" + "adi=" + adi + ", soyadi=" + soyadi + '}';
    }
    

}
