package voice.reminder;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import javax.swing.UIManager;

public class RunSplash extends JWindow{ 

    splash p; 
    public RunSplash() throws InterruptedException{ 
        p = new splash(); 
        Ppagina1 ventana = new Ppagina1();       
        ventana.setLocationRelativeTo(null);
        this.add(p, BorderLayout.CENTER); 
        this.setSize(p.getWidth(), p.getHeight());// se establece el tamaño del RunSplash 
        // ahora y lo mas importante se quita toda()+75 la decoracion de la ventana  
        //marco, botones minimizar, cerrar con el metodo setUndecorated(true) 
        //para dar el efecto de que solo se muestra la imagen con la barra... 
        this.setLocationRelativeTo(null);// se muestra el splash en el centro 
        setVisible(true); // se visualiza el Splash Screen 
        p.velocidadDeCarga();
        this.dispose();// se cierra el Splash cuando termina el recorrido de la barra
        ventana.setVisible(true);
    } 
     
    public static void main(String args[]) throws InterruptedException { 
        new RunSplash(); // se invoca a la ventana RunSplash         
    } 
}  