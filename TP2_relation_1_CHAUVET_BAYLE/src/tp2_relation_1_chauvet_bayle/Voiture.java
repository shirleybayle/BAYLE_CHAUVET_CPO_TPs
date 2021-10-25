/*
 * Nouvelle classe Voiture
 */
package tp2_relation_1_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Voiture { //Création d'une classe Voiture réutilisable dans d'autre .java
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    @Override //applique les actions ci-dessous lorsque l'on demande d'afficher les objets en questions
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
