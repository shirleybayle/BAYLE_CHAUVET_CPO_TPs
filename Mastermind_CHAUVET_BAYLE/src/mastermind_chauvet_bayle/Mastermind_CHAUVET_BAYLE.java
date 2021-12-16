/* BAYLE Shirley - CHAUVET Ylan
 * CREATION MASTERMIND 
 * mini projet CPO
 */
package mastermind_chauvet_bayle;

import java.util.ArrayList;
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
        testpartie.initialiserPartie();
        //System.out.println("LIGNE GAGNANTE : ");
        //testpartie.ligneGagnante.afficherLigne();
        testpartie.debuterPartie();
        
    }
    
}
