package menghitung.gaya;

import java.util.Scanner;

public class MenghitungGaya {

   public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
           System.out.print("Masukkan massa (kg): ");
           double m = input.nextDouble();
           
           System.out.print("Masukkan kecepatan (m/s): ");
           double v = input.nextDouble();
           
           System.out.print("Masukkan jari-jari (m): ");
           double r = input.nextDouble();
           
           double F = (m * v * v) / r;
           
           System.out.println("\nHASIL PERHITUNGAN");
           System.out.println("Massa (m): " + m + " kg");
           System.out.println("Kecepatan (v): " + v + " m/s");
           System.out.println("Jari-jari (r): " + r + " m");
           System.out.println("Gaya Sentripetal (F): " + F + " N");
       }
    }
    
}
