/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_2;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HitungLuas s = new HitungLuas(10, 5);
        
        System.out.println("Alas: " + s.alas);
        System.out.println("Tinggi: " + s.tinggi);
        System.out.println("Luas: " + s.hitungLuas());
    }
    
}
