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
        System.out.println("Bonjour, saisissez la valeur à convertir : ");
        double temp = sc.nextDouble(); //Demande à l'utilisateur une valeur
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit \n6) De Fareinheit vers Kelvin");
        
    }
    
}
