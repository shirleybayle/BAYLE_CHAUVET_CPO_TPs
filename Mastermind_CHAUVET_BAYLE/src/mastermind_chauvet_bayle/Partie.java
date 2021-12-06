/*
 * Classe Partie
 */
package mastermind_chauvet_bayle;

import java.util.Random;

/**
 *
 * @author shirl
 */
public class Partie {
    Ligne ligneTest;
    Ligne ligneGagnante;
    
    public Partie() {
        ligneGagnante = new Ligne();
    }
    
    public void initialiserPartie() {
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(7);
        int n2 = generateurAleat.nextInt(7);
        int n3 = generateurAleat.nextInt(7);
        int n4 = generateurAleat.nextInt(7);
        System.out.println(n1+""+n2+""+n3+""+n4);
        String tabCouleurs[] = {"rouge","jaune","vert","bleu","orange","blanc","violet","rose"};
        Pion pion1 = new Pion(tabCouleurs[n1]);
        Pion pion2 = new Pion(tabCouleurs[n2]);
        Pion pion3 = new Pion(tabCouleurs[n3]);
        Pion pion4 = new Pion(tabCouleurs[n4]);
        System.out.println(pion1);
        ligneGagnante.placerPion(pion1, pion2, pion3, pion4);
        
    }
    
    //etre gagnante
    //nb juste
    //ligne nouveau test
    // init + debuter partie
}
