/*
 * Classe ligne
 */
package mastermind_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class Ligne {
    Pion LigneAssociee[] = new Pion[4];
    
    public void placerPion(Pion p1, Pion p2, Pion p3, Pion p4) {
        LigneAssociee[0] = p1;
        LigneAssociee[1] = p2;
        LigneAssociee[2] = p3;
        LigneAssociee[3] = p4;
    }
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public void afficherLigne() {
        for (int i=0; i<4; i++) {
            System.out.print(" ");
            switch (LigneAssociee[i].Couleur){
                    case "r" :
                        System.out.print(ANSI_RED + "\u2022 " + ANSI_RESET);
        }
    }
}
}