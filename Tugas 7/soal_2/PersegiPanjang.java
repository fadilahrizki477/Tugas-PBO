package soal_2;

public class PersegiPanjang {
    double panjang;
    double lebar;
    
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    void tampilkanInfo() {
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar: " + lebar + " cm");
        System.out.println("Keliling: " + hitungKeliling() + " cm");
        System.out.println();
    }
}
