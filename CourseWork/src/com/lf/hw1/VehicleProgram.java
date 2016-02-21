/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.hw1;

import com.lf.hw1.entity.Bus;
import com.lf.hw1.entity.Car;
import com.lf.hw1.entity.TubeTyre;
import com.lf.hw1.entity.TubeLessTyre;
import com.lf.hw1.entity.Tyre;
import com.lf.hw1.entity.Vehicle;
import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 */
public class VehicleProgram {

    
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle car2 = new Car("Marcedez",new TubeLessTyre());
        //System.out.println(car1.ride());
       //car2.ride();
        car2.ride();
        car1.ride();
        Tyre tyre1 = new TubeLessTyre();
        car1.setTyre(tyre1);        
        car1.ride();
        
        Bus b = new Bus();
       b.ride();
      b.setTyre(new TubeLessTyre());
      b.ride();
        //b.setTyre(new TubeTyre());
        //b.ride();

       // Tyre t = new TubeTyre();
       // System.out.println(t.tyreType());
       // System.out.println(s);
    }
}
