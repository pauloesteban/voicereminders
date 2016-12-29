package voice.reminder;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import javax.sound.sampled.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plista extends javax.swing.JFrame {

    public Plista() {
        initComponents();
        this.setLocationRelativeTo(null);
        LeerColor();
        ElegirColor();
        ActualizarLista();
        if (modelo.getSize()<=0) {
              btnEliminar.setEnabled(false);
              btnPlay.setEnabled(false);
              btnBorrar.setEnabled(false);
              btnAlarma.setEnabled(false);
            }
        else {
              btnEliminar.setEnabled(true);
              btnPlay.setEnabled(true);
              btnBorrar.setEnabled(true);
              btnAlarma.setEnabled(true);
              }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        ListaNotas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnAlarma = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 80, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion2.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 60, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 80, 80));

        btnPlay.setText("Reproducir Audio");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, -1));

        ListaNotas.setModel(modelo);
        ListaNotas.setToolTipText("Audios Almacenados");
        ListaNotas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaNotasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 210));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Retornar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Ajustes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Ayuda");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        btnBorrar.setText("Borrar Alarma");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, -1));

        btnAlarma.setText("Activar Alarma");
        btnAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 60, 40));

        jLabel4.setText("Cantidad de notas guardadas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, -1));

        jLabel5.setText("FECHA                 HORA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, -1));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DATOS DE AUDIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextArea1.setMaximumSize(new java.awt.Dimension(10, 30));
        jTextArea1.setMinimumSize(new java.awt.Dimension(10, 30));
        jScrollPane3.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleParent(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 250, 130));

        btnEliminar.setText("Eliminar Audio");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int color;
    
    public void LeerColor(){
        try{
        FileReader lectorArchivo; 
        File f = new File("src\\Alarmas\\Color.txt");
        lectorArchivo = new FileReader(f);
        BufferedReader br = new BufferedReader(lectorArchivo);
        color=Integer.parseInt(br.readLine());
        br.close();
        lectorArchivo.close();
        }catch(IOException e){
        System.out.println("Error:"+e.getMessage());}
    }
    
    public void ElegirColor(){
       if(color==1){
            this.getContentPane().setBackground(Color.BLUE);
        }else{
        if(color==2){
            this.getContentPane().setBackground(Color.YELLOW);
        }else
        if(color==3){
            this.getContentPane().setBackground(Color.ORANGE);
        }else{
        if(color==4){
            this.getContentPane().setBackground(Color.RED);
        }else{
        if(color==5){
            this.getContentPane().setBackground(Color.GREEN);
        }else{
        if(color==6){
            this.getContentPane().setBackground(Color.PINK);
        }else{
        if(color==7){
            this.getContentPane().setBackground(Color.MAGENTA);
        } else{
        if (color==8){
            this.getContentPane().setBackground(Color.GRAY);
        } else{
            this.getContentPane().setBackground(Color.CYAN);
        }}}}}}} 
    }
    
    public void ActualizarLista() {
        modelo.clear();
        String path = "src/Alarmas/"; 
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) 
        {
            if (listOfFiles[i].isFile()) 
            {
                files = listOfFiles[i].getName();
                if (files.endsWith(".wav"))
                {
                    StringTokenizer titulo = new StringTokenizer(files,"\\.wav");
                    if (titulo.hasMoreTokens()){
                        modelo.addElement(titulo.nextToken());
                        ListaNotas.setSelectedIndex(0);
                    }
                }
            }
        }
        txtTotal.setText(String.valueOf(modelo.getSize()));
    }
    
    public void VerDatos() {
        jTextArea1.setText("");
        String audioSelec;
        audioSelec=ListaNotas.getSelectedValue().toString();
        String sFichero = "src\\Alarmas\\"+audioSelec+".txt";
        File fichero = new File(sFichero);
        if (fichero.exists()){
            File datos = new File("src\\Alarmas\\"+audioSelec+".txt");
            try {
                BufferedReader leer = new BufferedReader(new FileReader(datos));
                String linea = leer.readLine();
                while (linea != null){
                    jTextArea1.append(linea+"\n");
                    linea = leer.readLine();
                }
                leer.close();
            } catch (Exception ex) {
                Logger.getLogger(Plista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            jTextArea1.append("No Hay Alarma Activa");}
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Ppagina1 obj =new Ppagina1();
    obj.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Popciones b=new Popciones();
         b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        String audio1;
              audio1=ListaNotas.getSelectedValue().toString();
              try {
                Clip sonido = AudioSystem.getClip();
                File nota1 = new File("src\\Alarmas\\"+audio1+".wav");
                sonido.open(AudioSystem.getAudioInputStream(nota1));
                sonido.start();
                do
                {
                    Thread.sleep(100);
                } while(sonido.isRunning());
                sonido.close();
                } catch (Exception tipoerror) {
                    System.out.println("" + tipoerror);} 
  
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String audioSelec;
        audioSelec=ListaNotas.getSelectedValue().toString();
        File alarma = new File("src\\Alarmas\\"+audioSelec+".txt");
        String sFichero = "src\\Alarmas\\"+audioSelec+".txt";
        File fichero = new File(sFichero);
        if (fichero.exists()){
            if (alarma.delete())
            VerDatos();
            else
            System.out.println("El fichero no puede ser borrado");            
        } else {
        JOptionPane.showMessageDialog(null, "El Audio Seleccionado no contiene una alarma definida", "Información!", JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmaActionPerformed
        String audioSelec;
        audioSelec=ListaNotas.getSelectedValue().toString();
        String sFichero = "src\\Alarmas\\"+audioSelec+".txt";
        File fichero = new File(sFichero);
        if (fichero.exists()){
            JOptionPane.showMessageDialog(null, "El Audio Seleccionado ya contiene una alarma definida", "Información!", JOptionPane.INFORMATION_MESSAGE);
        } else {
        PAlarma obj=new PAlarma();
        obj.AudioSelec=audioSelec;
        obj.setVisible(true);
        dispose();}
    }//GEN-LAST:event_btnAlarmaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            String audio;
            audio=ListaNotas.getSelectedValue().toString();
            File nota = new File("src\\Alarmas\\"+audio+".wav");
            File alarma = new File("src\\Alarmas\\"+audio+".txt");
            String sFichero = "src\\Alarmas\\"+audio+".txt";
            File fichero = new File(sFichero);
            if (fichero.exists()){
            if (nota.delete()&&alarma.delete()){
            ActualizarLista();
            if (modelo.getSize()<=0) {
                   btnEliminar.setEnabled(false);
                   btnPlay.setEnabled(false);
                   btnBorrar.setEnabled(false);
                   btnAlarma.setEnabled(false);
                   jTextArea1.setText("");
                } else{VerDatos();}}
            else
            System.out.println("El audio no puede ser borrado");}
            else {
                if (nota.delete()){
                    ActualizarLista();
                    if (modelo.getSize()<=0){
                        btnEliminar.setEnabled(false);
                        btnPlay.setEnabled(false);
                        btnBorrar.setEnabled(false);
                        btnAlarma.setEnabled(false);
                        jTextArea1.setText("");
                    } else {VerDatos();}
                }
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ListaNotasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaNotasValueChanged
        if (modelo.getSize()<=0) {} else{
            VerDatos();
        }
    }//GEN-LAST:event_ListaNotasValueChanged


    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaNotas;
    private DefaultListModel modelo;
    private javax.swing.JButton btnAlarma;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

    private void disipose() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
