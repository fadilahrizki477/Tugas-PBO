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
public class Produk {
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

    // setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
