package panels;

import javax.swing.*;
import java.awt.*;

public class LogIn{
    //private JPanel panelD=new JPanel();
    private JPanel panelI=new JPanel();
    private PanelMod panelD=new PanelMod();
    private JTextField user=new JTextField(10);
    private JLabel userLabel=new JLabel();
    private int usuario=0;

    public JPanel panelDerecho() {
        JLabel nombreTienda = new JLabel("GLITCH");
        panelD.setLayout(null);
        panelD.setLocation(0, 0);
        panelD.setSize(432, 480);
        panelD.setBackground(new Color(26, 76, 123));
        panelD.setVisible(true);
        nombreTienda.setFont(new Font("Montserrat SemiBold", Font.BOLD, 50));
        nombreTienda.setForeground(new Color(50, 50, 50));
        nombreTienda.setLocation(0, 0);
        nombreTienda.setHorizontalAlignment(SwingConstants.CENTER);
        nombreTienda.setSize(432, 116);
        panelD.add(nombreTienda);
        return panelD;
    }

    public JPanel panelIzquierdo(){
        //Construir el JPanel
        panelI.setLayout(null);
        panelI.setSize(288,480);
        panelI.setLocation(432, 0);
        panelI.setBackground(new Color(50, 50, 50));
        panelI.setVisible(true);

        //Label de usuario
        userLabel.setText("USUARIO:");
        userLabel.setVisible(true);
        userLabel.setForeground(Color.white);
        userLabel.setLocation(20,100);
        userLabel.setSize(120,40);
        userLabel.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));

        //Pedir usuario
        user.setVisible(true);//Visibilidad
        user.setLocation(130,108);//Ubicación
        user.setForeground(Color.black);//Color de la letra
        user.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));//Solo borde inferior
        user.setBackground(new Color(50, 50, 50));//Color de fondo
        user.setSize(118,30);//Tamaño
        user.setCaretColor(Color.black);//Color del cursos titilando, esto me costó mucho saberlo JAJAJJA
        user.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));//Fuente
        //Agregar los componentes
        panelI.add(userLabel);//Agregar el label que referecia al usuario
        panelI.add(user);//Agregar el campo de texto para ingresar el id de usuario
        return panelI;
    }
}