
package voice.reminder;

import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import java.util.*;

public class PAlarma extends javax.swing.JFrame {
    public PAlarma() {
        initComponents();
        this.setLocationRelativeTo(null);
        LeerColor();
        ElegirColor();
    }
    
    int dia, mes, año, hora, minutos, color;
    String AudioSelec;
    
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
    
     public int obtenerInteger(String valor){
        int integer = Integer.parseInt(valor);
        return integer;
    }
    
    public Boolean ValidarCH(String Hora){
        boolean hoCor;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");
        if ((a[0]==' ')||(a[1]==' ')
             ||(obtenerInteger(c[0])>23)||(obtenerInteger(c[1])>59)){
           hoCor=false; 
        } else {
            hoCor=true; hora=obtenerInteger(c[0]); minutos=obtenerInteger(c[1]);
        } return hoCor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new org.netbeans.modules.form.InvalidComponent();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Hora/Minutos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha: dd/mm/aaaa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 160, -1));

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
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 60, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 120));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 100, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cancelar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Ayuda");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

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
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 89, 99));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Guardar Datos");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 120, -1));

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
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Titulo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, -1));

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

    private void txtTiempoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTiempoFocusLost
        
    }//GEN-LAST:event_txtTiempoFocusLost

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed

    }//GEN-LAST:event_txtTiempoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Plista obj=new Plista();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int year = jDateChooser1.getCalendar().get(Calendar.YEAR);
        int month = jDateChooser1.getCalendar().get(Calendar.MONTH);
        int day = jDateChooser1.getCalendar().get(Calendar.DATE);
        Calendar cal=Calendar.getInstance();
        int año = cal.get(cal.YEAR);
        int mes = cal.get(cal.MONTH);
        int dia = cal.get(cal.DATE);
        int hour = cal.get(cal.HOUR_OF_DAY);
        int minute = cal.get(cal.MINUTE);
        try{
            if (txttitulo.getText().equals("")||txtTiempo.getText().equals("") || txtTiempo.getText().equals("  :  "))
            {JOptionPane.showMessageDialog(null, "Campo Vacío", "Error!", JOptionPane.ERROR_MESSAGE);}else {
            if(Color.RED == jDateChooser1.getDateEditor().getUiComponent().getForeground()
                    ||(jDateChooser1.getDate() == null || year<año)){
            JOptionPane.showMessageDialog(null, "Fecha Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);
            }else{ if (year==año){ if (month==mes) { if (day==dia){
                if (ValidarCH(txtTiempo.getText())==false){
                   txtTiempo.setText("");
                   JOptionPane.showMessageDialog(null, "Hora Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);
                   } else{ if (hora>=hour){ if (minutos>minute){
                        String formato = jDateChooser1.getDateFormatString();
                        Date date = jDateChooser1.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        try{
                            FileWriter lectorArchivo; 
                            File f = new File("src\\Alarmas\\"+AudioSelec+".txt");
                            lectorArchivo = new FileWriter(f);
                            BufferedWriter bw = new BufferedWriter(lectorArchivo);
                            bw.append("Alarma Activada"+"\r\n"+"Título: "+txttitulo.getText()+"\r\n"+"Hora:   "+hora+":"+minutos+"\r\n"+"Fecha:  "+String.valueOf(sdf.format(date)));
                            bw.close();
                            lectorArchivo.close();
                        }catch(IOException e){System.out.println("Error:"+e.getMessage());}
                        Plista obj=new Plista();
                        obj.setVisible(true);
                        dispose();}
                   else {JOptionPane.showMessageDialog(null, "Hora Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);} }
                   else {JOptionPane.showMessageDialog(null, "Hora Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}
                }
            } else {if (day>dia){if (ValidarCH(txtTiempo.getText())==false){txtTiempo.setText("");
                   JOptionPane.showMessageDialog(null, "Hora Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}
            else{
                String formato = jDateChooser1.getDateFormatString();
                        Date date = jDateChooser1.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        try{
                            FileWriter lectorArchivo; 
                            File f = new File("src\\Alarmas\\"+AudioSelec+".txt");
                            lectorArchivo = new FileWriter(f);
                            BufferedWriter bw = new BufferedWriter(lectorArchivo);
                            bw.append("Alarma Activada"+"\r\n"+"Título: "+txttitulo.getText()+"\r\n"+"Hora:   "+hora+":"+minutos+"\r\n"+"Fecha:  "+String.valueOf(sdf.format(date)));
                            bw.close();
                            lectorArchivo.close();
                        }catch(IOException e){System.out.println("Error:"+e.getMessage());}
                        Plista obj=new Plista();
                        obj.setVisible(true);
                        dispose();
            }
            }else{JOptionPane.showMessageDialog(null, "Fecha Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}}
            } else { if (month>mes){if (ValidarCH(txtTiempo.getText())==false){txtTiempo.setText("");
                JOptionPane.showMessageDialog(null, "Fecha Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}
            else{
               String formato = jDateChooser1.getDateFormatString();
                        Date date = jDateChooser1.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        try{
                            FileWriter lectorArchivo; 
                            File f = new File("src\\Alarmas\\"+AudioSelec+".txt");
                            lectorArchivo = new FileWriter(f);
                            BufferedWriter bw = new BufferedWriter(lectorArchivo);
                            bw.append("Alarma Activada"+"\r\n"+"Título: "+txttitulo.getText()+"\r\n"+"Hora:   "+hora+":"+minutos+"\r\n"+"Fecha:  "+String.valueOf(sdf.format(date)));
                            bw.close();
                            lectorArchivo.close();
                        }catch(IOException e){System.out.println("Error:"+e.getMessage());}
                        Plista obj=new Plista();
                        obj.setVisible(true);
                        dispose(); }}
            else{JOptionPane.showMessageDialog(null, "Fecha Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}}
            } else { if (year>año){if (ValidarCH(txtTiempo.getText())==false){txtTiempo.setText("");
                JOptionPane.showMessageDialog(null, "Fecha Ingresada Incorrecta", "Error!", JOptionPane.ERROR_MESSAGE);}
            else{
                String formato = jDateChooser1.getDateFormatString();
                        Date date = jDateChooser1.getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat(formato);
                        try{
                            FileWriter lectorArchivo; 
                            File f = new File("src\\Alarmas\\"+AudioSelec+".txt");
                            lectorArchivo = new FileWriter(f);
                            BufferedWriter bw = new BufferedWriter(lectorArchivo);
                            bw.append("Alarma Activada"+"\r\n"+"Título: "+txttitulo.getText()+"\r\n"+"Hora:   "+hora+":"+minutos+"\r\n"+"Fecha:  "+String.valueOf(sdf.format(date)));
                            bw.close();
                            lectorArchivo.close();
                        }catch(IOException e){System.out.println("Error:"+e.getMessage());}
                        Plista obj=new Plista();
                        obj.setVisible(true);
                        dispose();
            }}}}}}catch(UnsupportedOperationException uop){
             System.out.println(uop.getMessage());
         }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txttituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttituloFocusGained

    }//GEN-LAST:event_txttituloFocusGained

    private void txttituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttituloFocusLost

    }//GEN-LAST:event_txttituloFocusLost

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed

    }//GEN-LAST:event_txttituloActionPerformed

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        if(txttitulo.getText().length()>14) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttituloKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAlarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAlarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private org.netbeans.modules.form.InvalidComponent jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtTiempo;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
