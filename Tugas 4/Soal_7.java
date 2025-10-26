import java.util.Scanner;
public class Soal_7 {
     public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        System.out.println("Menu Luas Bangun Datar:");
        System.out.println("1. Persegi\n2. Segitiga\n3. Lingkaran\n4. Trapesium\n5. Layang-layang");
        System.out.print("Pilih (1-5): ");
        int pilih = ls.nextInt();
        double luas = 0;

        switch (pilih) {
            case 1:
                System.out.print("Sisi: ");
                double s = ls.nextDouble();
                luas = s * s; break;
            case 2:
                System.out.print("Alas: ");
                double a = ls.nextDouble();
                System.out.print("Tinggi: ");
                double t = ls.nextDouble();
                luas = 0.5 * a * t; break;
            case 3:
                System.out.print("Jari-jari: ");
                double r = ls.nextDouble();
                luas = 3.14 * r * r; break;
            case 4:
                System.out.print("Sisi atas: ");
                double atas = ls.nextDouble();
                System.out.print("Sisi bawah: ");
                double bawah = ls.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = ls.nextDouble();
                luas = 0.5 * (atas + bawah) * tinggi; break;
            case 5:
                System.out.print("Diagonal 1: ");
                double d1 = ls.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = ls.nextDouble();
                luas = 0.5 * d1 * d2; break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        System.out.println("Luas = " + luas);
    }
}
