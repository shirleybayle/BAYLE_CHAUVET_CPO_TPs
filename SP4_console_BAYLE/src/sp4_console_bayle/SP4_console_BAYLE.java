/*
 * Super Puissance 4 - version console
 * BAYLE Shirley
 * Projet CPO
 */
package sp4_console_bayle;

import java.util.Random;

/**
 *
 * @author shirl
 */
public class SP4_console_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gealeat = new Random();
        for (int i=0; i<100; i++){
        int n = gealeat.nextInt(2);
        System.out.println(n);}
    }
    
}
