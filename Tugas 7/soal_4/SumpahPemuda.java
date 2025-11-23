package soal_4;

public class SumpahPemuda {
    String kalimat1;
    String kalimat2;
    
    SumpahPemuda() {
        kalimat1 = "Kami putra dan putri Indonesia";
        kalimat2 = "";
    }
    
    void tambahKalimat(String kalimat) {
        kalimat2 = kalimat;
    }
    
    void tampilkan() {
        System.out.println(kalimat1);
        System.out.println(kalimat2);
    }
}
