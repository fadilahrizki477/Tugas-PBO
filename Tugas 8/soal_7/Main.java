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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Angka a1 = new Angka(6);
        Angka a2 = new Angka(12);
        Angka a3 = new Angka(24);
        Angka a4 = new Angka(48);
        Angka a5 = new Angka(96);
        
        System.out.println("Nilai Awal:");
        a1.tampilkan();
        a2.tampilkan();
        a3.tampilkan();
        a4.tampilkan();
        a5.tampilkan();
        
        Ubah u = new Ubah();
        
        u.kali2(a1);
        u.kali2(a2);
        u.kali2(a3);
        u.kali2(a4);
        u.kali2(a5);
        
        System.out.println("\nSetelah dikali 2:");
        a1.tampilkan();
        a2.tampilkan();
        a3.tampilkan();
        a4.tampilkan();
        a5.tampilkan();
        
        u.tambah10(a1);
        u.tambah10(a2);
        u.tambah10(a3);
        u.tambah10(a4);
        u.tambah10(a5);
        
        System.out.println("\nSetelah ditambah 10:");
        a1.tampilkan();
        a2.tampilkan();
        a3.tampilkan();
        a4.tampilkan();
        a5.tampilkan();
    }
    
}
