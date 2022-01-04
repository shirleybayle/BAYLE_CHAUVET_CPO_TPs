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
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shirl
 */
public class PolygonPanel extends JPanel {
    ArrayList<Pion> tableauPions= new ArrayList<>();
    Ligne ligneGag = new Ligne();
    boolean partie = false;
    boolean gagnant = false;
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int [] xValues = {10,610,456,165};
        int [] yValues = {800,800,183,183};
        Polygon p = new Polygon(xValues, yValues, 4);
        g.setColor(Color.black);
        g.drawPolygon(p);
        g.setColor(new Color(179,139,109));
        g.fillPolygon(p);
        g.setColor(new Color(88,41,0));
        g.drawLine(158,211,460,211);
        g.drawLine(149,243,470,243);
        g.drawLine(140,278,480,278);
        g.drawLine(131,318,489, 318);
        g.drawLine(120,362,500,362);
        g.drawLine(107,412,513,412);
        g.drawLine(93,469,527,469);
        g.drawLine(77,534,544,534);
        g.drawLine(57,610,562,610);
        g.drawLine(35,700,585,700);
        g.drawLine(310,800,310,183); //milieu
        g.drawLine(160,800,237,183); //un quart
        g.drawLine(460,800,383,183); //trois quarts
        
        int coordX [] = {174,250,330,410, 165,245,330,415, 155,240,335,420, 150,235,335,425, 135,230,330,430, 120,225,335,435, 110,220,325,440, 105,215,335,445, 95,210,330,450, 80,205,325,460, 60,200,325,470};
        int coordY[] = {160,185,220,250,290,340,390,450,520,600,690};
        int taille = tableauPions.size();
        System.out.println(taille);
        int nbEssais = 0;
        for (int nbpion=0; nbpion<tableauPions.size(); nbpion++) {
            if (nbpion+1<=4) nbEssais =1;
            else if (nbpion+1<=8) nbEssais =2;
            else if (nbpion+1<=12) nbEssais = 3;
            else if (nbpion+1<=16) nbEssais = 4;
            else if (nbpion+1<=20) nbEssais =5;
            else if (nbpion+1<=24) nbEssais =6;
            else if (nbpion+1<=28) nbEssais = 7;
            else if (nbpion +1<=32) nbEssais = 8;
            else if (nbpion+1<=36) nbEssais =9;
            else if (nbpion+1<=40) nbEssais =10;
            else if (nbpion+1<=44) nbEssais =11;
            Pion UnPion = tableauPions.get(nbpion);
            paintPion(coordX[nbpion], coordY[nbEssais-1], UnPion, nbEssais, g);
        }
        if (gagnant) {
        Pion p1 = ligneGag.LigneAssociee[0];
        paintPionGag(120,90,p1,g);
        Pion p2 = ligneGag.LigneAssociee[1];
        paintPionGag(220,90,p2,g);
        Pion p3 = ligneGag.LigneAssociee[2];
        paintPionGag(320,90,p3,g);
        Pion p4 = ligneGag.LigneAssociee[3];
        paintPionGag(420,90,p4,g);}
        
    }   
    public void paintPion(int xCoord, int yCoord, Pion p, int nbEssais, Graphics g) {
        Color c = Color.black;
        switch (p.Couleur) {
            case "rouge":
                c = Color.red;
                break;
            case "jaune":
                c = new Color (255,228,54);
                break;
            case "vert":
                c = new Color(159,232,85);
                break;
            case "violet":
                c = new Color(128,0,128);
                break;
            case "blanc":
                c = Color.white;
                break;
            case "bleu":
                c = new Color(0,166,214);
                break;
            case "orange":
                c = new Color(255,127,0);
                break;
            case "rose":
                c = new Color(253,108,158);
                break;
            }
        g.setColor(c);
        g.fillOval(xCoord, yCoord, 35+5*nbEssais, 35+5*nbEssais);
        g.setColor(Color.BLACK);
        g.drawOval(xCoord, yCoord, 35+5*nbEssais, 35+5*nbEssais);
    }
    
    public void paintPionGag(int xCoord, int yCoord, Pion p, Graphics g) {
        Color c = Color.black;
        switch (p.Couleur) {
            case "rouge":
                c = Color.red;
                break;
            case "jaune":
                c = new Color (255,228,54);
                break;
            case "vert":
                c = new Color(159,232,85);
                break;
            case "violet":
                c = new Color(128,0,128);
                break;
            case "blanc":
                c = Color.white;
                break;
            case "bleu":
                c = new Color(0,166,214);
                break;
            case "orange":
                c = new Color(255,127,0);
                break;
            case "rose":
                c = new Color(253,108,158);
                break;
            }
        g.setColor(c);
        g.fillOval(xCoord, yCoord, 60, 60);
        g.setColor(Color.black);
        g.drawOval(xCoord, yCoord, 60, 60);
    }
}
