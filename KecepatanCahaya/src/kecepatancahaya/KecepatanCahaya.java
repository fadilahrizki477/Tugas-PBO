/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kecepatancahaya;

/**
 *
 * @author muham
 */
public class KecepatanCahaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jarak = 384400;
        double waktu = 152.1; 
        double kecepatan = jarak / (waktu / 3600);
        
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Waktu: " + waktu + " detik");
        System.out.println("Kecepatan cahaya: " + kecepatan + " km/jam");
        System.out.println("Kecepatan cahaya: " + (kecepatan * 1000 / 3600) + " m/s");
        // TODO code application logic here
    }
    
}
