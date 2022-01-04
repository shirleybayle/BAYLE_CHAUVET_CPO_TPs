/* BAYLE Shirley - CHAUVET Ylan
 * Classe Pion
 */
package mastermind_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Pion {
    String Couleur;
    
    public String lireCouleur() {
        return Couleur;
    }
    
    public Pion(String c) {
        Couleur = c;
    }
}
