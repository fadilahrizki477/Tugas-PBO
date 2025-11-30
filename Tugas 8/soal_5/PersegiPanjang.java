/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_5;

/**
 *
 * @author muham
 */
public class PersegiPanjang {
     int panjang;
    int lebar;
    
    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    int hitungLuas() {
        return panjang * lebar;
    }
}
