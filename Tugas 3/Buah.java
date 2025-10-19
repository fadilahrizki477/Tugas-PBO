package buah;

import java.io.*;

public class Buah {

  
    public static void main(String[] args) {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
        try { 
          
            System.out.print("Jumlah mangga yang dibeli: "); 
            int mangga = Integer.parseInt(br.readLine()); 
             
            System.out.print("Jumlah mangga busuk: "); 
            int manggaBusuk = Integer.parseInt(br.readLine()); 
            
            int manggaBersih = mangga - manggaBusuk; 
             
            System.out.print("Jumlah tetangga: "); 
            int tetangga = Integer.parseInt(br.readLine()); 
            
            System.out.print("Jambu per tetangga: "); 
            int jambuPerOrang = Integer.parseInt(br.readLine()); 
             
            int totalJambu = tetangga * jambuPerOrang; 
            
            int totalBuah = manggaBersih + totalJambu; 
             
            System.out.println("\nHASIL PERHITUNGAN"); 
            System.out.println("Mangga dibeli        : " + mangga); 
            System.out.println("Mangga busuk         : " + manggaBusuk); 
            System.out.println("Mangga yang diterima : " + manggaBersih); 
            System.out.println("Total jambu          : " + totalJambu); 
            System.out.println("TOTAL BUAH           : " + totalBuah); 
 
        } catch (IOException e) { 
            System.out.println("Terjadi kesalahan input!"); 
        } catch (NumberFormatException e) { 
            System.out.println("Input harus berupa angka!"); 
        }
    }
}
