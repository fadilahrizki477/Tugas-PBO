package menghitung.gaji.bersih;

import java.util.Scanner;

public class MenghitungGajiBersih {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nomor Induk Karyawan: ");
            long nomorInduk = input.nextLong();
            
            System.out.print("Nama Karyawan: ");
            String namaKaryawan = input.nextLine();
            namaKaryawan = input.nextLine(); 
            
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            
            System.out.print("Jabatan: ");
            String jabatan = input.nextLine();
            
            System.out.print("Gaji Pokok: ");
            double gajiPokok = input.nextDouble();
            
            System.out.print("Tunjangan Jabatan: ");
            double tunjanganJabatan = input.nextDouble();
            
            System.out.print("Tunjangan Istri: ");
            double tunjanganIstri = input.nextDouble();
            
            System.out.print("Tunjangan Anak: ");
            double tunjanganAnak = input.nextDouble();
            
            double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
            double pajakPenghasilan = 0.10 * (gajiPokok + tunjanganJabatan + tunjanganIstri);
            double gajiBersih = totalGaji - pajakPenghasilan;
            
            System.out.println("Nomor Induk: " + nomorInduk);
            System.out.println("Nama: " + namaKaryawan);
            System.out.println("Alamat: " + alamat);
            System.out.println("Jabatan: " + jabatan);
            System.out.println("Gaji Pokok: Rp" + gajiPokok);
            System.out.println("Tunjangan Jabatan: Rp" + tunjanganJabatan);
            System.out.println("Tunjangan Istri: Rp" + tunjanganIstri);
            System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
            System.out.println("Total Gaji: Rp" + totalGaji);
            System.out.println("Pajak Penghasilan (10%): Rp" + pajakPenghasilan);
            System.out.println("Gaji Bersih: Rp" + gajiBersih);
        }
    }
    
}
