/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.hw2.entity;

/**
 *
 * @author bikeshkawan
 */
public class Iphone extends AppleMobile {

     
    
//    public Iphone(String model){
//        this.model = model;
//        System.out.println("This is iphone "+ model);
//    }
    public Iphone(){
    }

    public Iphone(IphoneModel model) {
       super(model);
        this.model = model;
        
    }

     
    
//    public Iphone(String model){
//        this.model = model;
//        System.out.println("This is iphone "+ model);
//    }
    
}
