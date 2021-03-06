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
   
   public boolean placerDesintegrateur(int ligne, int colonne) { //place les desintegrateurs sur une cellule de la grille
       if (CellulesJeu[ligne][colonne-1].desintegrateur == false) {
           CellulesJeu[ligne][colonne-1].desintegrateur = true;
           return true;
       }
       else {
           return false;
       }
   }
   
   public boolean supprimerJeton(int ligne, int colonne) { //supprime le jeton de la cellule de la grille
       boolean suppression = CellulesJeu[ligne][colonne-1].supprimerJeton();
       return suppression;
   }
    
   public boolean placertrouNoir(int ligne, int colonne) { //place un trou noir sur une cellule de la grille
        if (CellulesJeu[ligne][colonne-1].trouNoir == false) {
            CellulesJeu[ligne][colonne-1].trouNoir = true;
            return true;
        }
        else {
            return false;
        }
   }
   
   public Grille() { //constructeur
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) { 
               CellulesJeu[i][j] = new Cellule();
           }
       }
   }
   
   public Jeton recupererJeton(int ligne, int colonne) { //récupère un jeton d'une cellule de la grille
       Jeton jet = CellulesJeu[ligne-1][colonne-1].jetonCourant;
       CellulesJeu[ligne-1][colonne-1].jetonCourant = null;
       return jet;
   }
   
   public void tasserColonne(int colonne) { // tasse une colonne de la grille
       int ligne = -1;
       for (int i=0; i<6; i++) {
           if (CellulesJeu[i][colonne-1].jetonCourant == null) {
               ligne = i;
               break;
           }
       }
       for (int j=ligne; j<5; j++){
           if (j==-1) break;
           CellulesJeu[j][colonne-1].jetonCourant = CellulesJeu[j+1][colonne-1].jetonCourant;
           CellulesJeu[5][colonne-1].jetonCourant = null;
       }
   }
   
   public void tasserGrille() { //tasse la grille entière
       for (int i=1; i<8; i++) {
           tasserColonne(i);
       }
   }
   
   public boolean ajouterJetonDansColonne(Joueur joueur, int colonne) { //ajoute un jeton dans une colonne de la grille
       Jeton jet = joueur.ListeJetons[joueur.nombreJetonsRestants-1];
       joueur.ListeJetons[joueur.nombreJetonsRestants-1] = null;
       joueur.nombreJetonsRestants = joueur.nombreJetonsRestants -1;
       for (int i=0; i<6; i++) { //parcoure la colonne et teste les conditions sur chaque cellule 
           boolean testtrounoir = CellulesJeu[i][colonne-1].presenceTrouNoir(); //test trou noir et desintegrateur sur chaque cellule
           boolean testdesintegrateur = CellulesJeu[i][colonne-1].presenceDesintegrateur();
           if (CellulesJeu[i][colonne-1].jetonCourant == null && testtrounoir == false && testdesintegrateur == false){      
               CellulesJeu[i][colonne-1].jetonCourant = jet;
               return true;
           }
           else if (CellulesJeu[i][colonne-1].jetonCourant == null && testtrounoir == true  && testdesintegrateur == false) {
               CellulesJeu[i][colonne-1].trouNoir = false;
               return true;
           }
           else if (CellulesJeu[i][colonne-1].jetonCourant == null && testtrounoir == false && testdesintegrateur == true) {
               CellulesJeu[i][colonne-1].desintegrateur = false;
               CellulesJeu[i][colonne-1].jetonCourant = jet;
               joueur.nombreDesintegrateurs = joueur.nombreDesintegrateurs+1;
               return true;
           }
           else if (CellulesJeu[i][colonne-1].jetonCourant == null && testtrounoir == true && testdesintegrateur == true) {
               CellulesJeu[i][colonne-1].desintegrateur = false;
               CellulesJeu[i][colonne-1].trouNoir = false;
               joueur.nombreDesintegrateurs = joueur.nombreDesintegrateurs+1;
               return true;
           }
           
       }
       return false;
   }
   
   public boolean etreRemplie() { //teste si une colonne est remplie
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               if (CellulesJeu[i][j].jetonCourant == null) {
                   return false;
               }
           }
       }
       return true;
   }
   
   public void viderGrille() { //vide la grille
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               CellulesJeu[i][j].jetonCourant = null;
           }
       }
   }
   
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_YELLOW = "\u001B[1;33m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
   
   public void afficherGrilleSurConsole() { //affiche la grille sur console
       for (int i=5; i>=0; i--){
           System.out.print(ANSI_BLUE_BACKGROUND + ANSI_CYAN + "\n|" + ANSI_RESET);
           for (int j=0; j<7; j++) {
               String couleur = CellulesJeu[i][j].lireCouleurDuJeton();
               boolean trouNoir = CellulesJeu[i][j].trouNoir;
               if (couleur == "pas de jeton" && trouNoir == false) {
                   System.out.print(ANSI_BLUE_BACKGROUND + ANSI_CYAN + " \u2022 |" + ANSI_RESET);
               }
               else if (couleur == "pas de jeton" && trouNoir == true){
                   System.out.print(ANSI_BLUE_BACKGROUND + ANSI_BLACK + " \u2022 " + ANSI_CYAN + "|" + ANSI_RESET);
               }
               else if (couleur == "rouge") {
                   System.out.print(ANSI_BLUE_BACKGROUND + ANSI_RED + " \u2022 "+ ANSI_CYAN + "|"+ ANSI_RESET);
               }
               else if (couleur == "jaune") {
                   System.out.print(ANSI_BLUE_BACKGROUND + ANSI_YELLOW + " \u2022 " + ANSI_CYAN + "|" + ANSI_RESET);
               }
           }
       }
   }
   
   public boolean celluleOccupee(int ligne, int colonne) { //teste s'il y a un jeton sur la cellule de la grille
       if (CellulesJeu[ligne-1][colonne-1].jetonCourant != null){
       return true;
       }
       else{
       return false;
       }
   }
   
   public String lireCouleurDuJeton(int ligne, int colonne) { //lis la couleur du jeton présent dans la cellule de la grille
       Jeton jeton = CellulesJeu[ligne-1][colonne-1].jetonCourant;
       String couleur;
       if (jeton != null) {
       couleur = jeton.Couleur;
       }
       else {
           couleur = "pas de jeton";
       }
       return couleur;
   }
   
   public boolean etreGagnantePourJoueur(Joueur j1) { //teste si la grille est gagnante pour un des joueurs
       String couleur = j1.Couleur;
       for (int i=0; i<6; i++){ // vérif ligne gagnante
           for (int j=0; j<4; j++){
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       } 
       for (int i=0; i<3; i++) {  // vérif colonne gagnante
           for (int j=0; j<7; j++) { 
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i+1][j].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i+2][j].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i+3][j].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       for (int i=0; i<3; i++){  //vérif diagonale haute gagnante
           for (int j=0; j<4; j++) {
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i+1][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i+2][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i+3][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       for (int i=3; i<6; i++){  // vérif diagonale basse gagnante
           for (int j=0; j<4; j++) {
               String CJ1 = CellulesJeu[i][j].lireCouleurDuJeton();
               String CJ2 = CellulesJeu[i-1][j+1].lireCouleurDuJeton();
               String CJ3 = CellulesJeu[i-2][j+2].lireCouleurDuJeton();
               String CJ4 = CellulesJeu[i-3][j+3].lireCouleurDuJeton();
               if (CJ1 == couleur && CJ2 == couleur && CJ3 == couleur && CJ4 == couleur) {
                   return true;
               }
           }
       }
       return false;
   }
   
   public boolean colonneRemplie(int colonne) { //teste si la colonne de la grille est remplie
       for (int i=0; i<6; i++) {
           if (CellulesJeu[i][colonne-1].jetonCourant == null) {
               return false;
           }
       }
       return true;
   }
}
