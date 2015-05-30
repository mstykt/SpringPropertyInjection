/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.springpropertyinjection.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mesut
 */
public class AppXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        context.refresh();
        Person2 person=context.getBean("person2",Person2.class);
        System.out.println("Sonuc: "+person);
    }
}
