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
public class Komik extends Produk {

    private int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    // method di subclass untuk mengakses property protected
    public void tampilInfo() {
        System.out.println("Judul          : " + judul);      // dari superclass
        System.out.println("Penulis        : " + penulis);    // dari superclass
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}
