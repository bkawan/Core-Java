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
public class Bus  extends Vehicle{

     public String busMake ;
    public Bus(){
        this.tyre = new TubeTyre();
        this.busMake = "Mercedez";
        
        
    }
    @Override
    public void ride() {
        System.out.println("Your are riding a " +busMake+ " bus which has " + tyre.tyreType() + " tyre with " + tyre.tyreLife() + " years guarantee. It has " + noOfWheels() + " Wheels");
    }
    
//    public static void main(String[] args){
//            System.out.println("You are riding a  Bus with " + tyre.tyreType() + "Tyre");
//
//    }

    @Override
    public int noOfWheels() {
        return 6;
    }
}
