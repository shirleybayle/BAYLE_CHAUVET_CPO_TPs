/*
 * Nouvelle classe Voiture
 */
package tp2_relation_1_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    @Override
    public String toString(){
        return Marque+" "+Modele+" "+PuissanceCV+" chevaux";
    }
    
    public Voiture(String mo, String ma, int cv) {
        Modele = mo;
        Marque = ma;
        PuissanceCV = cv;
        proprietaire = null;
             
    }
    
}
