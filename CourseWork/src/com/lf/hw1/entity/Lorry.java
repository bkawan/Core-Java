/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.hw1.entity;

/**
 *
 * @author bikeshkawan
 */
public class Lorry extends Vehicle {

    @Override
    public void ride() {
        System.out.println("Your are riding Lorry");
    }

    @Override
    public int noOfWheels() {
        return 10;
    }
    
   
    
}
