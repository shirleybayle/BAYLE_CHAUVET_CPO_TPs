/*.
 * CHAUVET Ylan - BAYLE Shirley
 * TP1 Cours Programmation Objet
 * Exercice 1 - 08/10/2021
 */
package tp1_manipnombresint_bayle_chauvet;

import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class TP1_manipNombresInt_BAYLE_CHAUVET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ecrivez un entier.");
        Scanner sc = new Scanner (System.in);
        int nb1 = sc.nextInt(); 
        System.out.println("Ecrivez un deuxième entier.");
        int nb2 = sc.nextInt(); //Demande à l'utilisateur 2 entier
        System.out.println("Vos entiers sont "+nb1+" et "+nb2);
        System.out.println("Somme : "+(nb1+nb2)+"\nDifférence : "+(nb1-nb2)+"\nProduit : "+(nb1*nb2));
        System.out.println("Quotient entier : "+(nb1/nb2)+"\nReste :"+(nb1%nb2)); //effectue les différents opérateurs aux nombres saisie
        
    }
    
}
