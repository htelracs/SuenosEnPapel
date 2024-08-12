/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGUI;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogAd extends javax.swing.JFrame {
    int xmouse, ymouse;
    public LogAd() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(imagencen, "C:\\Users\\Suco\\Pictures\\img\\biblio.jpg");
        setImagen(imgcorr, "C:\\Users\\Suco\\Pictures\\img\\corr.jpg");
        setImagen(imgusua, "C:\\Users\\Suco\\Pictures\\img\\usua.jpg");
        setImagen(imgcel, "C:\\Users\\Suco\\Pictures\\img\\cel.jpg");
        setImagen(imgpass, "C:\\Users\\Suco\\Pictures\\img\\cont.jpg");
        setImagen(imgjor, "C:\\Users\\Suco\\Pictures\\img\\jor.jpg");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprin = new javax.swing.JPanel();
        botonvolver = new javax.swing.JButton();
        imagencen = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        cuadrousua = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correo = new javax.swing.JLabel();
        cuadrocorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        cuadrocel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        conatraseña = new javax.swing.JLabel();
        cuadrocontra = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jornada = new javax.swing.JLabel();
        listajor = new javax.swing.JComboBox<>();
        imgusua = new javax.swing.JLabel();
        imgcorr = new javax.swing.JLabel();
        imgcel = new javax.swing.JLabel();
        imgpass = new javax.swing.JLabel();
        imgjor = new javax.swing.JLabel();
        botonguar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelprin.setBackground(new java.awt.Color(234, 217, 169));
        panelprin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelprinMouseDragged(evt);
            }
        });
        panelprin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelprinMousePressed(evt);
            }
        });
        panelprin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonvolver.setBackground(new java.awt.Color(153, 102, 0));
        botonvolver.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonvolver.setForeground(new java.awt.Color(255, 255, 255));
        botonvolver.setText("Volver");
        botonvolver.setBorder(null);
        botonvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonvolverActionPerformed(evt);
            }
        });
        panelprin.add(botonvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 140, 50));

        imagencen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblio.jpg"))); // NOI18N
        imagencen.setText("jLabel1");
        panelprin.add(imagencen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 578));

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REGISTRO");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 230, -1));

        texto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 102, 204));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("<html>Bienvenido Administrador Nuevo...<p> Por favor registrese<html>");
        panelprin.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 360, 100));

        usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario.setText("Usuario");
        panelprin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 80, 30));

        cuadrousua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrousua.setForeground(new java.awt.Color(204, 204, 204));
        cuadrousua.setText("Ingrese su usuario");
        cuadrousua.setBorder(null);
        cuadrousua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(cuadrousua, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelprin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 290, 10));

        correo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        correo.setText("Correo");
        panelprin.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 80, 30));

        cuadrocorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocorreo.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocorreo.setText("Ingrese su correo");
        cuadrocorreo.setBorder(null);
        cuadrocorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(cuadrocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelprin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 290, 10));

        telefono.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefono.setText("Teléfono");
        panelprin.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 80, 30));

        cuadrocel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocel.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocel.setText("Ingrese su número de teléfono");
        cuadrocel.setBorder(null);
        cuadrocel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(cuadrocel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 290, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelprin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 290, 10));

        conatraseña.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        conatraseña.setText("Password");
        panelprin.add(conatraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 80, 30));

        cuadrocontra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocontra.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocontra.setText("Password");
        cuadrocontra.setBorder(null);
        cuadrocontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(cuadrocontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 290, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        panelprin.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 290, 10));

        jornada.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jornada.setText("Jornada");
        panelprin.add(jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 80, 30));

        listajor.setBackground(new java.awt.Color(153, 204, 255));
        listajor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        listajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutina", "Vespertina", "Nocturna" }));
        listajor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(listajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 290, 30));

        imgusua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usua.jpg"))); // NOI18N
        imgusua.setText("jLabel4");
        imgusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(imgusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 70, 50));

        imgcorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/corr.jpg"))); // NOI18N
        imgcorr.setText("jLabel5");
        imgcorr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(imgcorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 70, 50));

        imgcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cel.jpg"))); // NOI18N
        imgcel.setText("jLabel6");
        imgcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(imgcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 70, 50));

        imgpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cont.jpg"))); // NOI18N
        imgpass.setText("jLabel7");
        imgpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(imgpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 70, 50));

        imgjor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jor.jpg"))); // NOI18N
        imgjor.setText("jLabel8");
        imgjor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelprin.add(imgjor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 70, 50));

        botonguar.setBackground(new java.awt.Color(153, 102, 0));
        botonguar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonguar.setForeground(new java.awt.Color(255, 255, 255));
        botonguar.setText("Guardar");
        botonguar.setBorder(null);
        botonguar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonguar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonguarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonguarMouseExited(evt);
            }
        });
        panelprin.add(botonguar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprin, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelprin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonguarMouseEntered
        panelprin.setBackground(new java.awt.Color(216, 248, 216));
    }//GEN-LAST:event_botonguarMouseEntered

    private void botonguarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonguarMouseExited
        panelprin.setBackground(new java.awt.Color(182, 232, 232));
    }//GEN-LAST:event_botonguarMouseExited

    private void panelprinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelprinMousePressed
        xmouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_panelprinMousePressed

    private void panelprinMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelprinMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_panelprinMouseDragged

    private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvolverActionPerformed
        this.setVisible(false);
        Login logg=new Login();
        logg.setVisible(true);
    }//GEN-LAST:event_botonvolverActionPerformed

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
            java.util.logging.Logger.getLogger(LogAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogAd().setVisible(true);
            }
        });
    }
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonguar;
    private javax.swing.JButton botonvolver;
    private javax.swing.JLabel conatraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField cuadrocel;
    private javax.swing.JPasswordField cuadrocontra;
    private javax.swing.JTextField cuadrocorreo;
    private javax.swing.JTextField cuadrousua;
    private javax.swing.JLabel imagencen;
    private javax.swing.JLabel imgcel;
    private javax.swing.JLabel imgcorr;
    private javax.swing.JLabel imgjor;
    private javax.swing.JLabel imgpass;
    private javax.swing.JLabel imgusua;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jornada;
    private javax.swing.JComboBox<String> listajor;
    private javax.swing.JPanel panelprin;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
