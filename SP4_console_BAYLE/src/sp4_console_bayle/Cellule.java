/*
 * Classe Cellule super puissance 4
 * CPO
 */
package sp4_console_bayle;

/**
 *
 * @author shirl
 */
public class Cellule {
    Jeton jetonCourant;
    
    public Cellule() {
        jetonCourant = null;
    }
    
    public boolean affecterJeton(Jeton jet) {
        if (jetonCourant != null) {
            jetonCourant = jet;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String lireCouleurDuJeton() {
        if (jetonCourant != null) {
            String couleur = jetonCourant.lireCouleur();
            return couleur;
        }
        else {
            return "pas de jeton";
        }
    }
}
