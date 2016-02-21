/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2;

import com.lf.cw2.entity.Gun;
import com.lf.cw2.entity.bulletType.FrangibleBullet;
import com.lf.cw2.entity.bulletType.MetalCasedBullet;
import com.lf.cw2.entity.gunType.Airgun;
import com.lf.cw2.entity.gunType.Pistol;
import com.lf.cw2.entity.gunType.Rifle;
import com.lf.cw2.entity.gunType.ShotGun;

/**
 *
 * @author bikeshkawan
 */
public class Program {
    
    public static void main(String[] args){
        
        /**
         * both are same 
         */
       Gun a = new Airgun(new MetalCasedBullet());
       a.shoot();
//        a.setBullet(new FrangibleBullet());
//        a.shoot();
        
        Gun r = new Pistol(new FrangibleBullet());
       // r.setBullet(new FrangibleBullet());
        r.shoot();
        
       
//        Airgun aa = new Airgun();
//        aa.shoot();
//        
//        Gun r = new Rifle();
//        r.shoot();
//        
//        Gun p = new Pistol();
//        p.shoot();
//        
//        Gun s = new ShotGun();
//        s.shoot();
//    
}

}