/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_chauvet_bayle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author shirl
 */
public class fenetreDeJeu extends JFrame{
    
    int nbEssais;
    Ligne ligneTest;
    Ligne ligneGagnante;
    boolean newTest;
    int compteurPion = 0;
    
    public fenetreDeJeu() {
        super("Mastermind");
        WindowListener test = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
        };
        addWindowListener(test);
        setSize(1200,900);
        initComponent();
        
        this.setVisible(true);
        
        
    }
    
    private void initComponent() {
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        panneauJeu = new PolygonPanel();
        add(panneauJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20,50,-1,-1));
        panneauJeu.setSize(200,200);
        //panneauJeu.setBackground(Color.red);
        panneauJeu.setPreferredSize(new Dimension(680,880));
        setVisible(true);
        
        
        texte = new JLabel("Veuillez démarrer la partie.");
        Dimension size = texte.getPreferredSize();
        texte.setFont(new Font("Serif",Font.BOLD, 20));
        texte.setHorizontalAlignment(SwingConstants.CENTER);
        //texte.setBounds(620, 20, size.width, size.height);
        add(texte, new org.netbeans.lib.awtextra.AbsoluteConstraints(750,50,360,100));
        //texte.setOpaque(true);
        //texte.setBackground(Color.red);
        setVisible(true);
        
        demarrerPartie = new JButton("Démarrer la partie");
        add(demarrerPartie,new org.netbeans.lib.awtextra.AbsoluteConstraints(850,500));
        demarrerPartie.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                demarrerPartieActionPerformed(evt);
            }
        });
        
        rouge = new JButton();
        rouge.setBounds(650,200,60,60);
        add(rouge,new org.netbeans.lib.awtextra.AbsoluteConstraints(750,200,60,60));
        rouge.setBackground(Color.red);
        rouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rougeActionPerformed(evt);
            }
        });
        
        jaune = new JButton();
        jaune.setBounds(750,200,60,60);
        add(jaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(850,200,60,60));
        jaune.setBackground(Color.yellow);
        jaune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jauneActionPerformed(evt);
            }
        });
        
        vert = new JButton();
        vert.setBounds(850,200,60,60);
        add(vert, new org.netbeans.lib.awtextra.AbsoluteConstraints(950,200,60,60));
        vert.setBackground(Color.green);
        vert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertActionPerformed(evt);
            }
        });
        
        bleu = new JButton();
        bleu.setBounds(950,200,60,60);
        add(bleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050,200,60,60));
        bleu.setBackground(Color.blue);
        bleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleuActionPerformed(evt);
            }
        });
        
        blanc = new JButton();
        blanc.setBounds(650,300,60,60);
        add(blanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750,300,60,60));
        blanc.setBackground(Color.white);
        blanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancActionPerformed(evt);
            }
        });
        
        violet = new JButton();
        violet.setBounds(750,300,60,60);
        add(violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(850,300,60,60));
        violet.setBackground(Color.black);
        violet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                violetActionPerformed(evt);
            }
        });
        
        rose = new JButton();
        rose.setBounds(850,300,60,60);
        add(rose, new org.netbeans.lib.awtextra.AbsoluteConstraints(950,300,60,60));
        rose.setBackground(Color.pink);
        rose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roseActionPerformed(evt);
            }
        });
        
        orange = new JButton();
        orange.setBounds(950,300,60,60);
        add(orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050,300,60,60));
        orange.setBackground(Color.orange);
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });
    }
    
    private void rougeActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("rouge");
                    panneauJeu.c1 = Color.RED;
                    break;
                case 1 :
                    nouveauTest2("rouge");
                    panneauJeu.c2 = Color.RED;
                    break;
                case 2 :
                    nouveauTest3("rouge");
                    panneauJeu.c3 = Color.RED;
                    break;
                case 3 : 
                    nouveauTest4("rouge");
                    panneauJeu.c4 = Color.RED;
                    break;
            }
        
    }
    
    private void jauneActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("jaune");
                    break;
                case 1 :
                    nouveauTest2("jaune");
                    break;
                case 2 :
                    nouveauTest3("jaune");
                    break;
                case 3 : 
                    nouveauTest4("jaune");
                    break;
            }
        }
    
     private void vertActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("vert");
                    break;
                case 1 :
                    nouveauTest2("vert");
                    break;
                case 2 :
                    nouveauTest3("vert");
                    break;
                case 3 : 
                    nouveauTest4("vert");
                    break;
            }
    }
     
     private void bleuActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("bleu");
                    break;
                case 1 :
                    nouveauTest2("bleu");
                    break;
                case 2 :
                    nouveauTest3("bleu");
                    break;
                case 3 : 
                    nouveauTest4("bleu");
                    break;
            }
        
    }
     
     private void blancActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("blanc");
                    break;
                case 1 :
                    nouveauTest2("blanc");
                    break;
                case 2 :
                    nouveauTest3("blanc");
                    break;
                case 3 : 
                    nouveauTest4("blanc");
                    break;
            }
        
    }
    
     private void violetActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("violet");
                    break;
                case 1 :
                    nouveauTest2("violet");
                    break;
                case 2 :
                    nouveauTest3("violet");
                    break;
                case 3 : 
                    nouveauTest4("violet");
                    break;
            }
        
    }
     
     private void roseActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("rose");
                    break;
                case 1 :
                    nouveauTest2("rose");
                    break;
                case 2 :
                    nouveauTest3("rose");
                    break;
                case 3 : 
                    nouveauTest4("rose");
                    break;
            }
        
    }
     
     private void orangeActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("orange");
                    break;
                case 1 :
                    nouveauTest2("orange");
                    break;
                case 2 :
                    nouveauTest3("orange");
                    break;
                case 3 : 
                    nouveauTest4("orange");
                    break;
            }
        
    }
     
    private void demarrerPartieActionPerformed(java.awt.event.ActionEvent evt) {
        initialiserPartie();
        initTest();
        demarrerPartie.setVisible(false);
    }
    
    public void initTest() {
        nbEssais = nbEssais+1;
        blanc.setEnabled(true);
        bleu.setEnabled(true);
        orange.setEnabled(true);
        rose.setEnabled(true);
        rouge.setEnabled(true);
        jaune.setEnabled(true);
        vert.setEnabled(true);
        violet.setEnabled(true);
        viderLigne();
        texte.setText("<html>Veuillez choisir la couleur de vos pions<br>(de gauche à droite)</html>");
    }
    
    public boolean finTest() {
        if (compteurPion == 4) {
            return true;
        }
        else {
            return false;
        }
    }
        
    
    public void nouveauTest1(String couleur) {
        Pion p1 = new Pion(couleur);
        ligneTest.LigneAssociee[0] = p1;
        compteurPion = 1;
        panneauJeu.pion1 = true;
        panneauJeu.repaint();
        
    }
    
    public void nouveauTest2(String couleur) {
        Pion p2 = new Pion(couleur);
        ligneTest.LigneAssociee[1] = p2;
        compteurPion = 2;
    }
    
    public void nouveauTest3(String couleur) {
        Pion p3 = new Pion(couleur);
        ligneTest.LigneAssociee[2] = p3;
        compteurPion = 3;
    }
    
    public void nouveauTest4(String couleur) {
        Pion p4 = new Pion(couleur);
        ligneTest.LigneAssociee[3] = p4;
        compteurPion = 4;
        newTest = false;
        blanc.setEnabled(false);
        bleu.setEnabled(false);
        jaune.setEnabled(false);
        orange.setEnabled(false);
        rose.setEnabled(false);
        rouge.setEnabled(false);
        vert.setEnabled(false);
        violet.setEnabled(false);
                
    }
    
    public void viderLigne() {
        for (int i=0; i<4; i++) {
            ligneTest.LigneAssociee[i] = null;
        }
        compteurPion = 0;
        newTest = true;
    }
    
    public void initialiserPartie() {
        ligneGagnante = new Ligne();
        ligneTest = new Ligne();
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(8);
        int n2 = generateurAleat.nextInt(8);
        int n3 = generateurAleat.nextInt(8);
        int n4 = generateurAleat.nextInt(8);
        String tabCouleurs[] = {"rouge","jaune","vert","bleu","orange","blanc","violet","rose"};
        Pion pion1 = new Pion(tabCouleurs[n1]);
        Pion pion2 = new Pion(tabCouleurs[n2]);
        Pion pion3 = new Pion(tabCouleurs[n3]);
        Pion pion4 = new Pion(tabCouleurs[n4]);
        ligneGagnante.placerPion(pion1, pion2, pion3, pion4);
        newTest = false;
        nbEssais = 0;
    }
    
    private JLabel texte;
    private JButton rouge;
    private JButton jaune;
    private JButton vert;
    private JButton bleu;
    private JButton blanc;
    private JButton violet;
    private JButton rose;
    private JButton orange;
    private JButton demarrerPartie;
    PolygonPanel panneauJeu;
    
    public static void main(String [] args) {
        JFrame frame = new fenetreDeJeu();
    }
}
