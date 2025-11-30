/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_3;

/**
 *
 * @author muham
 */
public class Konversi {
    String toBiner(int n) {
        String biner = "";
        while (n > 0) {
            int sisa = n % 2;
            biner = sisa + biner;
            n = n / 2;
        }
        return biner;
    }
}
