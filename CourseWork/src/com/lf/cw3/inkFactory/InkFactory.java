/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw3.inkFactory;

/**
 *
 * @author bikeshkawan
 */
public class InkFactory {
    /**
     * 
     * @param inkColor
     * @return ink object
     */
    public Ink getInk(String inkColor){
        if(inkColor == null){
            return null;
        }
        if(inkColor.equalsIgnoreCase("Red")){
            //return new RedInk();
            return  new RedInk();
        }else if (inkColor.equalsIgnoreCase("Blue")){
           return new BlueInk();
        }
        
         return null;
    }
   
    
}
