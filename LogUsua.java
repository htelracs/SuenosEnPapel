/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LogUsua extends javax.swing.JFrame {
    int xmouse, ymouse;
    public LogUsua() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(img, "C:\\Users\\Suco\\Pictures\\img\\img2.jpg");
        setImagen(imgcorr, "C:\\Users\\Suco\\Pictures\\img\\corr.jpg");
        setImagen(imgusua, "C:\\Users\\Suco\\Pictures\\img\\usua.jpg");
        setImagen(imgcod, "C:\\Users\\Suco\\Pictures\\img\\codi.jpg");
        setImagen(imgcontra, "C:\\Users\\Suco\\Pictures\\img\\cont.jpg");
        setImagen(imgfac, "C:\\Users\\Suco\\Pictures\\img\\fac.jpg");
        setImagen(imgtel, "C:\\Users\\Suco\\Pictures\\img\\cel.jpg");
        setImagen(imgcedu, "C:\\Users\\Suco\\Pictures\\img\\ced.jpg");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        textregistro = new javax.swing.JLabel();
        botonvolver = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        cuadrousuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        correo = new javax.swing.JLabel();
        cuadrocorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        codunico = new javax.swing.JLabel();
        cuadrocod = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cedula = new javax.swing.JLabel();
        cuadrocedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        cuadrotel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        facultad = new javax.swing.JLabel();
        constrasenacuad = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        conatraseña = new javax.swing.JLabel();
        combofacu = new javax.swing.JComboBox<>();
        imgusua = new javax.swing.JLabel();
        imgcorr = new javax.swing.JLabel();
        imgcod = new javax.swing.JLabel();
        imgcedu = new javax.swing.JLabel();
        imgtel = new javax.swing.JLabel();
        imgcontra = new javax.swing.JLabel();
        imgfac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCentral.setBackground(new java.awt.Color(234, 217, 169));
        panelCentral.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelCentralMouseDragged(evt);
            }
        });
        panelCentral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCentralMousePressed(evt);
            }
        });
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textregistro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        textregistro.setForeground(new java.awt.Color(0, 0, 255));
        textregistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textregistro.setText("REGISTRO USUARIO¡");
        textregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(textregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 380, 40));

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
        panelCentral.add(botonvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 140, 50));

        botonguardar.setBackground(new java.awt.Color(153, 102, 0));
        botonguardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonguardar.setForeground(new java.awt.Color(255, 255, 255));
        botonguardar.setText("Guardar");
        botonguardar.setBorder(null);
        botonguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonguardarMouseExited(evt);
            }
        });
        panelCentral.add(botonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 140, 50));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img2.jpg"))); // NOI18N
        img.setText("jLabel1");
        panelCentral.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 470, 560));

        usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario.setText("Usuario");
        panelCentral.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 30));

        cuadrousuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrousuario.setForeground(new java.awt.Color(204, 204, 204));
        cuadrousuario.setText("Ingrese su usuario");
        cuadrousuario.setBorder(null);
        cuadrousuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(cuadrousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 290, 10));

        correo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        correo.setText("Correo");
        panelCentral.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, 30));

        cuadrocorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocorreo.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocorreo.setText("Ingrese su correo");
        cuadrocorreo.setBorder(null);
        cuadrocorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(cuadrocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 290, 10));

        codunico.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        codunico.setText("Código Único");
        panelCentral.add(codunico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 160, 30));

        cuadrocod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocod.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocod.setText("Ingrese su código");
        cuadrocod.setBorder(null);
        cuadrocod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(cuadrocod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 290, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 290, 10));

        cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cedula.setText("Cédula");
        panelCentral.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 80, 30));

        cuadrocedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocedula.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocedula.setText("Ingrese su número de cédula");
        cuadrocedula.setBorder(null);
        cuadrocedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(cuadrocedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 290, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 290, 10));

        telefono.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefono.setText("Teléfono");
        panelCentral.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 80, 30));

        cuadrotel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrotel.setForeground(new java.awt.Color(204, 204, 204));
        cuadrotel.setText("Ingrese su número");
        cuadrotel.setBorder(null);
        cuadrotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(cuadrotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 290, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 290, 10));

        facultad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        facultad.setText("Facultad");
        panelCentral.add(facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 80, 40));

        constrasenacuad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        constrasenacuad.setForeground(new java.awt.Color(204, 204, 204));
        constrasenacuad.setText("Password");
        constrasenacuad.setBorder(null);
        constrasenacuad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(constrasenacuad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        panelCentral.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 10));

        conatraseña.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        conatraseña.setText("Password");
        panelCentral.add(conatraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 80, 30));

        combofacu.setBackground(new java.awt.Color(153, 204, 255));
        combofacu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        combofacu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración de empresas", "Cincia de datos e inteligencia artificial", "Economía", "Física", "Matemática", "Mecánica", "Química", "Computación", "Electricidad", "Geología", "Mecatrónica", "Sistema de información", "Telecomunicaciones", "Ambiental", "Civil", "Electrónica y automatización", "Petróleos", "Software", "Agua y saneamiento ambiental", "Redes y telecomunicaciones", "Electromecánica" }));
        combofacu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(combofacu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 290, 40));

        imgusua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usua.jpg"))); // NOI18N
        imgusua.setText("jLabel2");
        imgusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 50));

        imgcorr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/corr.jpg"))); // NOI18N
        imgcorr.setText("jLabel3");
        imgcorr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgcorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 50, 50));

        imgcod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/codi.jpg"))); // NOI18N
        imgcod.setText("jLabel4");
        imgcod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 50, 50));

        imgcedu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ced.jpg"))); // NOI18N
        imgcedu.setText("jLabel5");
        imgcedu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgcedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 50, 50));

        imgtel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cel.jpg"))); // NOI18N
        imgtel.setText("jLabel6");
        imgtel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 50, 50));

        imgcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cont.jpg"))); // NOI18N
        imgcontra.setText("jLabel7");
        imgcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 50, 50));

        imgfac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fac.jpg"))); // NOI18N
        imgfac.setText("jLabel8");
        imgfac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCentral.add(imgfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCentralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCentralMousePressed
        xmouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_panelCentralMousePressed

    private void panelCentralMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCentralMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_panelCentralMouseDragged

    private void botonguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonguardarMouseEntered
        panelCentral.setBackground(new java.awt.Color(0, 204, 204));
    }//GEN-LAST:event_botonguardarMouseEntered

    private void botonguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonguardarMouseExited
        panelCentral.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botonguardarMouseExited

    private void botonvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonvolverActionPerformed
        this.setVisible(false);
        Login lod=new Login();
        lod.setVisible(true);
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
            java.util.logging.Logger.getLogger(LogUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogUsua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogUsua().setVisible(true);
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
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonvolver;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel codunico;
    private javax.swing.JComboBox<String> combofacu;
    private javax.swing.JLabel conatraseña;
    private javax.swing.JPasswordField constrasenacuad;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField cuadrocedula;
    private javax.swing.JTextField cuadrocod;
    private javax.swing.JTextField cuadrocorreo;
    private javax.swing.JTextField cuadrotel;
    private javax.swing.JTextField cuadrousuario;
    private javax.swing.JLabel facultad;
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgcedu;
    private javax.swing.JLabel imgcod;
    private javax.swing.JLabel imgcontra;
    private javax.swing.JLabel imgcorr;
    private javax.swing.JLabel imgfac;
    private javax.swing.JLabel imgtel;
    private javax.swing.JLabel imgusua;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel textregistro;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
