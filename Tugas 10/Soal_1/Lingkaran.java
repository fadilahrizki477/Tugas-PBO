/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;

/**
 *
 * @author muham
 */
class Lingkaran extends Bentuk {
    double jariJari;
    
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    void luas() {
        double hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + hasil);
    }
}
