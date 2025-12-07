/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_3;
class Kubus {
    private double sisi;
    
    Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    double getSisi() {
        return sisi;
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
        HitungVolume k = new HitungVolume(5);
        
        System.out.println("Sisi: " + k.getSisi());
        System.out.println("Volume: " + k.hitungVolume());
    }
    
}
