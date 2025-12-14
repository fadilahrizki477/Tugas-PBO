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
public class Games extends Produk {

    // property milik subclass
    private String waktuMain;

    // constructor
    public Games(String judul, String penulis, String waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    // override method
    @Override
    public void getInfoProduk() {
        super.getInfoProduk(); // panggil property superclass
        System.out.println("Waktu Main     : " + waktuMain);
    }
}
