package modulo3.sesion11;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana {
    
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setVisible(true);
        miVentana.setSize(400, 300);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setTitle("Ventana 1");
        
        miVentana.setLayout(new FlowLayout());
        
        JButton boton1 = new JButton();
        boton1.setText("Salir");
        
        
        miVentana.add(boton1);
        
    }
    
}
