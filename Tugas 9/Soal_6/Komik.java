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
class Komik extends Produk {
    int jumlahHalaman;
    
    Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    void getInfoProduk() {
        super.getInfoProduk();
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}
