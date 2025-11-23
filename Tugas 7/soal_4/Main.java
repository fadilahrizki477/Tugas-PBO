package soal_4;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEKS SUMPAH PEMUDA");
        System.out.println();
        
        SumpahPemuda ikrar1 = new SumpahPemuda();
        ikrar1.tambahKalimat("Mengaku bertumpah darah yang satu, tanah air Indonesia");
        ikrar1.tampilkan();
        System.out.println();
        
        SumpahPemuda ikrar2 = new SumpahPemuda();
        ikrar2.tambahKalimat("Mengaku berbangsa yang satu, bangsa Indonesia");
        ikrar2.tampilkan();
        System.out.println();
        
        SumpahPemuda ikrar3 = new SumpahPemuda();
        ikrar3.tambahKalimat("Menjunjung bahasa persatuan, bahasa Indonesia");
        ikrar3.tampilkan();
    }
    
}
