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
 * @time 12:38:13 PM
 */
public class ArraySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 40, 4, 5, 10};
        int num = 5;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == num) {
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("I am found");
        }else{
            System.out.println("I am not found");
        }

    }

}
