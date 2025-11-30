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
public class Hitung {
     double hitungRata(Nilai[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total = total + arrayNilai[i].nilai;
        }
        return (double) total / arrayNilai.length;
    }
}
