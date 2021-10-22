/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP2 Cours Programmation Objet
 * Exercice manipulation des objets 
 */
package tp2_manip_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class TP2_manip_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; //assiette2 et assiette3 sont les mêmes assiettes, quand on en change une, l'autre change aussi
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        Tartiflette temporaire = assiette1;
        assiette1 = assiette2;
        assiette2 = temporaire;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        Moussaka [] tableau = new Moussaka[10];
        for (int i=0; i<10; i++) {
            tableau[i] = new Moussaka(100*i);
        }
        
        
    }
    
}
