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
public abstract class Ink {
    
    public abstract void color();
    public String isNull(){
        
        return "Sorry we don't have that ink";
    }
}
