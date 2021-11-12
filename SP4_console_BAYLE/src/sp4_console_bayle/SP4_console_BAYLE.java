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
        Jeton jet = new Jeton("rouge");
        Jeton jet2 = new Jeton("jaune");
        Jeton jet3 = new Jeton("rouge");
        grillejeu.ajouterJetonDansColonne(jet, 2);
        grillejeu.ajouterJetonDansColonne(jet2, 7);
        grillejeu.ajouterJetonDansColonne(jet3, 2);
        grillejeu.afficherGrilleSurConsole();
        
        boolean test;
        boolean test2;
        test = grillejeu.celluleOccupee(2, 2);
        test2 = grillejeu.celluleOccupee(6, 7);
        if (test2 == false) {
            System.out.println("oui");
        }
        
        String c = grillejeu.lireCouleurDuJeton(2,2);
        String d = grillejeu.lireCouleurDuJeton(1,1);
        System.out.println(c + d);
    }
    
}
