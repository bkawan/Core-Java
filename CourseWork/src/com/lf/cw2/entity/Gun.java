/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2.entity;

/**
 *
 * @author bikeshkawan
 */
public abstract class  Gun {
    
    // variable to store Type Bullet object
    // Bullet is abstract class
    // this variable can create 4 type of object of different type of bullet
    // every gun needs a bullet
    protected Bullet bullet;
    
    // abstract method don't need body
    // all the child class should implement this method
    public abstract void shoot();
    public void setBullet(Bullet bullet){
        this.bullet = bullet;
        
        
    }
    
    
    
    
}
