import java.util.Scanner;
public class Soal_6 {
     public static void main(String[] args) {
        Scanner ksr = new Scanner(System.in);
        double totalBelanja, diskon = 0, totalBayar, uangDiberikan, kembalian;
        String member;

        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        member = ksr.next();

        System.out.print("Masukkan total belanja: Rp ");
        totalBelanja = ksr.nextDouble();

        if (member.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else { 
            if (totalBelanja > 100000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }

        totalBayar = totalBelanja - diskon;

        System.out.println("Total belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("Total bayar   : Rp " + totalBayar);
        System.out.print("Uang diberikan: Rp ");
        uangDiberikan = ksr.nextDouble();

        kembalian = uangDiberikan - totalBayar;
        System.out.println("Kembalian     : Rp " + kembalian);
    }
}
