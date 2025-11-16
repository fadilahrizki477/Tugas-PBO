import java.util.Scanner;

public class Soal_5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        
        int[][] matriks = new int[baris][kolom];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Baris " + i + " Kolom " + j + ": ");
                matriks[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMatriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nJumlah Baris: " + baris);
        System.out.println("Jumlah Kolom: " + kolom);
    }
}