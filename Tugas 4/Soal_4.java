import java.util.Scanner;
public class Soal_4 {
     public static void main(String[] args) {
        Scanner thn = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = thn.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0))
            System.out.println(tahun + " adalah tahun KABISAT");
        else
            System.out.println(tahun + " bukan tahun kabisat");
    }
}
