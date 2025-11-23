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
class Staff extends Civitas {
    
    Staff(String n) {
        nama = n;
        status = "Staff";
    }
    
    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
    }
}
