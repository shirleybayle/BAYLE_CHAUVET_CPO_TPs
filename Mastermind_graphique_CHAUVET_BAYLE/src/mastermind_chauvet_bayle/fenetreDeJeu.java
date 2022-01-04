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
import java.util.ArrayList;
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
    Ligne ligneTest = new Ligne();
    Ligne ligneGagnante = new Ligne();
    boolean initTest;
    int compteurPion = 0;
    boolean partie = false;
    
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
        while (nbEssais != 11 || etreGagnante() == false) {
            if (partie) {
            initTest();
            }
            
        }
        
        
        
    }
    
    public boolean etreGagnante() {
        int tab [] = new int[2];
        tab = nbJuste();
        if (tab[0] == 4) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int[] nbJuste() {
        //renvoie le nombre de pions bien placés et le nombre de pions présents mais mal placés
        int tableau [] = new int[2];
        ArrayList<String> tableauTest = new ArrayList<>();
        ArrayList<String> tableauGagnant = new ArrayList<>();
        int compteurJuste = 0;
        int compteurMoyensJuste = 0;
        for (int i=0; i<4; i++) {
            tableauTest.add(ligneGagnante.LigneAssociee[i].Couleur);
           if (ligneTest.LigneAssociee[i].Couleur.equals(ligneGagnante.LigneAssociee[i].Couleur)) {
               compteurJuste = compteurJuste + 1;
               tableauTest.remove(ligneTest.LigneAssociee[i].Couleur);
               tableauGagnant.remove(ligneGagnante.LigneAssociee[i].Couleur);
           }
        }
        for (int j=0; j<tableauTest.size(); j++) {
            for (int k=0; k<4; k++) {
                if (tableauTest.contains(ligneTest.LigneAssociee[k].Couleur)) {
                //if (tableauTest.get(j).Couleur.equals(ligneTest.LigneAssociee[k].Couleur)) {
                    compteurMoyensJuste = compteurMoyensJuste + 1;
                    tableauTest.remove(ligneTest.LigneAssociee[k].Couleur);
                    tableauGagnant.remove(ligneGagnante.LigneAssociee[k].Couleur);
                    
                }
            }
        }
        tableau[0] = compteurJuste;
        tableau[1] = compteurMoyensJuste;
        return tableau;
        
    }
    
    private void initComponent() {
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        panneauJeu = new PolygonPanel();
        add(panneauJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20,50,-1,-1));
        panneauJeu.setSize(200,200);
        //panneauJeu.setBackground(Color.red);
        panneauJeu.setPreferredSize(new Dimension(680,880));
        setVisible(true);
        
        panneauJeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        messagePasJuste1 = new JLabel("1");
        Dimension sizep1 = messagePasJuste1.getPreferredSize();
        messagePasJuste1.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470,180));
        messagePasJuste1.setVisible(false);
        
        messagePasJuste2 = new JLabel("2");
        Dimension sizep2 = messagePasJuste2.getPreferredSize();
        messagePasJuste2.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475,210));
        messagePasJuste2.setVisible(false);
        
        messagePasJuste3 = new JLabel("3");
        Dimension sizep3 = messagePasJuste3.getPreferredSize();
        messagePasJuste3.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste3, new org.netbeans.lib.awtextra.AbsoluteConstraints(485,245));
        messagePasJuste3.setVisible(false);
        
        messagePasJuste4 = new JLabel("4");
        Dimension sizep4 = messagePasJuste4.getPreferredSize();
        messagePasJuste4.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste4, new org.netbeans.lib.awtextra.AbsoluteConstraints(495,285));
        messagePasJuste4.setVisible(false);
        
        messagePasJuste5 = new JLabel("5");
        Dimension sizep5 = messagePasJuste5.getPreferredSize();
        messagePasJuste5.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste5, new org.netbeans.lib.awtextra.AbsoluteConstraints(505,325));
        messagePasJuste5.setVisible(false);
        
        messagePasJuste6 = new JLabel("6");
        Dimension sizep6 = messagePasJuste6.getPreferredSize();
        messagePasJuste6.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste6, new org.netbeans.lib.awtextra.AbsoluteConstraints(515,370));
        messagePasJuste6.setVisible(false);
        
        messagePasJuste7 = new JLabel("7");
        Dimension sizep7 = messagePasJuste7.getPreferredSize();
        messagePasJuste7.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530,420));
        messagePasJuste7.setVisible(false);
        
        messagePasJuste8 = new JLabel("8");
        Dimension sizep8 = messagePasJuste8.getPreferredSize();
        messagePasJuste8.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste8, new org.netbeans.lib.awtextra.AbsoluteConstraints(545,480));
        messagePasJuste8.setVisible(false);
        
        messagePasJuste9 = new JLabel("9");
        Dimension sizep9 = messagePasJuste9.getPreferredSize();
        messagePasJuste9.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560,550));
        messagePasJuste9.setVisible(false);
        
        messagePasJuste10 = new JLabel("10");
        Dimension sizep10 = messagePasJuste10.getPreferredSize();
        messagePasJuste10.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580,630));
        messagePasJuste10.setVisible(false);
        
        messagePasJuste11 = new JLabel("11");
        Dimension sizep11 = messagePasJuste11.getPreferredSize();
        messagePasJuste11.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messagePasJuste11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600,730));
        messagePasJuste11.setVisible(false);
        
        messageJuste1 = new JLabel("1");
        Dimension size1 = messageJuste1.getPreferredSize();
        messageJuste1.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140,180));
        messageJuste1.setVisible(false);
        
        messageJuste2 = new JLabel("2");
        Dimension size2 = messageJuste2.getPreferredSize();
        messageJuste2.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130,210));
        messageJuste2.setVisible(false);
        
        messageJuste3 = new JLabel("3");
        Dimension size3 = messageJuste3.getPreferredSize();
        messageJuste3.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120,245));
        messageJuste3.setVisible(false);
        
        messageJuste4 = new JLabel("4");
        Dimension size4 = messageJuste4.getPreferredSize();
        messageJuste4.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110,285));
        messageJuste4.setVisible(false);
        
        messageJuste5 = new JLabel("5");
        Dimension size5 = messageJuste5.getPreferredSize();
        messageJuste5.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100,325));
        messageJuste5.setVisible(false);
        
        messageJuste6 = new JLabel("6");
        Dimension size6 = messageJuste6.getPreferredSize();
        messageJuste6.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90,370));
        messageJuste6.setVisible(false);
        
        messageJuste7 = new JLabel("7");
        Dimension size7 = messageJuste7.getPreferredSize();
        messageJuste7.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80,420));
        messageJuste7.setVisible(false);
        
        messageJuste8 = new JLabel("8");
        Dimension size8 = messageJuste8.getPreferredSize();
        messageJuste8.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65,480));
        messageJuste8.setVisible(false);
        
        messageJuste9 = new JLabel("9");
        Dimension size9 = messageJuste9.getPreferredSize();
        messageJuste9.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50,550));
        messageJuste9.setVisible(false);
        
        messageJuste10 = new JLabel("10");
        Dimension size10 = messageJuste10.getPreferredSize();
        messageJuste10.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25,630));
        messageJuste10.setVisible(false);
        
        messageJuste11 = new JLabel("11");
        Dimension size11 = messageJuste11.getPreferredSize();
        messageJuste11.setFont(new Font("Serif",Font.BOLD,18));
        panneauJeu.add(messageJuste11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,730));
        messageJuste11.setVisible(false);
        
        
        texte = new JLabel("Veuillez démarrer la partie.");
        //Dimension size = texte.getPreferredSize();
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
        
        blanc.setEnabled(false);
        bleu.setEnabled(false);
        orange.setEnabled(false);
        rose.setEnabled(false);
        rouge.setEnabled(false);
        jaune.setEnabled(false);
        vert.setEnabled(false);
        violet.setEnabled(false);
    }
    
    private void rougeActionPerformed(java.awt.event.ActionEvent evt) {
            switch (compteurPion) {
                case 0 :
                    nouveauTest1("rouge");
                    break;
                case 1 :
                    nouveauTest2("rouge");
                    break;
                case 2 :
                    nouveauTest3("rouge");
                    break;
                case 3 : 
                    nouveauTest4("rouge");
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
        blanc.setEnabled(true);
        bleu.setEnabled(true);
        orange.setEnabled(true);
        rose.setEnabled(true);
        rouge.setEnabled(true);
        jaune.setEnabled(true);
        vert.setEnabled(true);
        violet.setEnabled(true);
        partie = true;
        initTest();
        demarrerPartie.setVisible(false);
    }
    
    public void initTest() {
        nbEssais = nbEssais+1;
        initTest = true;
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
        panneauJeu.tableauPions.add(p1);
        panneauJeu.repaint();
        
    }
    
    public void nouveauTest2(String couleur) {
        Pion p2 = new Pion(couleur);
        ligneTest.LigneAssociee[1] = p2;
        compteurPion = 2;
        panneauJeu.tableauPions.add(p2);
        panneauJeu.repaint();
    }
    
    public void nouveauTest3(String couleur) {
        Pion p3 = new Pion(couleur);
        ligneTest.LigneAssociee[2] = p3;
        compteurPion = 3;
        panneauJeu.tableauPions.add(p3);
        panneauJeu.repaint();
    }
    
    public void nouveauTest4(String couleur) {
        Pion p4 = new Pion(couleur);
        ligneTest.LigneAssociee[3] = p4;
        compteurPion = 4;
        panneauJeu.tableauPions.add(p4);
        panneauJeu.repaint();
        initTest = false;
        boolean finTest = true;
        int tableau [] = new int[2];
        tableau = nbJuste();
        switch (nbEssais) {
            case 1:
                messageJuste1.setText(tableau[0]+"");
                messageJuste1.setVisible(true);
                messagePasJuste1.setText(tableau[1]+"");
                messagePasJuste1.setVisible(true);
                break;
            case 2:
                messageJuste2.setText(tableau[0]+"");
                messageJuste2.setVisible(true);
                messagePasJuste2.setText(tableau[1]+"");
                messagePasJuste2.setVisible(true);
                break;
            case 3:
                messageJuste3.setText(tableau[0]+"");
                messageJuste3.setVisible(true);
                messagePasJuste3.setText(tableau[1]+"");
                messagePasJuste3.setVisible(true);
                break;
            case 4:
                messageJuste4.setText(tableau[0]+"");
                messageJuste4.setVisible(true);
                messagePasJuste4.setText(tableau[1]+"");
                messagePasJuste4.setVisible(true);
                break;
            case 5:
                messageJuste5.setText(tableau[0]+"");
                messageJuste5.setVisible(true);
                messagePasJuste5.setText(tableau[1]+"");
                messagePasJuste5.setVisible(true);
                break;
            case 6:
                messageJuste6.setText(tableau[0]+"");
                messageJuste6.setVisible(true);
                messagePasJuste6.setText(tableau[1]+"");
                messagePasJuste6.setVisible(true);
                break;
            case 7:
                messageJuste7.setText(tableau[0]+"");
                messageJuste7.setVisible(true);
                messagePasJuste7.setText(tableau[1]+"");
                messagePasJuste7.setVisible(true);
                break;
            case 8:
                messageJuste8.setText(tableau[0]+"");
                messageJuste8.setVisible(true);
                messagePasJuste8.setText(tableau[1]+"");
                messagePasJuste8.setVisible(true);
                break;
            case 9:
                messageJuste9.setText(tableau[0]+"");
                messageJuste9.setVisible(true);
                messagePasJuste9.setText(tableau[1]+"");
                messagePasJuste9.setVisible(true);
                break;
            case 10:
                messageJuste10.setText(tableau[0]+"");
                messageJuste10.setVisible(true);
                messagePasJuste10.setText(tableau[1]+"");
                messagePasJuste10.setVisible(true);
                break;
            case 11:
                messageJuste11.setText(tableau[0]+"");
                messageJuste11.setVisible(true);
                messagePasJuste11.setText(tableau[1]+"");
                messagePasJuste11.setVisible(true);
                break;
        }
        nbEssais = nbEssais+1;
        viderLigne();
        
                
    }
    
    public void viderLigne() {
        
        for (int i=0; i<4; i++) {
            ligneTest.LigneAssociee[i] = null;
        }
        compteurPion = 0;
    }
    
    public void initialiserPartie() {
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
        initTest = false;
        nbEssais = 0;
        panneauJeu.ligneGag = ligneGagnante;
        panneauJeu.partie = true;
        panneauJeu.repaint();
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
    private JLabel messageJuste1;
    private JLabel messageJuste2;
    private JLabel messageJuste3;
    private JLabel messageJuste4;
    private JLabel messageJuste5;
    private JLabel messageJuste6;
    private JLabel messageJuste7;
    private JLabel messageJuste8;
    private JLabel messageJuste9;
    private JLabel messageJuste10;
    private JLabel messageJuste11;
    private JLabel messagePasJuste1;
    private JLabel messagePasJuste2;
    private JLabel messagePasJuste3;
    private JLabel messagePasJuste4;
    private JLabel messagePasJuste5;
    private JLabel messagePasJuste6;
    private JLabel messagePasJuste7;
    private JLabel messagePasJuste8;
    private JLabel messagePasJuste9;
    private JLabel messagePasJuste10;
    private JLabel messagePasJuste11;
    
    
    public static void main(String [] args) {
        JFrame frame = new fenetreDeJeu();
    }
}
