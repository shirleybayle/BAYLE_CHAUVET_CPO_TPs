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
        
        Pion p = new Pion("rose");
        Pion p1 = new Pion("violet");
        Pion p2 = new Pion("rose");
        Pion p3 = new Pion("blanc");
        Ligne test = new Ligne();
        //test.afficherLigne();
        test.placerPion(p,p1,p2,p3);
        test.afficherLigne();
        
        Partie testpartie = new Partie();
        testpartie.initialiserPartie();
        System.out.println("NOUVELLE LIGNE : ");
        testpartie.ligneGagnante.afficherLigne();
        
        
    }
    
}
