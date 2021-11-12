/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bayle;

/**
 *
 * @author shirl
 */
public class Grille {
   Cellule [][] CellulesJeu = new Cellule [6][7];
   
   public Grille() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) { 
               CellulesJeu[i][j] = new Cellule();
           }
       }
   }
   
   public boolean ajouterJetonDansColonne(Jeton jet, int colonne) {
       for (int i=0; i<6; i++) {
           if (CellulesJeu[i][colonne-1].jetonCourant == null){
               CellulesJeu[i][colonne-1].jetonCourant = jet;
               return true;
           }
       }
       return false;
   }
   
   public boolean etreRemplie() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               if (CellulesJeu[i][j].jetonCourant == null) {
                   return false;
               }
           }
       }
       return true;
   }
   
   public void viderGrille() {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               CellulesJeu[i][j].jetonCourant = null;
           }
       }
   }
   
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_WHITE = "\u001B[37m";
   
   public void afficherGrilleSurConsole() {
       for (int i=5; i>=0; i--){
           System.out.print(ANSI_WHITE + "\n|" + ANSI_RESET);
           for (int j=0; j<7; j++) {
               String couleur = CellulesJeu[i][j].lireCouleurDuJeton();
               if (couleur == "pas de jeton") {
                   System.out.print(ANSI_WHITE + " \u2022 |" + ANSI_RESET);
               }
               else if (couleur == "rouge") {
                   System.out.print(ANSI_RED + " \u2022 "+ ANSI_WHITE + "|"+ ANSI_RESET);
               }
               else if (couleur == "jaune") {
                   System.out.print(ANSI_YELLOW + " \u2022 " + ANSI_WHITE + "|" + ANSI_RESET);
               }
           }
       }
   }
   
   public boolean celluleOccupee(int ligne, int colonne) {
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               if (CellulesJeu[i][j].jetonCourant != null) {
                   return true;
               }
           }
       }
       return false;
   }
}
