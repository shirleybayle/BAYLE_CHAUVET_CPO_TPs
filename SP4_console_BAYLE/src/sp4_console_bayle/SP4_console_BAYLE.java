/*
 * Super Puissance 4 - version console
 * BAYLE Shirley
 * Projet CPO
 */
package sp4_console_bayle;

import java.util.Random;

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
        Joueur j1 = new Joueur("Shirley");
        Joueur j2 = new Joueur("Valentin");
        Partie nouvellePartie = new Partie(j1, j2);
        nouvellePartie.initialiserPartie();
        nouvellePartie.debuterPartie();
    }
    
}
