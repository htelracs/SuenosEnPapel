/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGUI;

import java.awt.Color;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class PrincipalBinv extends javax.swing.JFrame {
    int xmouse, ymouse;
    public PrincipalBinv() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(img4, "C:\\Users\\Suco\\Pictures\\img\\img4.jpg");
        time();
        date();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelSalida = new javax.swing.JPanel();
        salirProgra = new javax.swing.JLabel();
        textBiblio = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        textwelcom = new javax.swing.JLabel();
        botonIngreso = new javax.swing.JButton();
        img4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(207, 159, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirProgra.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        salirProgra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirProgra.setText("X");
        salirProgra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirProgra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirPrograMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirPrograMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirPrograMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirProgra, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addComponent(salirProgra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(panelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        textBiblio.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        textBiblio.setForeground(new java.awt.Color(255, 255, 255));
        textBiblio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBiblio.setText("Biblioteca");
        jPanel2.add(textBiblio, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 47, 291, 66));

        nombre.setFont(new java.awt.Font("Times New Roman", 3, 50)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("<html>Sueños<p> en <p>Papel<html>");
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 106, 263, 260));

        time.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("\"hh : mm : ss a\"");
        time.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 230, 60));

        fecha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("\"yyyy / MM / dd \"");
        fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        textwelcom.setBackground(new java.awt.Color(255, 255, 255));
        textwelcom.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        textwelcom.setForeground(new java.awt.Color(255, 255, 255));
        textwelcom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textwelcom.setText("Bienvenidos");
        jPanel1.add(textwelcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 380, 90));

        botonIngreso.setBackground(new java.awt.Color(204, 51, 0));
        botonIngreso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonIngreso.setForeground(new java.awt.Color(255, 255, 255));
        botonIngreso.setText("Ingresar");
        botonIngreso.setBorder(null);
        botonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIngresoMouseExited(evt);
            }
        });
        botonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 425, 180, 50));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img4.jpg"))); // NOI18N
        img4.setText("jLabel2");
        jPanel1.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirPrograMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPrograMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirPrograMouseClicked

    private void salirPrograMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPrograMouseEntered
        panelSalida.setBackground(Color.red);
        salirProgra.setForeground(Color.white);
    }//GEN-LAST:event_salirPrograMouseEntered

    private void salirPrograMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPrograMouseExited
        panelSalida.setBackground(Color.LIGHT_GRAY);
        salirProgra.setForeground(Color.black);
    }//GEN-LAST:event_salirPrograMouseExited

    private void botonIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresoMouseEntered
        botonIngreso.setBackground(new java.awt.Color(153, 102, 0));
        botonIngreso.setForeground(Color.white);
    }//GEN-LAST:event_botonIngresoMouseEntered

    private void botonIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresoMouseExited
        botonIngreso.setBackground(new java.awt.Color(204, 51, 0));
    }//GEN-LAST:event_botonIngresoMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void botonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoActionPerformed
        this.setVisible(false);
        Login log=new Login();
        log.setVisible(true);
    }//GEN-LAST:event_botonIngresoActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalBinv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalBinv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalBinv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalBinv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalBinv().setVisible(true);
            }
        });
    }
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }
    public void time(){
        DateTimeFormatter times=DateTimeFormatter.ofPattern("hh : mm : ss a");
        LocalDateTime now=LocalDateTime.now();
        time.setText(times.format(now));       
    }
    public void date(){
        DateTimeFormatter fechas=DateTimeFormatter.ofPattern("yyyy / MM / dd");
        LocalDateTime now=LocalDateTime.now();
        fecha.setText(fechas.format(now)); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngreso;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel img4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JLabel salirProgra;
    private javax.swing.JLabel textBiblio;
    private javax.swing.JLabel textwelcom;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
