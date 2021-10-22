/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class BouteilleBiere { //création d'une "class" BouteilleBiere utilisable dans d'autre .java

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //affecte aux éléments de la class une valeur donné par l'utilisateur
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() { // Lis les diffèrentes caractéristiques de la bière
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    public boolean Decapsuler() { //décapsule les bières fermées et renvoie celles déjà ouverte
        if (ouverte) {
            System.out.println("Erreur, la bière est déjà ouverte.");
            return false;
        } else {
            ouverte = true; //affecte l'attribut ouverte à la bière
            return true;
        }
    }

    @Override //C'est une sorte d'ensemble d'actions à effectuer lorsqu'on demande un retour de chaine
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner; //retourne selon la valeur de l'attribut ouverte si la bière est ouverte ou non
    }

}
