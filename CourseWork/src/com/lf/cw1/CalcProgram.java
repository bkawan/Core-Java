/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw1;

import com.lf.cw1.util.Calculator;

/**
 *
 * @author bikeshkawan
 */
public class CalcProgram {
    
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        System.out.println("Addition: " +c.add(1, 2));
        System.out.println("Subtraction: " + c.sub(10, 5));
        System.out.println("Power: " + c.power(2, 4));
        System.out.println("Max: "  + c.max(100, 300));
        System.out.println("Min:" + c.min(1, 10));
        System.out.println("Divisor: " + c.div(12, 5));
        System.out.println("Multiplication: " + c.multi(3, 5));
    }
}
