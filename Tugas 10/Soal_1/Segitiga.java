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
class Segitiga extends Bentuk {
    double alas;
    double tinggi;
    
    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    void luas() {
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + hasil);
    }
}
