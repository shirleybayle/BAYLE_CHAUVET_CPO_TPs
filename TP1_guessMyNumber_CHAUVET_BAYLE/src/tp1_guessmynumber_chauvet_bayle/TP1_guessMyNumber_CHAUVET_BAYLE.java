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
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int nbtest = -1;
        int compteur = 0;
        while (nbtest!=n) {
        compteur = compteur+1;
        System.out.println("Saisissez un nombre entre 0 et 100");
        nbtest = sc.nextInt();
        if (nbtest<n) {
            System.out.println("trop petit");
        }
        else if (nbtest>n) {
            System.out.println("trop grand");
        }
        else {
            System.out.println("gagné !");
        }
        }
        System.out.println("Vous avez trouvé le nombre en "+compteur+" tentatives");
    }
    
}
