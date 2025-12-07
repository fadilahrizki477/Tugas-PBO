/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_6;

/**
 *
 * @author muham
 */
public class Produk {
    String judul;
    String penulis;
    
    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void getInfoProduk() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
