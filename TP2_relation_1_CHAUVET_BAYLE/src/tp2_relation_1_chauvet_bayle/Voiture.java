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
    @Override
    public String toString(){
        return "Modèle de la voiture : "+Modele+"\nMarque de la voiture : "+Marque+"\nPuissance : "+PuissanceCV;
    }
    public Voiture(String mo, String ma, int cv) {
        Modele = mo;
        Marque = ma;
        PuissanceCV = cv;
             
    }
    
}
