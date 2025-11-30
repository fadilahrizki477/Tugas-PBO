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
public class Barang {
    double harga;
    int jumlah;
    double diskon;
    
    Barang(double harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }
    
    Barang(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }
    
    Barang(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }
    
    double hitungTotal() {
        double total = harga * jumlah;
        total = total - (total * diskon / 100);
        return total;
    }
}
