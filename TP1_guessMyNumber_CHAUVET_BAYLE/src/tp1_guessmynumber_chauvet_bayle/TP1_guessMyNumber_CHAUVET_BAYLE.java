/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP1 exercice guess my number
 * 08/10/2021
 */
package tp1_guessmynumber_chauvet_bayle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class TP1_guessMyNumber_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nbtest = -1;
        int n;
        System.out.println("Choisissez un niveau de diffciulté : \n1) Facile \n2) Intermédiaire \n3) Difficile");
        int niveau = sc.nextInt();
        if (niveau != 3) {
        n = generateurAleat.nextInt(100);
        }
        else {
            n = generateurAleat.nextInt(1000);
        }
        while (niveau<1 || niveau>3) {
            System.out.println("Erreur, veuillez saisir un nombre entre 1 et 3.");
            niveau = sc.nextInt();
        }
        if (niveau == 1) {
            System.out.println("Vous avez choisi le niveau facile.");
        }
        else if (niveau == 2) {
            System.out.println("Vous avez choisi le niveau intermédiaire, vous avez 8 tentatives pour trouver le nombre.");
        }
        else if (niveau == 3) {
            System.out.println("Vous avez choisi le niveau difficile, vous devrez trouver un nombre entre 0 et 1000.");
        }
        int compteur = 0;
        while (nbtest!=n) {
        if (compteur == 8 && niveau == 2) {
            break;
        }
        compteur = compteur+1;
        if (niveau != 3) {
        System.out.println("Saisissez un nombre entre 0 et 100");
        }
        else {
            System.out.println("Saisissez un nombre entre 0 et 1000");
        }
        nbtest = sc.nextInt();
        if (nbtest<n) {
            if (niveau == 1 && nbtest+20<n) {
            System.out.println("Vraiment trop petit !");
           }
            else{
            System.out.println("trop petit");
            }
           
        }
        else if (nbtest>n) {
            if (niveau == 1 && nbtest-20>n) {
                System.out.println("Vraiment trop grand!");
            }
            else{
            System.out.println("trop grand");
            }
        }
        else {
            System.out.println("gagné !");
        }
        }
        if (compteur == 8 && niveau == 2) {
            System.out.println("Vous n'avez pas réussi à trouver le nombre en moins de 8 tentatives, vous avez perdu.");
        }
        else {
        System.out.println("Vous avez trouvé le nombre en "+compteur+" tentatives");
        }
    }
    
}
