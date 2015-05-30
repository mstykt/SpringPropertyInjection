/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mesut.springpropertyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author mesut
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("com.mesut");
        context.refresh();
        
        Person person=context.getBean(Person.class);
        System.out.println("Sonuc: "+person);
        context.close();
    }
}
