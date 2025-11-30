/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_5;

/**
 *
 * @author muham
 */
public class Hitung {
    void tampilkanLuas(Persegi p) {
        System.out.println("Luas Persegi: " + p.hitungLuas());
    }
    
    void tampilkanLuas(PersegiPanjang pp) {
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
    }
    
    int hitungLuasBayangan(Persegi putih, Persegi abu) {
        return abu.hitungLuas() - putih.hitungLuas();
    }
}
