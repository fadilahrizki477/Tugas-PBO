/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;

/**
 *
 * @author muham
 */
public class Pangkat {
     int hitung(int basis, int pangkat) {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * basis;
        }
        return hasil;
    }
}
