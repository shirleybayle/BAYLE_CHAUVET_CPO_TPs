/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_bayle;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author shirl
 */
public class fenetreDejeu extends javax.swing.JFrame {

    Joueur ListeJoueurs[] = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();

    /**
     * Creates new form fenetreDejeu
     */
    public fenetreDejeu() {
        initComponents();
        setTitle("Super puissance 4");
        Image icone = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png"));
        this.setIconImage(icone);
        panneau_info_joueur.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        } else if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) {
                            message.setText(joueurCourant.Nom + " récupère son jeton.");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs>0) {
                            message.setText(joueurCourant.Nom + " désintègre un jeton.");
                            c.supprimerJeton();
                            joueurCourant.utiliserDesintegrateur();
                            joueurSuivant();
                            }
                            else {
                                return;
                            }
                        }
                        
                        grilleJeu.tasserGrille();
                        
                        if (grilleJeu.colonneRemplie(1)) btn_col_1.setEnabled(false);
                        else btn_col_1.setEnabled(true);
                        if (grilleJeu.colonneRemplie(2)) btn_col_2.setEnabled(false);
                        else btn_col_2.setEnabled(true);
                        if (grilleJeu.colonneRemplie(3)) btn_col_3.setEnabled(false);
                        else btn_col_3.setEnabled(true);
                        if (grilleJeu.colonneRemplie(4)) btn_col_4.setEnabled(false);
                        else btn_col_4.setEnabled(true);
                        if (grilleJeu.colonneRemplie(5)) btn_col_5.setEnabled(false);
                        else btn_col_5.setEnabled(true);
                        if (grilleJeu.colonneRemplie(6)) btn_col_6.setEnabled(false);
                        else btn_col_6.setEnabled(true);
                        if (grilleJeu.colonneRemplie(7)) btn_col_7.setEnabled(false);
                        else btn_col_7.setEnabled(true);
                        
                        panneau_grille.repaint();

                        nbjetonsj2.setText(ListeJoueurs[1].nombreJetonsRestants + "");
                        nbjetonsj1.setText(ListeJoueurs[0].nombreJetonsRestants + "");

                        nbdesintj1.setText(ListeJoueurs[0].nombreDesintegrateurs+"");
                        nbdesintj2.setText(ListeJoueurs[1].nombreDesintegrateurs+"");
                         
                        boolean victoire_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
                        boolean victoire_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
                        if (victoire_j1 == true && victoire_j2 == false) {
                            message.setText("Bravo " + ListeJoueurs[0].Nom + " vous avez gagné !");
                        }
                        if (victoire_j2 == true && victoire_j1 == false) {
                            message.setText("Bravo " + ListeJoueurs[1].Nom + " vous avez gagné !");
                        }
                        if (victoire_j1 == true && victoire_j2 == true) {
                            if (joueurCourant == ListeJoueurs[0]) {
                                message.setText(ListeJoueurs[1].Nom + ", vous avez commis une faute de jeu.\nGrâce à vous, " + ListeJoueurs[0].Nom + " a gagné !");
                            } else {
                                message.setText(ListeJoueurs[0].Nom + ", vous avez commis une faute de jeu.\nGrâce à vous, " + ListeJoueurs[1].Nom + " a gagné !");
                            }
                        }
                    }
                });
                panneau_grille.add(cellGraph);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_debut = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nbjetonsj1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nomj1 = new javax.swing.JLabel();
        couleurj1 = new javax.swing.JLabel();
        nbdesintj2 = new javax.swing.JLabel();
        couleurj2 = new javax.swing.JLabel();
        nbjetonsj2 = new javax.swing.JLabel();
        nbdesintj1 = new javax.swing.JLabel();
        nomj2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nom_joueurCourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        btn_col_7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(51, 51, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom du joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Nom du joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        btn_debut.setText("Démarrer la partie !");
        btn_debut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_debutActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, 30));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 130));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia Pro", 0, 18)); // NOI18N
        jLabel3.setText("Infos joueurs :");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel4.setText("Joueur 2 :");
        panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        nbjetonsj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbjetonsj1.setText("nbjetonsj1");
        panneau_info_joueur.add(nbjetonsj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel6.setText("Joueur 1 :");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel7.setText("Couleur :");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel8.setText("Désintégrateurs :");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel9.setText("Nombre de jetons restants :");
        panneau_info_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel10.setText("Couleur :");
        panneau_info_joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel11.setText("Désintégrateurs :");
        panneau_info_joueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel12.setText("Nombre de jetons restants :");
        panneau_info_joueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        nomj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nomj1.setText("nomj1");
        panneau_info_joueur.add(nomj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        couleurj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        couleurj1.setText("couleurj1");
        panneau_info_joueur.add(couleurj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        nbdesintj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbdesintj2.setText("nbdesintj2");
        panneau_info_joueur.add(nbdesintj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        couleurj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        couleurj2.setText("couleurj2");
        panneau_info_joueur.add(couleurj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        nbjetonsj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbjetonsj2.setText("nbjetonsj2");
        panneau_info_joueur.add(nbjetonsj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        nbdesintj1.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nbdesintj1.setText("nbdesintj1");
        panneau_info_joueur.add(nbdesintj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        nomj2.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nomj2.setText("nomj2");
        panneau_info_joueur.add(nomj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 310, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 230));

        panneau_info_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia Pro", 0, 18)); // NOI18N
        jLabel5.setText("Infos partie :");
        panneau_info_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        jLabel13.setText("C'est au tour de ");
        panneau_info_partie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        nom_joueurCourant.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        nom_joueurCourant.setText("nomJoueurCourant");
        panneau_info_partie.add(nom_joueurCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        message.setBackground(new java.awt.Color(204, 204, 255));
        message.setColumns(16);
        message.setFont(new java.awt.Font("Georgia Pro", 1, 13)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 51));
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 310, 90));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 150));

        btn_col_1.setText("1");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        btn_col_2.setText("2");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 20, -1, -1));

        btn_col_3.setText("3");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 20, -1, -1));

        btn_col_4.setText("4");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 20, -1, -1));

        btn_col_5.setText("5");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 20, -1, -1));

        btn_col_6.setText("6");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        btn_col_7.setText("7");
        btn_col_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("8-bit Arcade In", 0, 45)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("SUPER PUISSANCE 4");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 370, 70));

        jLabel15.setFont(new java.awt.Font("8-bit Arcade Out", 0, 44)); // NOI18N
        jLabel15.setText("SUPER PUISSANCE 4");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        setBounds(0, 0, 1055, 692);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_debutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_debutActionPerformed
        panneau_info_joueur.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        btn_debut.setEnabled(false);
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_debutActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(0);
        if (grilleJeu.colonneRemplie(1)) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(1);
        if (grilleJeu.colonneRemplie(2)) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(2);
        if (grilleJeu.colonneRemplie(3)) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(3);
        if (grilleJeu.colonneRemplie(4)) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(4);
        if (grilleJeu.colonneRemplie(5)) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(5);
        if (grilleJeu.colonneRemplie(6)) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_col_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_7ActionPerformed
        jouerDansColonne(6);
        if (grilleJeu.colonneRemplie(7)) {
            btn_col_7.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_7ActionPerformed

    public boolean jouerDansColonne(int colonne) {
        boolean testColonne;
        if (joueurCourant.nombreJetonsRestants>0) {
            testColonne = grilleJeu.ajouterJetonDansColonne(joueurCourant, colonne + 1);
        }
        else {
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            btn_col_7.setEnabled(false);
            message.setText("VOUS N'AVEZ PLUS DE JETONS !!!!\nPour continuer le jeu, veuillez désintégrer\nun jeton si vous avez un désintégrateur\nou bien récupérer un de vos jetons.");
            joueurSuivant();
        }
        panneau_grille.repaint();

        nbjetonsj2.setText(ListeJoueurs[1].nombreJetonsRestants + "");
        nbjetonsj1.setText(ListeJoueurs[0].nombreJetonsRestants + "");

        nbdesintj1.setText(ListeJoueurs[0].nombreDesintegrateurs+"");
        nbdesintj2.setText(ListeJoueurs[1].nombreDesintegrateurs+"");
         
        boolean victoire_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
        boolean victoire_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
        if (victoire_j1 == true && victoire_j2 == false) {
            message.setText("Bravo " + ListeJoueurs[0].Nom + " vous avez gagné !");
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            btn_col_7.setEnabled(false);
        }
        if (victoire_j2 == true && victoire_j1 == false) {
            message.setText("Bravo " + ListeJoueurs[1].Nom + " vous avez gagné !");
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            btn_col_7.setEnabled(false);
        }
        if (victoire_j1 == true && victoire_j2 == true) {
            if (joueurCourant == ListeJoueurs[0]) {
                message.setText(ListeJoueurs[0].Nom + ", vous avez commis une faute de jeu. Grâce à vous, " + ListeJoueurs[1].Nom + " a gagné !");
                btn_col_1.setEnabled(false);
                btn_col_2.setEnabled(false);
                btn_col_3.setEnabled(false);
                btn_col_4.setEnabled(false);
                btn_col_5.setEnabled(false);
                btn_col_6.setEnabled(false);
                btn_col_7.setEnabled(false);
            } else {
                message.setText(ListeJoueurs[1].Nom + ", vous avez commis une faute de jeu. Grâce à vous, " + ListeJoueurs[0].Nom + " a gagné !");            
                btn_col_1.setEnabled(false);
                btn_col_2.setEnabled(false);
                btn_col_3.setEnabled(false);
                btn_col_4.setEnabled(false);
                btn_col_5.setEnabled(false);
                btn_col_6.setEnabled(false);
                btn_col_7.setEnabled(false);
            }
        }

        if (testColonne = true) {
            return true;
        } else {
            return false;
        }

    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
        } else {
            joueurCourant = ListeJoueurs[0];
        }
        nom_joueurCourant.setText(joueurCourant.Nom);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {
        grilleJeu.viderGrille();

        String nomJoueur1 = nom_joueur1.getText();
        Joueur j1 = new Joueur(nomJoueur1);
        String nomJoueur2 = nom_joueur2.getText();
        Joueur j2 = new Joueur(nomJoueur2);

        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;

        attribuerCouleursAuxJoueurs();

        System.out.println(nomJoueur1 + "est de couleur" + j1.Couleur);
        System.out.println(nomJoueur2 + "est de couleur" + j2.Couleur);

        nomj1.setText(nomJoueur1);
        nomj2.setText(nomJoueur2);
        couleurj1.setText(j1.Couleur);
        couleurj2.setText(j2.Couleur);
        nbdesintj1.setText(j1.nombreDesintegrateurs+"");
        nbdesintj2.setText(j2.nombreDesintegrateurs+"");

        String couleurjet0 = ListeJoueurs[0].Couleur;
        Jeton jet0 = new Jeton(couleurjet0);
        for (int i = 0; i < 22; i++) {
            ListeJoueurs[0].ajouterJeton(jet0);
        }
        String couleurjet1 = ListeJoueurs[1].Couleur;
        Jeton jet1 = new Jeton(couleurjet1);
        for (int i = 0; i < 22; i++) {
            ListeJoueurs[1].ajouterJeton(jet1);
        }

        nbjetonsj1.setText(j1.nombreJetonsRestants + "");
        nbjetonsj2.setText(j2.nombreJetonsRestants + "");

        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(2); //on associe 0 à rouge et 1 à jaune
        if (n == 0 && ListeJoueurs[0].Couleur == "rouge") {  //on tire au sort pour savoir qui commence
            joueurCourant = ListeJoueurs[0];
        } else if (n == 0 && ListeJoueurs[0].Couleur == "jaune") {
            joueurCourant = ListeJoueurs[1];
        } else if (n == 1 && ListeJoueurs[0].Couleur == "jaune") {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        nom_joueurCourant.setText(joueurCourant.Nom);

        for (int i = 0; i < 5; i++) {
            int lignetn = generateurAleat.nextInt(6);
            int colonnetn = generateurAleat.nextInt(7) + 1;
            boolean tnplace = grilleJeu.placertrouNoir(lignetn, colonnetn);
            if (tnplace == false) {
                i = i - 1;
            }
        }
        for (int i = 0; i<3; i++) {
            int lignedesint = generateurAleat.nextInt(6);
            int colonnedesint = generateurAleat.nextInt(7)+1;
            if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].desintegrateur == true) {
                i = i-1;
            }
            else if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].trouNoir == true) {
                i = i-1;
            }
            else {
                grilleJeu.placerDesintegrateur(lignedesint, colonnedesint);
            }
        }
        for (int i=0; i<2; i++) {
            int lignedesint = generateurAleat.nextInt(6);
            int colonnedesint = generateurAleat.nextInt(7)+1;
            if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].desintegrateur == true) {
                i = i-1;
            }
            else if (grilleJeu.CellulesJeu[lignedesint][colonnedesint-1].trouNoir == false) {
                i = i-1;
            }
            else {
                grilleJeu.placerDesintegrateur(lignedesint, colonnedesint);
            }
        }
    }

    public void attribuerCouleursAuxJoueurs() {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(2);
        Joueur joueur1 = ListeJoueurs[0];
        Joueur joueur2 = ListeJoueurs[1];
        if (n == 0) {
            joueur1.Couleur = "jaune";
            joueur2.Couleur = "rouge";
        } else {
            joueur1.Couleur = "rouge";
            joueur2.Couleur = "jaune";
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_col_7;
    private javax.swing.JButton btn_debut;
    private javax.swing.JLabel couleurj1;
    private javax.swing.JLabel couleurj2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea message;
    private javax.swing.JLabel nbdesintj1;
    private javax.swing.JLabel nbdesintj2;
    private javax.swing.JLabel nbjetonsj1;
    private javax.swing.JLabel nbjetonsj2;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JLabel nom_joueurCourant;
    private javax.swing.JLabel nomj1;
    private javax.swing.JLabel nomj2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
