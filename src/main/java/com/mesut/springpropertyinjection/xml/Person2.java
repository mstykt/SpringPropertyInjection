/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.springpropertyinjection.xml;

/**
 *
 * @author mesut
 */
public class Person2 {
    private String adi1;
    private String soyadi1;

    public String getAdi1() {
        return adi1;
    }

    public void setAdi1(String adi1) {
        this.adi1 = adi1;
    }

    public String getSoyadi1() {
        return soyadi1;
    }

    public void setSoyadi1(String soyadi1) {
        this.soyadi1 = soyadi1;
    }

    @Override
    public String toString() {
        return "Person{" + "adi1=" + adi1 + ", soyadi1=" + soyadi1 + '}';
    }
    
}
