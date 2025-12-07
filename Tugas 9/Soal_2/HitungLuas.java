/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_2;

/**
 *
 * @author muham
 */
class HitungLuas extends Segitiga {
    
    HitungLuas(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
