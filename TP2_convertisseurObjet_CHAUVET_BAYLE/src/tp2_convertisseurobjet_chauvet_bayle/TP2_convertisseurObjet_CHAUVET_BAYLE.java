/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP2 Cours Programmation Objet
 * Exercie 2 Convertisseur
 */
package tp2_convertisseurobjet_chauvet_bayle;

import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class TP2_convertisseurObjet_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur();
        Scanner sc = new Scanner (System.in);
        int conversion = 1;
        while (conversion == 1) {
        System.out.println("Bonjour, saisissez une valeur : ");
        double temp = sc.nextDouble(); //Demande à l'utilisateur une valeur
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit \n6) De Fareinheit vers Kelvin");
        int numero = sc.nextInt();
        while (numero<1 || numero>6) {
            System.out.println("Erreur, veuillez entrer un nombre compris entre 1 et 6.");
            numero = sc.nextInt();//Recommence le programme si la valeur saisie est incorrecte
        }
        if (numero == 1) { //convertit des températures 
            double newtemp = convertisseur1.CelciusVersKelvin(temp);
            System.out.println(temp+" degré Celcius est égal à "+newtemp+" degré Kelvin.");//applique la fonction associé à la valeur saisie 
        }
        else if (numero == 2) {
            double newtemp = convertisseur1.KelvinVersCelcius(temp);
            System.out.println(temp+" degré Kelvin est égal à "+newtemp+" degré Celcius.");
        }
        else if (numero == 3) {
            double newtemp = convertisseur1.FarenheitVersCelcius(temp);
            System.out.println(temp+" degré Farenheit est égal à "+newtemp+" degré Celcius.");
        }
        else if (numero == 4) {
            double newtemp = convertisseur1.CelciusVersFarenheit(temp);
            System.out.println(temp+" degré Celcius est égal à "+newtemp+" degré Farenheit.");
        }
        else if (numero == 5) {
            double newtemp = convertisseur1.KelvinVersFarenheit(temp);
            System.out.println(temp+" degré Kelvin est égal à "+newtemp+" degré Farenheit.");
        }
        else {
            double newtemp = convertisseur1.FarenheitVersKelvin(temp);
            System.out.println(temp+" degré Farenheit est égal à "+newtemp+" degré Kelvin");
        }
        System.out.println("Voulez-vous effectuer une nouvelle conversion ? \n1) Oui \n2) Non");
        conversion = sc.nextInt();
    }
        System.out.println(convertisseur1);
    }
    }
    

