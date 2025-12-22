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
public class Soal_2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int angka = input.nextInt();
            jumlah += angka;
        }

        double rata = (double) jumlah / n;
        System.out.println("Total jumlah bilangan: " + jumlah);
        System.out.println("Rata-rata: " + rata);
    }
}
