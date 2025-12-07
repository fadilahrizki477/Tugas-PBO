/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_3;

/**
 *
 * @author muham
 */
class HitungVolume extends Kubus {
    
    HitungVolume(double sisi) {
        super(sisi);
    }
    
    double hitungVolume() {
        return getSisi() * getSisi() * getSisi();
    }
}
