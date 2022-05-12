package panels;

import javax.swing.*;
import java.awt.*;

public class PanelMod extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        this.setLayout(null);
        this.setSize(432,480);
        this.setBackground(new Color(26, 76, 123));
        this.setVisible(true);
        g2.setColor(Color.white);
//Pinta el grueso del borde
        g2.setStroke(new BasicStroke(20));
//Para un mejor renderizado
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawOval(116,116,200,200);
//Para calcular el centro, es necesario dividir el tamaño del panel en dos y
//restarle el valor de la mitad del tamaño del circulo
        g2.fillArc(186,160,60,60,0,360);
        g2.fillArc(148,230,136,136,0,180);
        g2.fillRect(170,270,100,40);
    }
}
