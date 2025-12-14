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
public abstract class Produk {

    // property private (enkapsulasi)
    private String judul;
    private String penulis;

    // constructor
    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // abstract method (WAJIB dioverride)
    public abstract void getInfoProduk();
}
