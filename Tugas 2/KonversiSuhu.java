/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author muham
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double C = 10;
        double F = 15;
        double R = 5;
        
        double celsiusToFahrenheit = (C * 9/5) + 32;
        double fahrenheitToCelsius = (F - 32) * 5/9;
        
        System.out.println("Celcius ke Fahrenheit dan sebaliknya:");
        System.out.println(C + "°C = " + celsiusToFahrenheit + "°F");
        System.out.println(F + "°F = " + fahrenheitToCelsius + "°C");
        
        double celsiusToReamur = C * 4/5;
        double reamurToCelsius = R * 5/4;
        
        System.out.println("Celcius ke Reamur dan sebaliknya:");
        System.out.println(C + "°C = " + celsiusToReamur + "°R");
        System.out.println(R + "°R = " + reamurToCelsius + "°C");
        
        double fahrenheitToReamur = (F - 32) * 4/9;
        double reamurToFahrenheit = (R * 9/4) + 32;
        
        System.out.println("Fahrenheit ke Reamur dan sebaliknya:");
        System.out.println(F + "°F = " + fahrenheitToReamur + "°R");
        System.out.println(R + "°R = " + reamurToFahrenheit + "°F");
        // TODO code application logic here
    }
    
}
