package herrera.org;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("ventana swing");    // instancio
        ventana.setBounds(100, 100, 400, 300);           // posición y dimensiones
        ventana.setVisible(true);                        // la hago visible
        
        
        
        
        JFrame ventana2 = new JFrame("ventana2 swing");
        ventana2.setBounds(100, 100, 400, 300);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        ventana2.setVisible(true);
        
        
        JFrame ventana3 = new JFrame("ventana3 swing");
        ventana3.setBounds(100, 100, 400, 300);
        ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana3.getContentPane().setBackground(new Color(255, 180, 0)); 
        ventana3.setVisible(true);
        
        
        
        JFrame ventana4 = new JFrame("ventana swing");
        ventana4.setBounds(100, 100, 400, 300);
        ventana4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton boton = new JButton("Púlsame");
        ventana4.getContentPane().add(boton, "North");
        ventana4.getContentPane().add( new JLabel("Hola mundo!", JLabel.CENTER) );
        ventana4.setVisible(true);
        
        
        ventana.add(boton);
        ventana.add(new JLabel("hola mundo"));
    }
}