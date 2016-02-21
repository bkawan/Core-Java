/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lf.cw2.entity.bulletType;

import com.lf.cw2.entity.Bullet;

/**
 *
 * @author bikeshkawan
 */
public class FrangibleBullet extends Bullet {

    // this is the metho in parent Class Bullet which must be implemented
    @Override
    public String bulletType() {
        return "Frangible";
    }
    
    
    
}
