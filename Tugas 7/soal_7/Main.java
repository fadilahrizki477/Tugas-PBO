/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_7;

/**
 *
 * @author muham
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = in.nextLine();
        
        System.out.print("NPM: ");
        String npm = in.nextLine();
        
        System.out.print("Kelas: ");
        String kelas = in.nextLine();
        
        Mahasiswa m = new Mahasiswa(nama, npm, kelas);
        
        System.out.println();
        m.tampilkan();
        
        in.close();
    }
    
}
