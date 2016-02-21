/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw1.util;

/**
 *
 * @author bikeshkawan
 */
public class Calculator {
    
    public Calculator(){
        System.out.println("This is simple Calcualtor");
        System.out.println("==============================");
    }
    
    
    public int add(int x, int y){
        
        return x+y;
    }
    
    public int sub(int x, int y){
        
        return x-y;
    }
    
    public int power(int x, int y){
        int total = 1;
        for(int i=1; i<=y; i++){
            total = total * x;
           // System.out.println(x+ "*"+ i + ": ");
          
                                
        }
        return total;
    }
        
        
    public int max(int x, int y){
        
        String max = "Max";
        if(x>y){
            return x;
                     
        }
        return y;
    }
    
    public int min(int x, int y){
    return(x<y)?x:y;
  
    }
    
    public float div(float x, float y ){
        return x/y;
    }
    
    public int multi(int x, int y){
        return x*y;
    }        
         
}
