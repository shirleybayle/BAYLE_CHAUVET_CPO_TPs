/*
 * Classe Partie super puissance 4
 * CPO
 */
package sp4_console_bayle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class Partie {
    Joueur ListeJoueurs []= new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur joueur1, Joueur joueur2) {
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
    }
    
    public void attribuerCouleursAuxJoueurs() {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(2);
        Joueur joueur1 = ListeJoueurs[0];
        Joueur joueur2 = ListeJoueurs[1];
        if (n==0) {
            joueur1.Couleur = "jaune";
            joueur2.Couleur = "rouge";
        }
        else {
            joueur1.Couleur = "rouge";
            joueur2.Couleur = "jaune";
        }
        
    }
    
    public void initialiserPartie() {
        grilleJeu = new Grille();
        attribuerCouleursAuxJoueurs();
        String couleurjet0 = ListeJoueurs[0].Couleur;
        Jeton jet0 = new Jeton(couleurjet0);
        for (int i=0; i<22; i++) {
            ListeJoueurs[0].ajouterJeton(jet0);
        }
        String couleurjet1 = ListeJoueurs[1].Couleur;
        Jeton jet1 = new Jeton(couleurjet1);
        for (int i=0; i<22; i++) {
            ListeJoueurs[1].ajouterJeton(jet1);
        }
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(2); //on associe 0 à rouge et 1 à jaune
        if (n==0 && ListeJoueurs[0].Couleur == "rouge") {  //on tire au sort pour savoir qui commence
            joueurCourant = ListeJoueurs[0];
        }
        else if (n==0 && ListeJoueurs[0].Couleur == "jaune") {
            joueurCourant = ListeJoueurs[1];
        }
        else if (n==1 && ListeJoueurs[0].Couleur == "jaune") {
            joueurCourant = ListeJoueurs[0];
        }
        else {
            joueurCourant = ListeJoueurs[1];
        }
        
        
    }
    
    public void debuterPartie() {
        int compteur = 0;
        int compteurJoueur;
        int indiceJoueur;
        if (joueurCourant == ListeJoueurs[0]) {
            compteurJoueur = 0;
            indiceJoueur = 0;
        }
        else {
            compteurJoueur = 1;
            indiceJoueur = 1;
        }
        while (grilleJeu.etreRemplie() == false || grilleJeu.etreGagnantePourJoueur(joueurCourant)==false) {
            boolean testColonne = false;
            while (testColonne == false){
                Scanner sc = new Scanner (System.in);
                System.out.println("C'est à vous de jouer "+joueurCourant.Nom+" !"+" Vous êtes le joueur de couleur "+joueurCourant.Couleur+".");
                System.out.println("Veuillez saisir le numéro de la colonne dans laquelle vous voulez placer un jeton (il y a 7 colonnes).");
                grilleJeu.afficherGrilleSurConsole();
                int colonne = sc.nextInt();
                while (colonne < 1 || colonne > 7) {
                    System.out.println("Il n'y a que 7 colonnes, veuillez saisir un entier entre 1 et 7 pour placer votre jeton.");
                    colonne = sc.nextInt();
                }
                testColonne = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[compteur/2], colonne);
                joueurCourant.nombreJetonsRestants = joueurCourant.nombreJetonsRestants - 1;
                if (testColonne == true) {
                    compteur = compteur+1;
                    compteurJoueur = compteurJoueur+1;
                    if (grilleJeu.etreGagnantePourJoueur(joueurCourant)){
                        grilleJeu.afficherGrilleSurConsole();
                        System.out.println("Bravo "+joueurCourant.Nom+", vous avez gagné !");
                    }
                    else if (grilleJeu.etreRemplie()) {
                        grilleJeu.afficherGrilleSurConsole();
                        System.out.println("La grille est remplie, c'est un match nul :/");
                    }
                    indiceJoueur = compteurJoueur%2;
                    break;
                }
                System.out.println("La colonne que vous avez choisie est remplie, veuillez choisir une autre colonne.");
               }
            if (grilleJeu.etreGagnantePourJoueur(joueurCourant)){
                break;
            }
            else if (grilleJeu.etreRemplie()) {
                break;
            }
            joueurCourant = ListeJoueurs[indiceJoueur];
        }
    }
}
