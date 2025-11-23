package soal_6;

class Dosen extends Civitas {
    
    Dosen(String n) {
        nama = n;
        status = "Dosen";
    }
    
    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
    }
}
