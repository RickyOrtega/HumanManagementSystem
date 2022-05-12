/*
*
* En este programa, voy a crear un sistema de gestión de Recursos Humanos.
*
*
* */

import panels.LogIn;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        LogIn logIn = new LogIn();
        Image icono = tk.getImage("src/resources/img/icono.png");

        JFrame mainF = new JFrame();
        mainF.setTitle("Humansys");
        mainF.setDefaultLookAndFeelDecorated(true);
        mainF.add(logIn.panelIzquierdo());
        mainF.add(logIn.panelDerecho());
        mainF.setLayout(null);
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.setVisible(true);
        mainF.setResizable(false);
        //Relación de aspecto del frame principal: 4:3
        mainF.setSize(720, 480);
        mainF.setLocationRelativeTo(null);

        mainF.setIconImage(icono);
    }
}