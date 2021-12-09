/*
 * Classe Partie
 */
package mastermind_chauvet_bayle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class Partie {
    Ligne ligneTest; 
    Ligne ligneGagnante;
    int nbEssais; //compte le nombre de tests effectués 
    
    public Partie() {
        ligneGagnante = new Ligne();
        ligneTest = new Ligne();
        nbEssais = 0;
    }
    
    public void initialiserPartie() {
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(8);
        int n2 = generateurAleat.nextInt(8);
        int n3 = generateurAleat.nextInt(8);
        int n4 = generateurAleat.nextInt(8);
        System.out.println(n1+""+n2+""+n3+""+n4);
        String tabCouleurs[] = {"rouge","jaune","vert","bleu","orange","blanc","violet","rose"};
        Pion pion1 = new Pion(tabCouleurs[n1]);
        Pion pion2 = new Pion(tabCouleurs[n2]);
        Pion pion3 = new Pion(tabCouleurs[n3]);
        Pion pion4 = new Pion(tabCouleurs[n4]);
        System.out.println(pion1);
        ligneGagnante.placerPion(pion1, pion2, pion3, pion4);
        
    }
    
    public void debuterPartie() {
        while (etreGagnante() == false || nbEssais < 12) {
            nouveauTest();
            nbEssais = nbEssais + 1;
            ligneTest.afficherLigne();
        }
        if (nbEssais < 12) {
            System.out.println("BRAVO ! Vous avez gagné en moins de 12 coups !!");
        }
        else if (etreGagnante() == true) {
            System.out.println("Vous avez eu chaud... Vous avez gagné lors de votre dernier coup possible !");
        }
        else {
            System.out.println("Malgré vos efforts vous n'êtes pas parvenus à trouver la combinaison cachée en moins de 12 coups...");
        }
    }
    
    public boolean etreGagnante() {
        int compteur = 0;
        for (int i=0; i<4; i++) {
            if (ligneGagnante.LigneAssociee[i] == ligneTest.LigneAssociee[i]) {
                compteur = compteur + 1;
            }
        }
        if (compteur == 4) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void nouveauTest() {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<4; i++) {
            System.out.println("Veuillez saisir la couelur du pion que vous voulez placer (de gauche à droite)");
            String couleur = sc.nextLine();
            Pion nouveauPion = new Pion(couleur);
            ligneTest.LigneAssociee[i] = nouveauPion;
        }
        
    }
    
    public int[] nbJuste() {
        //renvoie le nombre de pions bien placés et le nombre de pions présents mais mal placés
        int tableau [] = new int[2];
        ArrayList<Pion> tableauTest = new ArrayList<>();
        int compteurJuste = 0;
        int compteurMoyensJuste = 0;
        for (int i=0; i<4; i++) {
            tableauTest.add(ligneGagnante.LigneAssociee[i]);
           if (ligneTest.LigneAssociee[i].Couleur.equals(ligneGagnante.LigneAssociee[i].Couleur)) {
               compteurJuste = compteurJuste + 1;
               tableauTest.remove(i);
           }
        }
        for (int j=0; j<tableauTest.size(); j++) {
            for (int k=0; k<4; k++) {
                if (tableauTest.get(j).Couleur.equals(ligneTest.LigneAssociee[k].Couleur)) {
                    compteurMoyensJuste = compteurMoyensJuste + 1;
                    tableauTest.remove(ligneTest.LigneAssociee[k]);
                }
            }
        }
        tableau[0] = compteurJuste;
        tableau[1] = compteurMoyensJuste;
        return tableau;
        
    }
    
    //etre gagnante
    //nb juste
    //ligne nouveau test
    // init + debuter partie
}
