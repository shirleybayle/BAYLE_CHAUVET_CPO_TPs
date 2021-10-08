/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP1 Convertisseur - CPO
 * 08/10/2021
 */
package tp1_convertisseur_chauvet_bayle;

import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class TP1_convertisseur_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    
    public static double KelvinVersCelcius (double tKelvin) {
        double tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    
    public static double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius = (tFarenheit-32)/1.8;
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit = 1.8*tCelcius + 32;
        return tFarenheit;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin);
        double tFarenheit = CelciusVersFarenheit(tCelcius);
        return tFarenheit;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tCelcius = FarenheitVersCelcius(tFarenheit);
        double tKelvin = CelciusVersFarenheit(tCelcius);
        return tKelvin;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double temp = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit\n 5) De Kelvin vers Farenheit \n6) De Fareinheit vers Kelvin");
        

    }
    
}
