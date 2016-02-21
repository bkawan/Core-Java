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
 * @time 12:59:30 PM
 */
public class ArraySorting {
    

    public static void main(String[] args){
        int[] numbers = {1,5,2};
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    
                int temp = numbers[i];               
                numbers[i] = numbers[j];
                numbers[j] = temp;
                }               
            }
            
        }
        for(int i=0; i<numbers.length; i++){
        System.out.println(numbers[i] + ", ");
        }

}

}