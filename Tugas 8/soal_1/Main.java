/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1;
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
        Faktorial f = new Faktorial();
        
        System.out.print("Masukkan nilai: ");
        int n = in.nextInt();
        
        int hasil = f.hitung(n);
        System.out.println(n + "! = " + hasil);
        
        in.close();
    }
    
}
