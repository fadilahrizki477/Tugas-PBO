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
public class Mobil extends Kendaraan {

    public Mobil(String nama, String jenis) {
        super(nama, jenis);
    }

    @Override
    public void informasi() {
        System.out.println("Mobil");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}
