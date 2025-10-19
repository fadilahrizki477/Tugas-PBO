
package datainputstream.dan.dataoutputstream;

import java.io.*;
import java.util.Scanner;

public class DataInputStreamDanDataOutputStream {

    
   public static void main(String[] args) throws IOException {
       try (Scanner input = new Scanner(System.in)) {
           System.out.print("Nama : ");
           String nama = input.nextLine();
           
           System.out.print("Total Belanja: ");
           double totalBelanja = input.nextDouble();
           
           System.out.print("Diskon (%): ");
           double diskon = input.nextDouble();
           
           double totalDiskon = totalBelanja * (diskon / 100);
           double total = totalBelanja - totalDiskon;
           
           System.out.print("Bayar: ");
           double bayar = input.nextDouble();
           
           double kembalian = bayar - total;
           
           try ( 
                  DataOutputStream dos = new DataOutputStream(
                         new FileOutputStream("data_penjualan.dat"))) {
               dos.writeUTF(nama);
               dos.writeDouble(totalBelanja);
               dos.writeDouble(diskon);
               dos.writeDouble(total);
               dos.writeDouble(bayar);
               dos.writeDouble(kembalian);
           }          
           
           try ( 
                   DataInputStream dis = new DataInputStream(
                           new FileInputStream("data_penjualan.dat"))) {
               System.out.println("Nama: " + dis.readUTF());
               System.out.println("Total Belanja: Rp" + dis.readDouble());
               System.out.println("Diskon (%): " + dis.readDouble() + "%");
               System.out.println("Total: Rp" + dis.readDouble());
               System.out.println("Bayar: Rp" + dis.readDouble());
               System.out.println("Kembalian: Rp" + dis.readDouble());
           }
       }
    }
    
}
