/*
 * Classe Partie super puissance 4
 * CPO
 */
package sp4_console_bayle;

import java.util.Random;

/**
 *
 * @author shirl
 */
public class Partie {
    Joueur ListeJoueurs []= new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public void attribuerCouleursAuxJoueurs() {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(2);
        Joueur joueur1 = ListeJoueurs[0];
        Joueur joueur2 = ListeJoueurs[1];
        if (n==0) {
            joueur1.Couleur = "jaune";
            joueur2.Couleur = "rouge";
        }
        else {
            joueur1.Couleur = "rouge";
            joueur2.Couleur = "jaune";
        }
        
    }
}
