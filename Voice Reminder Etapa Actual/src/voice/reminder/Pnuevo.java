
package voice.reminder;

import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import java.util.*;
import java.awt.Color;

public class Pnuevo extends javax.swing.JFrame {
    public Pnuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnParar.setEnabled(false);
        LeerColor();
        ElegirColor();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 500));
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 100, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 120));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Retornar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Hrs   :   Min  :   Sg    : mSg");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 340, 220, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabar1.png"))); // NOI18N
        btnGrabar.setBorder(null);
        btnGrabar.setBorderPainted(false);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, 80));

        btnParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stop.png"))); // NOI18N
        btnParar.setBorder(null);
        btnParar.setBorderPainted(false);
        btnParar.setContentAreaFilled(false);
        btnParar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        getContentPane().add(btnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 110, 80));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Ayuda");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Grabar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("00:00:00:00");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 229, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Detener");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("DURACIÓN DE LA GRABACIÓN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String tiempo, fecha;
    int hora = 0, min = 0, seg = 0, ds = 0, color;
    public boolean issuspended = false;
    public boolean suspPausa = false;
    
    Thread hilo = new Thread() {

        @Override
        public void run() {
            try {
                while (true) {
                    if (ds == 99) {
                        ds = 0;
                        seg++;
                    }
                    if (seg == 59) {
                        seg = 0;
                        min++;
                    }
                    if (min == 59) {
                        min = 0;
                        hora++;
                    }
                    ds++;
                    lblTime.setText(hora + ":" + min + ":" + seg + ":" + ds);
                    hilo.sleep(9);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
    
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ppagina1 obj=new Ppagina1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    AudioFormat audioFormat;
    TargetDataLine targetDataLine;
    
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
      btnGrabar.setEnabled(false);
      btnParar.setEnabled(true);
      Calendar cal=Calendar.getInstance(); 
      if (cal.get(cal.DATE)>9&&cal.get(cal.MONTH)>8){fecha = cal.get(cal.DATE)+"-"+(cal.get(cal.MONTH)+1)+"-"+cal.get(cal.YEAR);}
      if (cal.get(cal.DATE)<9&&cal.get(cal.MONTH)>8){fecha = "0"+cal.get(cal.DATE)+"-"+(cal.get(cal.MONTH)+1)+"-"+cal.get(cal.YEAR);}
      if (cal.get(cal.DATE)>9&&cal.get(cal.MONTH)<8){fecha = cal.get(cal.DATE)+"-0"+(cal.get(cal.MONTH)+1)+"-"+cal.get(cal.YEAR);}
      int Hora, Minuto, Segundos;
      Hora = cal.get(cal.HOUR_OF_DAY);
      Minuto = cal.get(cal.MINUTE);
      Segundos = cal.get(cal.SECOND);
      if (Segundos>9&&Minuto>9&&Segundos>9){tiempo = cal.get(cal.HOUR_OF_DAY)+";"+cal.get(cal.MINUTE)+";"+cal.get(cal.SECOND);}
      if (Hora<9&&Minuto>9&&Segundos>9){tiempo = "0"+cal.get(cal.HOUR_OF_DAY)+";"+cal.get(cal.MINUTE)+";"+cal.get(cal.SECOND);}
      if (Hora>9&&Minuto<9&&Segundos>9){tiempo = cal.get(cal.HOUR_OF_DAY)+";0"+cal.get(cal.MINUTE)+";"+cal.get(cal.SECOND);} 
      if (Hora>9&&Minuto>9&&Segundos<9){tiempo = cal.get(cal.HOUR_OF_DAY)+";"+cal.get(cal.MINUTE)+";0"+cal.get(cal.SECOND);}
      if (Hora<9&&Minuto<9&&Segundos>9){tiempo = "0"+cal.get(cal.HOUR_OF_DAY)+";0"+cal.get(cal.MINUTE)+";"+cal.get(cal.SECOND);}
      if (Hora<9&&Minuto>9&&Segundos<9){tiempo = "0"+cal.get(cal.HOUR_OF_DAY)+";"+cal.get(cal.MINUTE)+";0"+cal.get(cal.SECOND);}
      if (Hora>9&&Minuto<9&&Segundos<9){tiempo = cal.get(cal.HOUR_OF_DAY)+";0"+cal.get(cal.MINUTE)+";0"+cal.get(cal.SECOND);}
      if (!issuspended) {
            hilo.start();
        } else {
            hilo.resume();
            issuspended = false;
        }
      try{
      audioFormat = getAudioFormat();
      DataLine.Info dataLineInfo =
      new DataLine.Info(
      TargetDataLine.class,
      audioFormat);
      targetDataLine = (TargetDataLine)
      AudioSystem.getLine(dataLineInfo);
      new CaptureThread().start();
    }catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }   
    }//GEN-LAST:event_btnGrabarActionPerformed

    
    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        btnParar.addActionListener(
        new ActionListener(){
        public void actionPerformed(
        ActionEvent e){
          targetDataLine.stop();
          targetDataLine.close();
          btnParar.setEnabled(false);
          btnGrabar.setEnabled(true);
          hilo.suspend();
          ds = seg = min = hora = 0;
          lblTime.setText("00:00:00:00");
          issuspended = true;
        }
      }  
    );
    }//GEN-LAST:event_btnPararActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed
     
   
  private AudioFormat getAudioFormat(){
    float sampleRate = 8000.0F;
    
    int sampleSizeInBits = 16;
    
    int channels = 1;
   
    boolean signed = true;
    
    boolean bigEndian = false;
        return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }

    void stopBtn(boolean b) {
        throw new UnsupportedOperationException("No soportado"); 
    }

    void captureBtn(boolean b) {
        throw new UnsupportedOperationException("No soportado"); 
    }
class CaptureThread extends Thread{
  public void run(){
    AudioFileFormat.Type fileType = null;
    File audioFile = null;
    fileType = AudioFileFormat.Type.WAVE;
    audioFile = new File("src/Alarmas/"+fecha+"            "+tiempo+".wav");
    while (audioFile.exists()){  
      audioFile= new File(String.format("\\src\\Alarmas\\"+fecha+"            "+tiempo+".wav"));
     }
    try{
      targetDataLine.open(audioFormat);
      targetDataLine.start();
      AudioSystem.write(
            new AudioInputStream(targetDataLine),
            fileType,
            audioFile);
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pnuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pnuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pnuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pnuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pnuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables

    private void disipose() {
        throw new UnsupportedOperationException("No soportado");
    }
}
