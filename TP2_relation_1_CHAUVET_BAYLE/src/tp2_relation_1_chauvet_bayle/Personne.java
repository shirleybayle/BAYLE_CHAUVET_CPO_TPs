/*
 * Nouvelle classe Personne 
 */
package tp2_relation_1_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Personne {
    String nom;
    String prenom;
    @Override
    public String toString() {
        return "Nom de la personne : "+nom+"\nPrénom de la personne : "+prenom;
    }
    public Personne(String n, String p) {
        nom = n;
        prenom = p;
    }
}
