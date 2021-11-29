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
    boolean desintegrateur;
     
    public boolean supprimerJeton() { //supprime le jeton de la cellule
        if (jetonCourant!=null) {
            jetonCourant = null;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean placerDesintegrateur() { //place un désintégrateur sur la cellulle
        if (desintegrateur == false) {
            desintegrateur = true;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean recupererDesintegrateur() { //enlève un désintegrateur d'une cellule
        if (desintegrateur == true) {
            desintegrateur = false;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean presenceDesintegrateur() { //regarde s'il y a un désintégrateur sur la cellule
        if (desintegrateur == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public Jeton recupererJeton() { //renvoie le jeton présent dans la cellule et le supprime de celle ci
        Jeton jeton = jetonCourant;
        jetonCourant = null;
        return jeton;
    }
    
    public boolean presenceTrouNoir() { //regzrde s'il y a un trou noir sur la cellule
        if (trouNoir == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean placerTrouNoir() { //place un trou noir sur la cellule
        if (trouNoir != true) {
            trouNoir = true;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean activerTrouNoir() { //supprime le jeton et le trou noir de la cellule
        if (trouNoir == true) {
            jetonCourant = null;
            trouNoir = false;
            return true;
        }
        else {
            return false;
        }
    }
    
    public Cellule() { //constructeur
        jetonCourant = null;
    }
    
    public boolean affecterJeton(Jeton jet) { //ajoute le jeton en paramètre dans la cellule
        if (jetonCourant != null) {
            jetonCourant = jet;
            return true;
        }
        else {
            return false;
        }
    }
     
    public String lireCouleurDuJeton() { //renvoie la couleur du jeton présent dans la cellule
        if (jetonCourant != null) {
            String couleur = jetonCourant.lireCouleur();
            return couleur;
        }
        else {
            return "pas de jeton";
        }
    }
}
