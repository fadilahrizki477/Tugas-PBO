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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // polimorfisme
        Produk p1 = new Komik("Naruto", "Masashi Kishimoto", 200);
        Produk p2 = new Games("GTA V", "Rockstar", "100 Jam");

        System.out.println("=== Info Komik ===");
        p1.getInfoProduk();

        System.out.println();

        System.out.println("=== Info Games ===");
        p2.getInfoProduk();
    }
    
}
