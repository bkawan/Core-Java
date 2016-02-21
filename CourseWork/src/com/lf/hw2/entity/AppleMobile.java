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
public abstract class AppleMobile extends Mobile implements Camera {
    
    protected IphoneModel model;
    public AppleMobile(){
        System.out.println("This is Iphone.");
        makeCall();
        sendMsg();
        playRingTone();
        takePic();
        recordVid();
    }
      public AppleMobile(IphoneModel model){
          this.model = model;
        System.out.println("This is " + model.modelType() + ". " );
        makeCall();
        sendMsg();
        playRingTone();
        takePic();
        recordVid();
    }
    

    //from abstract class Mobile
    @Override
    public void makeCall() {
        System.out.println("You can make a call");
    }

    //from abstract class Mobile
    @Override
    public void sendMsg() {
        System.out.println("Your can send a Message");
    }

    //from abstract class Mobile
    @Override
    public void playRingTone() {
        System.out.println("You can Play Ring Tone");
    }

    // from interface camera
    @Override
    public void takePic() {
        System.out.println("You can take  a photo");
    }

    @Override
    // from interface camera
    public void recordVid() {
        System.out.println("You can record a Video. ");
    }

    
}
