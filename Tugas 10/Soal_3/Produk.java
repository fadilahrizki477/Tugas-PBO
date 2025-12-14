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
public class Produk {

    // property milik superclass
    protected String judul;
    protected String penulis;

    // constructor
    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // method yang akan dioverride
    public void getInfoProduk() {
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}
