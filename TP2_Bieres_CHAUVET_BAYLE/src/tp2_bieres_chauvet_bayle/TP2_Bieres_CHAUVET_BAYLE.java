/*
 * CHAUVET Ylan - BAYLE Shirley
 * Tp2 Cours Programmation Objet
 * Exercices Bières
 */
package tp2_bieres_chauvet_bayle;

/**
 *
 * @author shirl
 */
public class TP2_Bieres_CHAUVET_BAYLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere biereDeux = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        biereDeux.lireEtiquette();
        
        BouteilleBiere biereTrois = new BouteilleBiere("Skoll", 6, "Brasserie Kronenbourg");
        biereTrois.lireEtiquette();
                
        BouteilleBiere biereQuatre = new BouteilleBiere("La Chouffe", 8, "Brasserie d'Achouffe");
        biereQuatre.lireEtiquette();
        
        BouteilleBiere biereCinq = new BouteilleBiere("La rince Cochon", 8.5, "Brasserie Haacht");
        biereCinq.lireEtiquette();
        
        biereDeux.Decapsuler();
        biereCinq.Decapsuler();
        biereTrois.Decapsuler();
        
        System.out.println(uneBiere);
        System.out.println(biereDeux);
        System.out.println(biereTrois);
        System.out.println(biereQuatre);
        System.out.println(biereCinq);
}

        
}

    
    

