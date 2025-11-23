package soal_2;

public class Main {

    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 10;
        persegi1.lebar = 5;
        
        System.out.println("=== Persegi Panjang 1 ===");
        persegi1.tampilkanInfo();
        
        PersegiPanjang persegi2 = new PersegiPanjang();
        persegi2.panjang = 15;
        persegi2.lebar = 8;
        
        System.out.println("=== Persegi Panjang 2 ===");
        persegi2.tampilkanInfo();
        
        PersegiPanjang persegi3 = new PersegiPanjang();
        persegi3.panjang = 20;
        persegi3.lebar = 12;
        
        System.out.println("=== Persegi Panjang 3 ===");
        persegi3.tampilkanInfo();
    }
    
}
