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
        grilleJeu.viderGrille();
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
        for (int i=0; i<5; i++) {
            int lignetn = generateurAleat.nextInt(6);
            int colonnetn = generateurAleat.nextInt(7)+1;
            grilleJeu.placertrouNoir(lignetn, colonnetn);
        }
        for (int i = 0; i<3; i++) {
            int lignedesint = generateurAleat.nextInt(6);
            int colonnedesint = generateurAleat.nextInt(7)+1;
            if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].desintegrateur == true) {
                i = i-1;
            }
            else if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].trouNoir == true) {
                i = i-1;
            }
            else {
                grilleJeu.placerDesintegrateur(lignedesint, colonnedesint);
            }
        }
        for (int i=0; i<2; i++) {
            int lignedesint = generateurAleat.nextInt(6);
            int colonnedesint = generateurAleat.nextInt(7)+1;
            if (grilleJeu.CellulesJeu[lignedesint][colonnedesint].desintegrateur == true) {
                i = i-1;
            }
            else if (grilleJeu.CellulesJeu[lignedesint][colonnedesint].trouNoir == false) {
                i = i-1;
            }
            else {
                grilleJeu.placerDesintegrateur(lignedesint, colonnedesint);
            }
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
                if (joueurCourant.nombreJetonsRestants != 21) {
                    System.out.println("Tapez 8 si vous voulez récupérer un jeton.");
                }
                grilleJeu.afficherGrilleSurConsole();
                System.out.println(joueurCourant.nombreJetonsRestants + "NB JETONS RESTANTS");
                /*for (int s=0; s<21; s++) {
                    if (joueurCourant.ListeJetons[s] == null){
                    System.out.println("LISTE JETON PAS DE JETON "+s);
                    }
                    else {
                    System.out.println("LISTE JETON "+s+" " +joueurCourant.ListeJetons[s].Couleur);
                    }
                }*/
                int colonne = sc.nextInt();
                while (colonne < 1 || colonne > 8 || grilleJeu.colonneRemplie(colonne) == true) {
                    if (joueurCourant.nombreJetonsRestants == 21){
                        if (colonne < 1 || colonne > 7) {
                            System.out.println("Il n'y a que 7 colonnes, veuillez saisir un entier entre 1 et 7 pour placer votre jeton.");
                            colonne = sc.nextInt();
                        }
                    }
                    else {
                        if (colonne == 8) {
                            break;
                        }
                        else if (colonne < 1 || colonne > 7){
                            System.out.println("Il n'y a que 7 colonnes, veuillez saisir un entier entre 1 et 7 pour placer votre jeton. \n Tapez 8 pour récupérer un de vos jetons.");
                            colonne = sc.nextInt();
                        }
                        else if (grilleJeu.colonneRemplie(colonne) == true) {
                            System.out.println("Cette colonne est remplie, veuillez placer votre jeton dans une autre colonne.");
                            colonne = sc.nextInt();
                        }
                    }
                }
                if (colonne != 8){
                    testColonne = grilleJeu.ajouterJetonDansColonne(joueurCourant, colonne);
                    if (testColonne == true) {
                        joueurCourant.nombreJetonsRestants = joueurCourant.nombreJetonsRestants - 1;
                        joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = null;
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
                else {
                    testColonne = true;
                    boolean testrecupererjeton = false;
                    while (testrecupererjeton == false) {
                        System.out.println("Veuillez saisir le numéro de la ligne du jeton que vous voulez récupérer.");
                        int ligneJetonARecuperer = sc.nextInt();
                        while (ligneJetonARecuperer < 1 || ligneJetonARecuperer > 6) {
                            System.out.println("Numéro invalide, il n'y a que 6 lignes. Veuillez en saisir un nouveau.");
                            ligneJetonARecuperer = sc.nextInt();
                        }
                        System.out.println("Veuillez saisir le numéro de la colonne du jeton que vous voulez récupérer.");
                        int colonneJetonARecuperer = sc.nextInt();
                        while (colonneJetonARecuperer < 1 || colonneJetonARecuperer > 7) {
                            System.out.println("Numéro invalide, il n'y a que 7 colonnes. Veuillez en saisir un nouveau.");
                            colonneJetonARecuperer = sc.nextInt();
                        }
                        compteur = compteur +1;
                        compteurJoueur = compteurJoueur+1;
                        indiceJoueur = compteurJoueur%2;
                        if (grilleJeu.CellulesJeu[ligneJetonARecuperer-1][colonneJetonARecuperer-1].lireCouleurDuJeton() == joueurCourant.Couleur) {
                            Jeton jetonRecupere = grilleJeu.recupererJeton(ligneJetonARecuperer, colonneJetonARecuperer);
                            joueurCourant.nombreJetonsRestants = joueurCourant.nombreJetonsRestants +1;
                            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = jetonRecupere;
                            grilleJeu.tasserColonne(colonneJetonARecuperer);
                            if (grilleJeu.etreGagnantePourJoueur(joueurCourant)) {
                                if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[indiceJoueur])) {
                                    grilleJeu.afficherGrilleSurConsole();
                                    System.out.println(joueurCourant.Nom + " vous avez provoqué un faute de jeu. Bravo "+ListeJoueurs[indiceJoueur].Nom+" vous avez gagné !");
                                }
                                else {
                                    grilleJeu.afficherGrilleSurConsole();
                                    System.out.println("Bravo "+joueurCourant.Nom+ " vous avez gagné !");
                                }
                            }
                            else if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[indiceJoueur])) {
                                grilleJeu.afficherGrilleSurConsole();
                                System.out.println("Bravo "+ListeJoueurs[indiceJoueur].Nom+" vous avez gagné !");
                            }
                            testrecupererjeton = true;
                        }
                        else {
                            System.out.println("Opération impossible.");
                        }
                    }
                }
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
