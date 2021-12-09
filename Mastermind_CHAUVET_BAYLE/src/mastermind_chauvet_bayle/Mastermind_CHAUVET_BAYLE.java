/* BAYLE Shirley - CHAUVET Ylan
 * CREATION MASTERMIND 
 * mini projet CPO
 */
package mastermind_chauvet_bayle;

import java.util.Random;

/**
 *
 * @author shirl
 */
public class Mastermind_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NOIR CORRESPOND A ORANGE, VIOLET A ROSE FONCE
        
        Partie testpartie = new Partie();
        testpartie.nouveauTest();
        testpartie.ligneTest.afficherLigne();
        testpartie.initialiserPartie();
        System.out.println("LIGNE GAGNANTE : ");
        testpartie.ligneGagnante.afficherLigne();
        
        int tab[] = new int[2];
        tab = testpartie.nbJuste();
        System.out.println("NB JUSTES BIEN PLACES : "+tab[0]+"\nNB JUSTE MAL PLACES : "+tab[1]);
        
        
    }
    
}
