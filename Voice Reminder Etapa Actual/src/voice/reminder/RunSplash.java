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
        this.setSize(p.getWidth(), p.getHeight()); 
        this.setLocationRelativeTo(null);
        setVisible(true);
        p.velocidadDeCarga();
        this.dispose();
        ventana.setVisible(true);
    } 
     
    public static void main(String args[]) throws InterruptedException { 
        new RunSplash();       
    } 
}  