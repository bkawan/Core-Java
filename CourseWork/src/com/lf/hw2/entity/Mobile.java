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
public abstract class Mobile {
    
    public RingTone tone;
    public String msg;
    
    
    public abstract void makeCall();
    public abstract void sendMsg();
    public abstract void playRingTone();
    public void setMessage(String msg){
        
    }
    
            
    
    
}
