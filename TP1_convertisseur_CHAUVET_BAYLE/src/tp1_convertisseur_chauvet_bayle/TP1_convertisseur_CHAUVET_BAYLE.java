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
        double tKelvin = CelciusVersKelvin(tCelcius);
        return tKelvin;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double temp = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit \n6) De Fareinheit vers Kelvin");
        int numero = sc.nextInt();
        while (numero<1 || numero>6) {
            System.out.println("Erreur, veuillez entrer un nombre compris entre 1 et 6.");
            numero = sc.nextInt();
        }
        if (numero == 1) {
            double newtemp = CelciusVersKelvin(temp);
            System.out.println(temp+" degré Celcius est égal à "+newtemp+" degré Kelvin.");
        }
        else if (numero == 2) {
            double newtemp = KelvinVersCelcius(temp);
            System.out.println(temp+" degré Kelvin est égal à "+newtemp+" degré Celcius.");
        }
        else if (numero == 3) {
            double newtemp = FarenheitVersCelcius(temp);
            System.out.println(temp+" degré Farenheit est égal à "+newtemp+" degré Celcius.");
        }
        else if (numero == 4) {
            double newtemp = CelciusVersFarenheit(temp);
            System.out.println(temp+" degré Celcius est égal à "+newtemp+" degré Farenheit.");
        }
        else if (numero == 5) {
            double newtemp = KelvinVersFarenheit(temp);
            System.out.println(temp+" degré Kelvin est égal à "+newtemp+" degré Farenheit.");
        }
        else {
            double newtemp = FarenheitVersKelvin(temp);
            System.out.println(temp+" degré Farenheit est égal à "+newtemp+" degré Kelvin");
        }

    }
    
}
