/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persamaankuadrat;

/**
 *
 * @author muham
 */
public class PersamaanKuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;
        int diskriminan = (b * b) - (4 * a * c);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Diskriminan (b² - 4ac) = " + diskriminan);
        // TODO code application logic here
    }
    
}
