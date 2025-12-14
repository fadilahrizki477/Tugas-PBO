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
public class Kendaraan {
    protected String nama;
    protected String jenis;

    public Kendaraan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void informasi() {
        System.out.println("Informasi Kendaraan");
    }
}
