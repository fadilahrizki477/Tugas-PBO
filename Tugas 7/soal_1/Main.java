package soal_1;

public class Main {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Merah";
        mobil1.tahun = 2023;
        
        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda";
        mobil2.warna = "Hitam";
        mobil2.tahun = 2024;

        System.out.println("=== CONTOH KELAS DAN OBJEK ===");
        mobil1.info();
        mobil2.info();
    }
}

/* PENJELASAN MEKANISME:
 * 1. KELAS adalah blueprint/template yang mendefinisikan:
 *    - Atribut (variabel): merk, warna, tahun
 *    - Method (fungsi): info()
 * 
 * 2. OBJEK adalah instance konkret dari kelas yang dibuat dengan kata kunci 'new':
 *    - mobil1 dan mobil2 adalah objek dari kelas Mobil
 *    - Setiap objek memiliki nilai atribut sendiri
 *    - Objek dapat mengakses method yang didefinisikan di kelas
 * 
 * 3. PROSES:
 *    a. Deklarasi: Mobil mobil1; (mendeklarasikan variabel tipe Mobil)
 *    b. Instansiasi: new Mobil(); (membuat objek baru di memori)
 *    c. Inisialisasi: mobil1.merk = "Toyota"; (mengisi nilai atribut)
 *    d. Pemanggilan method: mobil1.info(); (menggunakan fungsi objek)
 */