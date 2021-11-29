/*
 * Classe Cellule Grpahique super puissance 4
 * CPO
 */
package sp4_console_bayle;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author shirl
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png")); // créé les variable contenant les images
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    public CelluleGraphique(Cellule uneCellule) { //constructeur 
        celluleAssociee = uneCellule;
    }
    
    
    @Override
    public void paintComponent (Graphics G) { //gere l'affichage des cellules
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir()) { //associe les images
            setIcon(img_trouNoir);
        }
        else if(celluleAssociee.presenceDesintegrateur()) {
            setIcon(img_desint);
        }
        else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton(); 
            switch (couleur_jeton) {
                case "rouge" :
                    setIcon(img_jetonRouge);
                    break;
                case "jaune" :
                    setIcon(img_jetonJaune);
                    break;
                case "pas de jeton" :
                    setIcon(img_vide);
                    break;
            }
        }
    }
}
