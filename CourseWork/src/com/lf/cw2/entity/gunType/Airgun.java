/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2.entity.gunType;

import com.lf.cw2.entity.Bullet;
import com.lf.cw2.entity.Gun;
import com.lf.cw2.entity.bulletType.BoatTailBullet;

/**
 *
 * @author bikeshkawan
 */
public class Airgun extends Gun{
    
    // constructor
    public Airgun(){
        // invoking bullet variable form parent abstract class Gun
        
       // bullet = new BoatTailBullet();
      
    }
    // constructor
    public Airgun(Bullet bullet){
        // invoking bullet variable form parent abstract class Gun
        // this.bullet is from parent class Gun
        this.bullet = bullet;
      
    }
    

    @Override
    public void shoot() {
        // invoking bulletType() method of bullet
        System.out.println("Airgun with " + bullet.bulletType() + " bullet is shooting  =============O");
        System.out.println("                                           -------o");
        System.out.println("                                           //");
        System.out.println("                                          //");
    }
    
}
