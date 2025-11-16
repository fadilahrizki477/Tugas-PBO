import java.util.Scanner;

public class Soal_6 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Berapa jumlah bilangan? ");
        int n = input.nextInt();
        
        int[] bilangan = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Bilangan ke-" + (i+1) + ": ");
            bilangan[i] = input.nextInt();
        }
        
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + bilangan[i];
        }
        
        double rataRata = (double) total / n;
        
        System.out.println("\nHasil:");
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
