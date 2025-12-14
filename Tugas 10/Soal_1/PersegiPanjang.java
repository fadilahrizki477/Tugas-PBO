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
class PersegiPanjang extends Bentuk {
    double panjang;
    double lebar;
    
    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void luas() {
        double hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
    }
}
