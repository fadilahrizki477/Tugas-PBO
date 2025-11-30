/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_3;
import java.util.Scanner;
/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Konversi k = new Konversi();
        
        System.out.print("Masukkan bilangan bulat: ");
        int n = in.nextInt();
        
        String biner = k.toBiner(n);
        System.out.println("Biner: " + biner);
    }
    
}
