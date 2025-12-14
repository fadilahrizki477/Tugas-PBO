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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Komik k = new Komik("Naruto", "Masashi Kishimoto", 200);
        System.out.println("=== Info Komik ===");
        k.getInfoProduk();

        System.out.println();

        Games g = new Games("GTA V", "Rockstar", "100 Jam");
        System.out.println("=== Info Games ===");
        g.getInfoProduk();
    }
    
}
