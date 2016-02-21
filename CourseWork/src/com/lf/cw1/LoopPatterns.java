package com.lf.cw1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikeshkawan
 */
public class LoopPatterns {
    
    public static void main(String[] args){
    
        for(int row=1; row<=5; row++){
              for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            
            System.out.println("*");
            
        }
        
      
       
         for(int row=5; row>=1; row--){
              for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            
            System.out.println("*");
            
            
            
        }
         System.out.println("############################");
        
         for(int row=5; row>=1; row--){
             for(int col=1; col<=row; col++){
                 System.out.print(row);
             }
             System.out.println("*");
             
         }
        
        
         for(int row=1; row<=5; row++){
             for(int col=1; col<=row; col++){
                 System.out.print(row);
             }
             System.out.println("*");
             
         }
         System.out.println("###############################");
         
           for(int row=1; row<=5; row++){
             for(int col=5; col>=row; col--){
                 System.out.print(row);
             }
             System.out.println("*");
             
         }
           
            for(int row=5; row>=1; row--){
             for(int col=5; col>=row; col--){
                 System.out.print(row);
             }
             System.out.println("*");
             
         }
           
            System.out.println("###############################");
         
           for(int row=1; row<=5; row++){
             for(int col=5; col>=row; col--){
                 System.out.print(col);
             }
             System.out.println("*");
             
         }
             
         
           for(int row=5; row>=1; row--){
             for(int col=5; col>=row; col--){
                 System.out.print(col);
             }
             System.out.println("*");
             
         }
           
           System.out.println("#########################");
       
         for(int row=5; row>=1; row--){
              for(int col=1; col<=5; col++){
                System.out.print(row);
            }
            
            System.out.println("*");         
                     
        }
     
       
         for(int row=1; row<=5; row++){
              for(int col=1; col<=5; col++){
                System.out.print(row);
            }
            
            System.out.println("*");
            
                       
        }
         
    }
    
    
 

    
    
}
