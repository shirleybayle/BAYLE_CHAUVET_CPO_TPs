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
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int [] xValues = {10,610,456,165};
        int [] yValues = {800,800,183,183};
        Polygon p = new Polygon(xValues, yValues, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(p);
        //g.fillPolygon(p);
        g.setColor(Color.BLACK);
        g.drawLine(158,211,453,211);
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
        int coordX [] = {174,250,330,410, 170,245,335,415, 165,240,340,420, 160,235,345,425, 155,230,350,430, 150,225,355,435, 145,220,360,440, 140,215,365,445, 135,210,370,450, 130,205,375,455, 125,200,380,460};
        int coordY[] = {160,175,200,225,250,280,310,350,390,445,500};
        int taille = tableauPions.size();
        int nbEssais = 0;
        for (int nbpion=0; nbpion<tableauPions.size(); nbpion++) {
            for (int y=0; y<11; y++) {
                for (int x=0; x<11; x++) {
                    if (taille<=4) nbEssais =1;
                    else if (taille<=8) nbEssais =2;
                    else if (taille<=12) nbEssais = 3;
                    else if (taille<=16) nbEssais = 4;
                    else if (taille<=20) nbEssais =5;
                    else if (taille<=24) nbEssais =6;
                    else if (taille<=28) nbEssais = 7;
                    else if (taille <=32) nbEssais = 8;
                    else if (taille<=36) nbEssais =9;
                    else if (taille<=40) nbEssais =10;
                    else if (taille<=44) nbEssais =11;
                    Pion UnPion = tableauPions.get(nbpion);
                    paintPion(coordX[x], coordY[y], UnPion, nbEssais, g);
            }
            }
        }
        
    }   
    public void paintPion(int xCoord, int yCoord, Pion p, int nbEssais, Graphics g) {
        Color c = Color.black;
        switch (p.Couleur) {
            case "rouge":
                c = Color.red;
                break;
            case "jaune":
                c = Color.yellow;
                break;
            case "vert":
                c = Color.green;
                break;
            case "violet":
                c = Color.black;
                break;
            case "blanc":
                c = Color.white;
                break;
            case "bleu":
                c = Color.blue;
                break;
            case "orange":
                c = Color.orange;
                break;
            case "rose":
                c = Color.pink;
                break;
            }
        g.setColor(c);
        g.fillOval(xCoord, yCoord, 40+5*nbEssais, 40+5*nbEssais);
        g.setColor(Color.BLACK);
        g.drawOval(xCoord, yCoord, 40+5*nbEssais, 40+5*nbEssais);
    }
}
