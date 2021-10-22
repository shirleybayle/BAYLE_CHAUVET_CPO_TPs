/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    @Override
    public String toString() {
        return "Vous avez effectué " + nbConversions + " conversions.";
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        double tKelvin = tCelcius + 273.15; //créer une variable et lui associer une valeur
        nbConversions = nbConversions + 1;
        return tKelvin;
    }
    
    public double KelvinVersCelcius (double tKelvin) {
        double tCelcius = tKelvin - 273.15;
        nbConversions = nbConversions + 1;
        return tCelcius;
    }
    
    public double FarenheitVersCelcius (double tFarenheit) {
        double tCelcius = (tFarenheit-32)/1.8;
        nbConversions = nbConversions + 1;
        return tCelcius;
    }
    
    public double CelciusVersFarenheit (double tCelcius) {
        double tFarenheit = 1.8*tCelcius + 32;
        nbConversions = nbConversions + 1;
        return tFarenheit;
    }
    
    public double KelvinVersFarenheit (double tKelvin) {
        int temp = nbConversions;
        double tCelcius = KelvinVersCelcius(tKelvin);
        double tFarenheit = CelciusVersFarenheit(tCelcius);
        nbConversions = temp + 1;
        return tFarenheit; //Associer une valeur à une varibale en passant par une autre fonction
    }
    
    public double FarenheitVersKelvin (double tFarenheit) {
        int temp = nbConversions;
        double tCelcius = FarenheitVersCelcius(tFarenheit);
        double tKelvin = CelciusVersKelvin(tCelcius);
        nbConversions = temp + 1;
        return tKelvin;
    }

}
