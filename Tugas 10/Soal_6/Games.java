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
public class Games extends Produk {

    private String waktuMain;

    public Games(String judul, String penulis, String waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    // override method abstract
    @Override
    public void getInfoProduk() {
        System.out.println("Judul      : " + getJudul());
        System.out.println("Penulis    : " + getPenulis());
        System.out.println("Waktu Main : " + waktuMain);
    }
}
