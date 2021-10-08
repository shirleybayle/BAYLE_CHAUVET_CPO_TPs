/*TP0 - Exercice 2
 * BAYLE Shirley TDC
 * 27 septembre 2021
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrez le nombre : ");
        nb = sc.nextInt();
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind = ind+1;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + " entiers est : "+result);
    }
    
}
