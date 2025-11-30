/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_6;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai[] n = new Nilai[5];
        n[0] = new Nilai(80);
        n[1] = new Nilai(75);
        n[2] = new Nilai(90);
        n[3] = new Nilai(85);
        n[4] = new Nilai(70);
        
        Hitung h = new Hitung();
        double rata = h.hitungRata(n);
        
        System.out.println("Rata-rata: " + rata);
    }
    
}
