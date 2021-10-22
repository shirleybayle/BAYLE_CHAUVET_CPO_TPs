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

    //On réutilise les classe Moussaka et Tartiflette dnas d'autres .java
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; //assiette2 et assiette3 sont les mêmes assiettes, quand on en change une, l'autre change aussi
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        Tartiflette temporaire = assiette1;
        assiette1 = assiette2;
        assiette2 = temporaire; //L'assiette 2 prend temporairement la valeur de l'assiette 1, ce sont toujours 2 objet différent 
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        /*
        -L'assiette 666 ne peut pas marcher, on ne peut pas lui associer de valeur provenant d'une autre classe, ici Tartiflette
        -L'assiette 667 ne peut pas marcher, on ne peut pas créer de valeur provenant d'une autre classe, ici Tartiflette
        Il faudrait déjà associer les 2 classes pour que les 2 objets puissent interagir
        -Une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport
        */
        Moussaka [] tableau = new Moussaka[10];
        for (int i=0; i<10; i++) {
            tableau[i] = new Moussaka(100*i);
        }
        
        
    }
    
}
