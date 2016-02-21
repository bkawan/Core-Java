/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2.entity.gunType;

import com.lf.cw2.entity.Bullet;
import com.lf.cw2.entity.Gun;
import com.lf.cw2.entity.bulletType.FrangibleBullet;

/**
 *
 * @author bikeshkawan
 */
public class Pistol extends Gun {
    
    public Pistol(){
    }
    public Pistol(Bullet bullet){
        //this.bullet is from parrent
        this.bullet = bullet;
    }

    @Override
    public void shoot() {
        System.out.println("Pistol  with " + bullet.bulletType()+ " bullet is shooting");
    }
    
}
