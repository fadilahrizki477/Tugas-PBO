/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_7;

/**
 *
 * @author muham
 */
public class Mahasiswa {
    String nama;
    String npm;
    String kelas;
    
    Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    void tampilkan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NPM: " + this.npm);
        System.out.println("Kelas: " + this.kelas);
    }
}
