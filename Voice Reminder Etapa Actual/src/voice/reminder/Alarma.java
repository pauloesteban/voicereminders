package voice.reminder;

import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import java.util.*;

public class Alarma extends javax.swing.JFrame {

    public Alarma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Hora/Minutos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 152, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha: dd/mm/aaaa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 212, 150, -1));

        try {
            txtTiempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTiempoFocusLost(evt);
            }
        });
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 182, 60, -1));

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 242, 120, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 227, 100, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Retornar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 278, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion2.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 217, 60, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 217, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Ajustes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 278, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Ayuda");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 278, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 9, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar1.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar3.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 89, 99));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Guardar Datos");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 120, -1));

        txttitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttituloFocusLost(evt);
            }
        });
        txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloActionPerformed(evt);
            }
        });
        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 180, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Titulo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    int dia;
    int mes;
    int año;
    int hora;
    int minutos;
    
     public int obtenerInteger(String valor){
        int integer = Integer.parseInt(valor);
        return integer;
    }
    
    public Boolean ValidarCH(String Hora){
        boolean hoCor;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");
        if ((a[0]==' ')||(a[1]==' ')||(a[2]==' ')||(a[3]==' ')||(a[4]==' ')
             ||(obtenerInteger(c[0])>23)||(obtenerInteger(c[1])>59)){
           hoCor=false; 
        } else {
            hoCor=true; hora=obtenerInteger(c[0]); minutos=obtenerInteger(c[1]);
        } return hoCor;
    }
    
    public Boolean ValidarFC(String Fecha){
        boolean feCor;
        char[] a = Fecha.toString().toCharArray();
        String[] c = Fecha.split("-");
        if ((a[0]==' ')||(a[1]==' ')||(a[2]==' ')||(a[3]==' ')||(a[4]==' ')||(a[5]==' ')||(a[6]==' ')
                ||(a[7]==' ')||(a[8]==' ')||(obtenerInteger(c[0])>31)||(obtenerInteger(c[1])>12)
                ||(obtenerInteger(c[2])<2016)){
           feCor=false;
        } else {
            feCor=true; dia=obtenerInteger(c[0]); mes=obtenerInteger(c[1]);
            año=obtenerInteger(c[2]);
        } return feCor;
    }
    
    private void txtTiempoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTiempoFocusLost
        if (ValidarCH(txtTiempo.getText())==false){
            txtTiempo.setText("");
        } else{}
    }//GEN-LAST:event_txtTiempoFocusLost

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed

    }//GEN-LAST:event_txtTiempoActionPerformed

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        if (ValidarFC(txtFecha.getText())==false){
            txtTiempo.setText("");
        }
    }//GEN-LAST:event_txtFechaFocusLost

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ppagina1 obj=new Ppagina1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Popciones b=new Popciones();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        File carpeta = new File("src/Alarmas/"+año+","+mes+","+dia+"/"+hora+","+minutos);
        carpeta.mkdirs();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txttituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttituloFocusGained

    }//GEN-LAST:event_txttituloFocusGained

    private void txttituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttituloFocusLost

    }//GEN-LAST:event_txttituloFocusLost

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed

    }//GEN-LAST:event_txttituloActionPerformed

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        char c=evt.getKeyChar();
        if(txttitulo.getText().length()>20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttituloKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtTiempo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables

private void disipose() {
        throw new UnsupportedOperationException("No soportado");
    }

}