package herrera.org;


import java.awt.*; // Color, Graphics;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(100, 100, 400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true); 
        // Obtenemos el contexto gráfico del contentPane
        Graphics g = ventana.getContentPane().getGraphics();
        g.setColor(Color.red);                              
        g.fillRect(30, 30, 340, 220);      
        
     
        JFrame ventana2 = new JFrame();
        ventana2.setBounds(100, 100, 400, 300);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setVisible(true); 
        Graphics g2 = ventana.getContentPane().getGraphics();  
        try {                              
            Thread.sleep(500);             
            g2.setColor( new Color((int)(Math.random()*Math.pow(2,24))) );
            g2.fillRect(30, 30, 340, 220);  
        } catch (InterruptedException e) { 
            e.printStackTrace();           
        }                                   
        
        
        
    }
}