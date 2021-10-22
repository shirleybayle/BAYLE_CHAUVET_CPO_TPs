/*
 * CHAUVET Ylan - BAYLE Shirley
 * TP2 Cours Programmation Objet 
 * Exercice relation entre objets
 */
package tp2_relation_1_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class TP2_relation_1_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines"); //affectation de différentes valeurs aux objets créé dans d'autres .java 
        System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.proprietaire = bob;
        
        bob.liste_voitures[1] = une2008;
        bob.nbVoitures = 2;
        une2008.proprietaire =bob;
        
        reno.liste_voitures[0] = uneAutreClio;
        reno.nbVoitures = 1;
        uneAutreClio.proprietaire = reno;
        
        reno.ajouter_voitures(uneMicra);

        System.out.println("Les voitures de bob sont "+bob.liste_voitures[0]+" et "+bob.liste_voitures[1]) ;
        System.out.println("Les voitures de reno sont "+reno.liste_voitures[0]+" et "+reno.liste_voitures[1]) ;
        //affiche les valeurs selon le @Override des autres .java
        


    }
    
}
