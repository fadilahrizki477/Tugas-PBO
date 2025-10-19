package selisih.waktu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SelisihWaktu {

    
    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in))) {
            System.out.println("PROGRAM HITUNG SELISIH WAKTU\n");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");           
            System.out.print("Masukkan waktu pertama (HH:mm:ss): ");
            String waktuPertamaStr = input.readLine();
            System.out.print("Masukkan waktu kedua (HH:mm:ss): ");
            String waktuKeduaStr = input.readLine();
             
                Date waktuPertama = sdf.parse(waktuPertamaStr);
                Date waktuKedua = sdf.parse(waktuKeduaStr);
                
                long selisihMs = Math.abs(waktuKedua.getTime() - waktuPertama.getTime());
                
                long jam = selisihMs / 3600000;
                long menit = (selisihMs % 3600000) / 60000;
                long detik = (selisihMs % 60000) / 1000;
                
                System.out.println("\nHASIL PERHITUNGAN");
                System.out.println("Waktu Pertama: " + waktuPertamaStr);
                System.out.println("Waktu Kedua: " + waktuKeduaStr);
                System.out.println("\n--- SELISIH WAKTU ---");
                System.out.println("Selisih: " + jam + " jam " + menit + " menit " + detik + " detik");
                System.out.println("Total Detik: " + (selisihMs / 1000) + " detik");                    
        }
        
    }
}
