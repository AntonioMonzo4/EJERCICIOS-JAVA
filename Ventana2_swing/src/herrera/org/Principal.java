package herrera.org;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*; // JButton, JFrame

public class Principal {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("ventana swing");
      ventana.setBounds(100, 100, 400, 300);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ventana.add(new JButton("norte"), BorderLayout.NORTH);
      ventana.add(new JButton("sur"),  BorderLayout.SOUTH);
      ventana.add(new JButton("este"), BorderLayout.EAST);
      ventana.add(new JButton("oeste"), BorderLayout.WEST);
      JButton botonCentral = new JButton("centro");
      botonCentral.setBackground(new Color(0xFFFF99));
      botonCentral.setForeground(new Color(0xFF0000));
      ventana.add(botonCentral, BorderLayout.CENTER);

      ventana.setVisible(true);
      
      
      
      
      
      
      
      


      JFrame ventana2 = new JFrame("ventana swing");
      ventana2.setBounds(100, 100, 460, 220);
      ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ventana2.setLayout(null);   // quito el layout

      JToggleButton btnNorte = new JToggleButton("Norte");
      btnNorte.setBounds(180, 30, 100, 30);
      ventana2.add(btnNorte);

      JToggleButton btnSur = new JToggleButton("Sur");
      btnSur.setBounds(180, 120, 100, 30);
      ventana2.add(btnSur);

      JToggleButton btnEste = new JToggleButton("Este");
      btnEste.setBounds(350, 75, 100, 30);
      btnEste.setEnabled(false); // lo deshabilito
      ventana2.add(btnEste);

      JToggleButton btnOeste = new JToggleButton("Oeste");
      btnOeste.setBounds(10, 75, 100, 30);
      ventana2.add(btnOeste);

      JLabel etiqueta = new JLabel("Hola mundo!", JLabel.CENTER);
      etiqueta.setBounds(115, 65, 230, 50);
      etiqueta.setOpaque(true); // necesario para el background-color en JLabel
      etiqueta.setBackground(Color.black);
      etiqueta.setForeground(Color.green);
      etiqueta.setFont(new Font("monospaced", Font.BOLD, 21));
      ventana2.add(etiqueta);

      ventana2.setResizable(false); // impido que cambie de tamaño
      ventana2.setVisible(true);
   }
}