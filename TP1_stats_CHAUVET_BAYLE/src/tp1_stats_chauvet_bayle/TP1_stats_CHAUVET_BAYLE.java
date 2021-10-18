/*
 * CHAUVET Ylan - BAYLE Shirley
 * Exercice statistiques TP1 CPO
 * 08/10/2021
 */
package tp1_stats_chauvet_bayle;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author shirl
 */
public class TP1_stats_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] tab = new int[6];
        Random generateurAleat = new Random();
        for (int i=0; i<6; i++) {
            tab[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier.");
        int m = sc.nextInt(); //Demande à l'utilisateur un entier m qui représentera le nombre de lancé
        for (int i=0; i<m; i++) {
            int indice = generateurAleat.nextInt(6); //Génére une variable aléatoire, qui représente la face du dé
            tab[indice] = tab[indice]+1;// Applique le lancer de dé m fois 
        }
        for (int i=0; i<6; i++) {
            int valeur = tab[i]; //renvoie le nombre de fois qu'a été tiré chaque face 
            System.out.println("La face numéro "+(i+1)+" du dé a été tirée a hauteur de "+((valeur*100.0)/m)+"%."); //affiche le rendement du tirage en pourcentage (nombre de fois qu'est apparu le numéro saisie sur un nombre donné de lancé)
        }
        
    }
    
}
