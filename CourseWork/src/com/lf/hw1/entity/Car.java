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
public class Car extends Vehicle{
    
    public String carMake;

    // constructor with now argument 
    //by default it has Tube Tyre
    public Car(){
        this.carMake = "BMW";
        this.tyre = new TubeTyre();
    }
    public Car(String carMake,Tyre tyre){
        //this.tyre is from parent calss Vehicle
        this.tyre = tyre;
        this.carMake = carMake;
    }
    @Override
    public void ride() {
        System.out.println("Your are riding a " +carMake+ " car which has " + tyre.tyreType() + " tyre with " + tyre.tyreLife() + " years guarantee. It has " + noOfWheels() + " Wheels");
    }

    @Override
    public int noOfWheels() {
        return 4;
    }
    
}
