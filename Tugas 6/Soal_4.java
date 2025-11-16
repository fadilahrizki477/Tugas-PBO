import java.util.Scanner;

public class Soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        
        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama mahasiswa: ");
            nama[i] = input.next();
            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();
            if (nilai[i] < 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }
        System.out.println("\nDaftar Nilai Mahasiswa:");
        System.out.println("No\tNama\t\tNilai\tStatus");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t\t" + nilai[i] + "\t" + status[i]);
        }
    }
}
