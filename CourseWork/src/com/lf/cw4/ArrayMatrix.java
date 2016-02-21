/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw4;

/**
 *
 * @author bkawan
 * @date Feb 21, 2016
 * @time 1:35:28 PM
 */
public class ArrayMatrix {

    public static void main(String[] args) {

        
        int[][] n = new int[1][1];
        int x = 5;
        for(int i=0; i<1; i++){
            for(int j=0; j<1; j++){
                n[i][j] = x;
                x = x+5;
                System.out.println(n[i][j]);
                
            }
             
        }
        

    }

}
