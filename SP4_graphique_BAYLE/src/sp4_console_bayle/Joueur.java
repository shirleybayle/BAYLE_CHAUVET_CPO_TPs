/*
 * Classe Joueur super puissance 4
 * CPO
 */
package sp4_console_bayle;

/**
 *
 * @author shirl
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton ListeJetons [] = new Jeton [21];
    int nombreJetonsRestants;
    int nombreDesintegrateurs;
    
    public Joueur(String name) {
        Nom = name;
        nombreJetonsRestants = 0;
    }
    
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs = nombreDesintegrateurs+1;
    }
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs>0) {
            nombreDesintegrateurs = nombreDesintegrateurs-1;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void affecterCouleur(String couleur) {
        Couleur = couleur;
    }
    
    public boolean ajouterJeton(Jeton jet) {
        if (nombreJetonsRestants<21) {
            ListeJetons[nombreJetonsRestants] = jet;
            nombreJetonsRestants = nombreJetonsRestants + 1;
            return true;
        }
        else {
            return false;
        }
    }
}
