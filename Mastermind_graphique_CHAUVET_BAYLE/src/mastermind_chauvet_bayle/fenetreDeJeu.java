/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_chauvet_bayle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author shirl
 */
public class fenetreDeJeu extends JFrame{
    public fenetreDeJeu() {
        super("Mastermind");
        WindowListener test = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
        };
        addWindowListener(test);
        setSize(900,900);
        setVisible(true);
        add(new PolygonPanel());
        
    }
    
    public class PolygonPanel extends JPanel {
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
        
    }
}
    
    public static void main(String [] args) {
        JFrame frame = new fenetreDeJeu();
    }
}
