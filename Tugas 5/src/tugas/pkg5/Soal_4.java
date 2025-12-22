/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;
import java.util.Scanner;
/**
 *
 * @author muham
 */
public class Soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();

        int jumlah = 0;
        int angka = 1;

        System.out.print("Angka ganjil: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            jumlah += angka;
            angka += 2;
        }

        System.out.println("\nTotal penjumlahan: " + jumlah);
    }
}
