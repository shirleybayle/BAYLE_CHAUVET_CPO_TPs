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
    
    public void initialiserPartie() {
        grilleJeu = new Grille();
        String couleurjet0 = ListeJoueurs[0].Couleur;
        Jeton jet0 = new Jeton(couleurjet0);
        for (int i=0; i<22; i++) {
            ListeJoueurs[0].ajouterJeton(jet0);
        }
        String couleurjet1 = ListeJoueurs[1].Couleur;
        Jeton jet1 = new Jeton(couleurjet1);
        for (int i=0; i<22; i++) {
            ListeJoueurs[1].ajouterJeton(jet1);
        }
    }
    
    public void debuterPartie() {
        
    }
}
