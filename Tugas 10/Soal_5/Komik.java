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
public class Komik extends Produk {

    private int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    // akses property superclass lewat getter
    public void tampilInfo() {
        System.out.println("Judul          : " + getJudul());
        System.out.println("Penulis        : " + getPenulis());
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}
