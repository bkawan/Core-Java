/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw1;

/**
 *
 * @author bikeshkawan
 */
public class SimpleMultiplaction {
    
    public static void main (String[] args){
        System.out.println("Hello, worlhhhd" + args);
        int num = 3;
        for(int i =1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
            
        }
            System.out.println("------------------------------------");
               
            for(int i = 1; i<=10; i++){
                
                for(int j=1; j<=10; j++){
                    
                  System.out.println(i + " * " + j + " = " + (i*j));
                 
                }
                 System.out.println("------------------------------------");
            }
    }
    
   
}
