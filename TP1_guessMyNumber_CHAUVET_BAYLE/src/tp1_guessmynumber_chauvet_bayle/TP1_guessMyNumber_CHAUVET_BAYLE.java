/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP1 exercice guess my number
 * 08/10/2021
 */
package tp1_guessmynumber_chauvet_bayle;

import java.util.Random;

/**
 *
 * @author shirl
 */
public class TP1_guessMyNumber_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int test = generateurAleat.nextInt();
        System.out.println(test);
    }
    
}
