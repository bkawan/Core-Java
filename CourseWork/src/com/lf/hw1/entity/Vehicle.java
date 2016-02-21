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
public abstract class Vehicle {
    
    protected   Tyre tyre;
   // protected Brand brand;
    
    public abstract void ride();
    public abstract int noOfWheels();
    public void setTyre(Tyre tyre){
        System.out.println("Tire has changed into: " + tyre.tyreType());
        this.tyre = tyre;
    }
        
//    public static void main(String[] args) {
//        System.out.println(tyre);
//    }

    public void changeVehicle(){
        
    }
    
    
}
