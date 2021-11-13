/*
 * Super Puissance 4 - version console
 * BAYLE Shirley
 * Projet CPO
 */
package sp4_console_bayle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class SP4_console_BAYLE {

    /** TEST A ENLEVER
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grille grillejeu = new Grille();
        Scanner sc = new Scanner (System.in);
        System.out.println("Veuillez entrer le nom du premier joueur.");
        String nomj1 = sc.nextLine();
        System.out.println("Veuillez entrer le nom du deuxième joueur.");
        String nomj2 = sc.nextLine();
        Joueur j1 = new Joueur(nomj1);
        Joueur j2 = new Joueur(nomj2);
        Partie nouvellePartie = new Partie(j1, j2);
        nouvellePartie.initialiserPartie();
        nouvellePartie.debuterPartie();
    }
    
}
