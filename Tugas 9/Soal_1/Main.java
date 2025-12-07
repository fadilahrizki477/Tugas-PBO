/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;
class Hewan {
    String nama;
    
    void info() {
        System.out.println("Ini adalah hewan");
    }
}
/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        System.out.println("- hewan berkaki dua");
        System.out.println("- hewan berkaki enam");
        System.out.println("- hewan berkaki empat");
        
        System.out.println("Contoh hewan:");
        
        HewanBerkakiDua h1 = new HewanBerkakiDua();
        System.out.print("- hewan berkaki dua: ");
        h1.contoh();
        
        HewanBerkakiEnam h2 = new HewanBerkakiEnam();
        System.out.print("- hewan berkaki enam: ");
        h2.contoh();
        
        HewanBerkakiEmpat h3 = new HewanBerkakiEmpat();
        System.out.print("- hewan berkaki empat: ");
        h3.contoh();
    }
    
}
