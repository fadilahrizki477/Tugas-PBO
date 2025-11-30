/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;
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
        Pangkat p = new Pangkat();
        
        System.out.print("Masukkan basis: ");
        int basis = in.nextInt();
        
        System.out.print("Masukkan pangkat: ");
        int pangkat = in.nextInt();
        
        int hasil = p.hitung(basis, pangkat);
        System.out.println(basis + "^" + pangkat + " = " + hasil);
    }
    
}
