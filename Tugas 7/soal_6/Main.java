package soal_6;

public class Main {

    public static void main(String[] args) {
        Dosen d = new Dosen("Sutono");
        d.tampilkan();
        System.out.println();
        
        Mahasiswa m = new Mahasiswa("Kiki", "5520124085", "Informatika");
        m.tampilkan();
        System.out.println();
        
        Staff s = new Staff("Yulia");
        s.tampilkan();
    }
    
}
