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
    
    public Joueur(String name) { //constructeur
        Nom = name;
        nombreJetonsRestants = 0;
        nombreDesintegrateurs = 0;
    }
    
    public void obtenirDesintegrateur() { //le joueur obtient un désintégrateur
        nombreDesintegrateurs = nombreDesintegrateurs+1;
    }
    
    public boolean utiliserDesintegrateur() { //le joueur utilise un désintégrateur
        if (nombreDesintegrateurs>0) {
            nombreDesintegrateurs = nombreDesintegrateurs-1;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void affecterCouleur(String couleur) { //une couleur est affectée au joueur
        Couleur = couleur; 
    }
    
    public boolean ajouterJeton(Jeton jet) { //ajoute un jeton à la liste des jetons d'un joueur
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
