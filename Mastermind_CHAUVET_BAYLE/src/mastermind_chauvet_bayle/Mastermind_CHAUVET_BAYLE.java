/* BAYLE Shirley - CHAUVET Ylan
 * CREATION MASTERMIND 
 * mini projet CPO
 */
package mastermind_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Mastermind_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pion p = new Pion("bleu");
        Pion p1 = new Pion("violet");
        Pion p2 = new Pion("vert");
        Pion p3 = new Pion("blanc");
        Ligne test = new Ligne();
        //test.afficherLigne();
        test.placerPion(p,p1,p2,p3);
        test.afficherLigne();
    }
    
}
