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
public class Komik extends Produk {

    // property milik subclass
    private int jumlahHalaman;

    // constructor
    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    // override method
    @Override
    public void getInfoProduk() {
        super.getInfoProduk(); // panggil property superclass
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }
}
