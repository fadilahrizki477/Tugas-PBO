/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_4;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang b1 = new Barang(10000);
        System.out.println("Total 1: " + b1.hitungTotal());
        
        Barang b2 = new Barang(15000, 3);
        System.out.println("Total 2: " + b2.hitungTotal());
        
        Barang b3 = new Barang(20000, 2, 10);
        System.out.println("Total 3: " + b3.hitungTotal());
    }
    
}
