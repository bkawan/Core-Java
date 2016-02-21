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
public class NokiaMobile extends Mobile{

   @Override
    public void makeCall() {
        System.out.println("I can make a call");
    }

  
  @Override
    public void sendMsg() {
        System.out.println("I can send Message");
    }

    @Override
    public void playRingTone() {
        System.out.println("I can Play Ring Tone");
    }
    
}
