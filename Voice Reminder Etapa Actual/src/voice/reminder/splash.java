
package voice.reminder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class splash extends javax.swing.JPanel {
    ImageIcon imagen;
    BorderLayout esquema;
  
    public splash() {
        initComponents();
        estados.setForeground(Color.red);        
        imagen = new ImageIcon(getClass().getResource("/imagenes/caratula.png")); 
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight()); 
        
    }
    
    @Override
    public void paintComponent(Graphics g){ 
        super.paintComponent(g); 
        g.drawImage(imagen.getImage(), 0, 0, imagen.getIconWidth(), imagen.getIconHeight(), this); 
        this.setOpaque(false); 
    } 

    public void velocidadDeCarga() throws InterruptedException{ 
        for(int i = 0; i<=100; i++){ 
            Thread.sleep(40); 
            progreso.setForeground(Color.RED); 
            progreso.setValue(i); 
            if (i == 30) {
               estados.setText("ESTADO BETA");
            }
            if (i == 60) {
               estados.setText("DISFRUTE");
            }
        } 
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        estados = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.setBackground(new java.awt.Color(255, 128, 0));
        progreso.setForeground(new java.awt.Color(255, 204, 0));
        progreso.setBorderPainted(false);
        add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 374, 610, 30));

        estados.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        estados.setText("CARGANDO MÓDULOS");
        add(estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 30));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estados;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
