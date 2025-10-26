import java.util.Scanner;
public class Soal_5 {
      public static void main(String[] args) {
        Scanner kms = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari ini: ");
        double jual = kms.nextDouble();
        double jasa = 0, komisi = 0;

        if (jual <= 2000000) {
            jasa = 100000;
            komisi = jual * 0.10;
        } else if (jual <= 5000000) {
            jasa = 200000;
            komisi = jual * 0.15;
        } else {
            jasa = 300000;
            komisi = jual * 0.20;
        }

        double total = jasa + komisi;
        System.out.println("Uang jasa: " + jasa);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total pendapatan: " + total);
    }
}
