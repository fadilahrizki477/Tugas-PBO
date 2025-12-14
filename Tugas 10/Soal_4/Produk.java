/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_4;

/**
 *
 * @author muham
 */
public class Produk {

    // property hanya bisa diakses subclass
    protected String judul;
    protected String penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}
