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
public class InkFactoryProgram {
    public static void main(String[] args){
        InkFactory inkFactory = new InkFactory();
        Ink r = inkFactory.getInk("Red");
        //System.out.println(r);
        r.color();
        
        Ink b = inkFactory.getInk("Blue");
        b.color();
        
        Ink n = inkFactory.getInk(null);
       // n.color();
    }
    
}
