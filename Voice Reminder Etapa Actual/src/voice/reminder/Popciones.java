
package voice.reminder;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Popciones extends javax.swing.JFrame {

                String colorSelec;
                int color;

    public Popciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        LeerColor();
        ElegirColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Naranja", "Verde", "Celeste" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 110, 40));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 80, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Color de Aplicación:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Retornar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
          colorSelec=jComboBox1.getSelectedItem().toString();        
        if(colorSelec=="Azul"){
            this.getContentPane().setBackground(Color.BLUE);
            color=1;
        }else{
            if(colorSelec=="Amarillo"){
                this.getContentPane().setBackground(Color.YELLOW);
                color=2;
            }else
                if(colorSelec=="Naranja"){
                    this.getContentPane().setBackground(Color.ORANGE);
                    color=3;
                }else{
                    if(colorSelec=="Rojo"){
                        this.getContentPane().setBackground(Color.RED);
                        color=4;
                    }else{
                        if(colorSelec=="Verde"){
                            this.getContentPane().setBackground(Color.GREEN);
                            color=5;
                        }else{
                            if(colorSelec=="Rosa"){
                            this.getContentPane().setBackground(Color.PINK);
                            color=6;
                        }else{
                            if(colorSelec=="Magenta"){
                            this.getContentPane().setBackground(Color.MAGENTA);
                            color=7;
                        } else{
                                if (colorSelec=="Gris"){
                                    this.getContentPane().setBackground(Color.GRAY);
                                    color=8;
                                } else{
                            this.getContentPane().setBackground(Color.CYAN);
                                }
                                    }
                        }
                    }
                }
        }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Ppagina1 obj=new Ppagina1();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

        /*public void ElegirColor (){
        
        Ppagina1 formu1=new Ppagina1();
        Pnuevo formu2=new Pnuevo();
        Plista formu3=new Plista();
        Popciones formu4=new Popciones();
        String color;
        color=jComboBox1.getSelectedItem().toString();
        if(color=="Azul"){
            formu1.getContentPane().setBackground(Color.BLUE);
            formu2.getContentPane().setBackground(Color.BLUE);
            formu3.getContentPane().setBackground(Color.BLUE);
            formu4.getContentPane().setBackground(Color.BLUE);
        }else{
            if(color=="Amarillo"){
                formu1.getContentPane().setBackground(Color.yellow);
                formu2.getContentPane().setBackground(Color.YELLOW);
                formu3.getContentPane().setBackground(Color.BLUE);
                formu4.getContentPane().setBackground(Color.BLUE);
            }else
                if(color=="Naranja"){
                    formu1.getContentPane().setBackground(Color.ORANGE);
                    formu2.getContentPane().setBackground(Color.ORANGE);
                    formu3.getContentPane().setBackground(Color.BLUE);
                    formu4.getContentPane().setBackground(Color.BLUE);
                }else{
                    if(color=="Rojo"){
                        formu1.getContentPane().setBackground(Color.RED);
                        formu2.getContentPane().setBackground(Color.RED);
                        formu3.getContentPane().setBackground(Color.BLUE);
                        formu4.getContentPane().setBackground(Color.BLUE);
                    }else{
                        if(color=="Verde"){
                            formu1.getContentPane().setBackground(Color.GREEN);
                            formu2.getContentPane().setBackground(Color.GREEN);
                            formu3.getContentPane().setBackground(Color.BLUE);
                            formu4.getContentPane().setBackground(Color.BLUE);
                        }else{
                            formu1.getContentPane().setBackground(Color.cyan);
                            formu2.getContentPane().setBackground(Color.cyan);
                            formu3.getContentPane().setBackground(Color.BLUE);
                            formu4.getContentPane().setBackground(Color.BLUE);
                        }
                    }
                }
        }
    }*/
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        FileWriter lectorArchivo; 
        File f = new File("src\\Alarmas\\Color.txt");
        lectorArchivo = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(lectorArchivo);
        bw.append(""+color);
        bw.close();
        lectorArchivo.close();
        }catch(IOException e){
        System.out.println("Error:"+e.getMessage());}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Popciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Popciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Popciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Popciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Popciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
