/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_5;

/**
 *
 * @author muham
 */
class Komik extends Produk {
    
    Komik(String judul, String penulis) {
        super(judul, penulis);
    }
    
    void getInfoProduk() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
