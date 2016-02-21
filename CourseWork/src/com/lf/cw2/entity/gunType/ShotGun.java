/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2.entity.gunType;

import com.lf.cw2.entity.Gun;

/**
 *
 * @author bikeshkawan
 */
public class ShotGun extends Gun {

    @Override
    public void shoot() {
        System.out.println(bullet.bulletType()+ "Shot Gun is shooting");
    }
    
}
