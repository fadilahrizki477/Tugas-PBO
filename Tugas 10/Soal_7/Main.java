/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_7;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil m = new Mobil("Porsche 911 GT3RS", "Darat");
        Pesawat p = new Pesawat("Boeing", "Udara");
        KapalLaut k = new KapalLaut("Peri", "Laut");

        m.informasi();
        System.out.println();

        p.informasi();
        System.out.println();

        k.informasi();
    }
    
}
