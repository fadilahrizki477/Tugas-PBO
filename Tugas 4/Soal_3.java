import java.util.Scanner;
public class Soal_3 {
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
        
        String nik,nama,status;
        int gol;
        double gapok,anak,gaber=0;
        double tnjpas,tnjanak;
        
        System.out.print("Masukan NIK Karyawan : ");
        nik=gaji.next();
        System.out.print("Masukan Nama Karyawan : ");
        nama=gaji.next();
        System.out.print("Masukan Kode Golongan [1/2/3/4] : ");
        gol=gaji.nextInt();
        
        switch (gol) {
            case 1:
                status="Menikah";
                gapok=1200000;
                tnjpas=0.1*gapok;
                gaber=gapok+tnjpas;
                break;
            case 2:
                status="Belum Menikah";
                gapok=1500000;
                tnjpas=0;
                gaber=gapok+tnjpas;
                break;
            case 3:
                status="Cerai";
                gapok=1750000;
                tnjpas=0;
                gaber=gapok+tnjpas;
                break;
            case 4:
                status="Menikah dan Punya Anak";
                gapok=2000000;
                System.out.print("Masukan Jumlah Anak : ");
                anak=gaji.nextInt();
                tnjanak= 0.5*gapok*anak;
                tnjpas=0.1*gapok;
                gaber=gapok+tnjpas+tnjanak;
                break;
            default:
                status="Tidak Kode Golongan";
                gapok=0;
                break;
        }    
            
        
        System.out.println("==========Data Karyawan===========");
        System.out.println("NIK Karyawan : "+nik);
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Kode Golongan : "+gol);
        System.out.println("Status Kawin : "+status);
        System.out.println("Gaji Pokok : "+gapok);
        System.out.println("Gaji Bersih : "+gaber);
                
        
    }
}
