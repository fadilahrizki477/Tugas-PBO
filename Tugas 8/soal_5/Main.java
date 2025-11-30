/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_5;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi putih = new Persegi(8);
        Persegi abu = new Persegi(10);
        
        Hitung h = new Hitung();
        
        h.tampilkanLuas(putih);
        h.tampilkanLuas(abu);
        
        int luasBayangan = h.hitungLuasBayangan(putih, abu);
        System.out.println("Luas Bayangan: " + luasBayangan);
    }
    
}
