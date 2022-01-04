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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shirl
 */
public class PolygonPanel extends JPanel {
    boolean pion1 = false;
    boolean pion2 = false;
    boolean pion3 = false;
    boolean pion4 = false;
    Color c1;
    Color c2;
    Color c3;
    Color c4;
    int nbEssais;
    
    public void dessinerPion(int nbEssais, Color couleur) {
        
    }
    
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
        if (pion1 == true) {
            switch (nbEssais) {
                case 1 :
                    g.setColor(c1);
                    Color C1 = c1;
                    g.fillOval(174, 160, 40, 40);
                    g.setColor(Color.BLACK);
                    g.drawOval(174,160,40,40);
                    break;
                case 2 :
                    g.fillOval(174, 160, 40, 40);
                    g.setColor(Color.BLACK);
                    g.drawOval(174,160,40,40);
                    Color C2 = c1;
                    g.setColor(c1);
                    g.fillOval(174,180,45,45);
                    g.setColor(Color.BLACK);
                    g.drawOval(174, 180, 45, 45);
                    break;
                
            }
            
        }
        if (pion2 == true) {
            switch (nbEssais) {
                case 1 :
                    g.setColor(c2);
                    Color C1 = c2;
                    g.fillOval(250,160,40,40);
                    g.setColor(Color.BLACK);
                    g.drawOval(250,160,40,40);
                    break;
            }
            
        }
        if (pion3 == true) {
            switch (nbEssais) {
                case 1 :
                    g.setColor(c3);
                    Color C1 = c3;
                    g.fillOval(330,160,40,40);
                    g.setColor(Color.BLACK);
                    g.drawOval(330,160,40,40);
                    break;
            }
        }
        if (pion4 == true) {
            switch (nbEssais) {
                case 1 :
                    g.setColor(c4);
                    Color C1 = c4;
                    g.fillOval(410, 160, 40, 40);
                    g.setColor(Color.BLACK);
                    g.drawOval(410, 160, 40, 40);
                    break;
                    
            }
        }
    }   
    }