/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.application;

import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

/**
 *
 * @author ben
 */
@UIScope
@SpringComponent
public class SimpleUIScopeService {

    String hello = "hello";

    public SimpleUIScopeService() {
        System.out.println("SimpleUIScopeService created");
    }

}
