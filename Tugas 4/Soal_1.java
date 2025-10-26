import java.util.Scanner;
public class Soal_1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int bilangan = s.nextInt();
        
        if(bilangan %2 == 0){
            System.out.println(bilangan + " adalah bilangan genap");
        }else{
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
