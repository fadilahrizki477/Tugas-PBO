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
class Games extends Produk {
    String waktuMain;
    
    Games(String judul, String penulis, String waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }
    
    void getInfoProduk() {
        super.getInfoProduk();
        System.out.println("Waktu Main: " + waktuMain);
    }
}
