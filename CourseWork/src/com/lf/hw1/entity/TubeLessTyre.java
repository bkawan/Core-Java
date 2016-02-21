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
public class TubeLessTyre extends Tyre {

    @Override
    public String tyreType() {
        return "Tubeless";
    }

    @Override
    public int tyreLife() {
        return 10;
    }
    
    
    
}
