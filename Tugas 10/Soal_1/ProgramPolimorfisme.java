/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;

/**
 *
 * @author muham
 */
public class ProgramPolimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bentuk b1 = new PersegiPanjang(5, 3);
        Bentuk b2 = new Segitiga(4, 6);
        Bentuk b3 = new Lingkaran(7);
        
        b1.luas();
        b2.luas();
        b3.luas();
    }
    
}
