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
        setSize(600,700);
        setVisible(true);
        add(new PolygonPanel());
        
    }
    
    public class PolygonPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int [] xValues = {-5,5,10,-10};
        int [] yValues = {100,100,20,20};
        Polygon p = new Polygon(xValues, yValues, 4);
        g.drawPolygon(p);
        g.setColor(Color.BLUE);
        g.fillPolygon(p);
    }
}
    
    public static void main(String [] args) {
        JFrame frame = new fenetreDeJeu();
    }
}
