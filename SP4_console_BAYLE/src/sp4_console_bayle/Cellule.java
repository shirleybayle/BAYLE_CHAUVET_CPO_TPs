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
    boolean trouNoir;
    
    public boolean presenceTrouNoir() {
        if (trouNoir == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean placerTrouNoir() {
        if (trouNoir != true) {
            trouNoir = true;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean activerTrouNoir() {
        if (trouNoir == true) {
            jetonCourant = null;
            trouNoir = false;
            return true;
        }
        else {
            return false;
        }
    }
    
    //public Jeton recupererJeton() {
        
    //}
    
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
