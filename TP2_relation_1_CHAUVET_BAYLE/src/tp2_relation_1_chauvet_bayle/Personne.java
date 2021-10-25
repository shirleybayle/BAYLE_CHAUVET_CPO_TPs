/*
 * Nouvelle classe Personne 
 */
package tp2_relation_1_chauvet_bayle;


public class Personne { //Création d'une classe Personne réutilisable dans d'autre .java
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    @Override //applique les actions ci-dessous lorsque l'on demande d'afficher les objets en questions
    public String toString() {
        return "Nom de la personne : "+nom+"\nPrénom de la personne : "+prenom;
    }
    
    public Personne(String n, String p) {
        nom = n;
        prenom = p;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    public boolean ajouter_voitures(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) { //Une personne définit dans ce programme doit avoir au moins 1 voiture
            return false;
        }
        else if (nbVoitures == 3) {
            return false; //Une personne ne peut pas avoir plus de 3 voitures
        }
        else{
            liste_voitures[nbVoitures] = voiture_a_ajouter; //affecte à chaque voiture d'une personne sa marque
            nbVoitures = nbVoitures +1;
            voiture_a_ajouter.proprietaire = this; //Référence l’objet qui exécute la méthode
            return true; //Le système fonctionne normalement si la personne a entre 1 et 3 voitures
        }
    }
    
}
