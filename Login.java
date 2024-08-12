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
public class Login extends javax.swing.JFrame {
    int xmou, ymou;
    public Login() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(img3, "C:\\Users\\Suco\\Pictures\\img\\img3.jpg");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img3 = new javax.swing.JLabel();
        textlog = new javax.swing.JLabel();
        x = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        cuadronombre = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        textusuario = new javax.swing.JLabel();
        cuadrousua = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        textcorreo = new javax.swing.JLabel();
        cuadrocorreo = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        textcontra = new javax.swing.JLabel();
        cuadrocontra = new javax.swing.JPasswordField();
        separador4 = new javax.swing.JSeparator();
        perfil = new javax.swing.JLabel();
        listaUsuarios = new javax.swing.JComboBox<>();
        mostrarcontra = new javax.swing.JCheckBox();
        botoniniciar = new javax.swing.JButton();
        botonregistrrousua = new javax.swing.JButton();
        botonregistroadmin = new javax.swing.JButton();

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

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img3.jpg"))); // NOI18N
        img3.setText("jLabel2");

        textlog.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        textlog.setForeground(new java.awt.Color(204, 153, 0));
        textlog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textlog.setText("LOGIN");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout xLayout = new javax.swing.GroupLayout(x);
        x.setLayout(xLayout);
        xLayout.setHorizontalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        xLayout.setVerticalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombre.setText("Nombre");

        cuadronombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadronombre.setForeground(new java.awt.Color(204, 204, 204));
        cuadronombre.setText("Ingrese su nombre");
        cuadronombre.setBorder(null);
        cuadronombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        separador1.setForeground(new java.awt.Color(0, 0, 0));

        textusuario.setBackground(new java.awt.Color(255, 255, 255));
        textusuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textusuario.setText("Usuario");

        cuadrousua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrousua.setForeground(new java.awt.Color(204, 204, 204));
        cuadrousua.setText("Ingrese su usuario");
        cuadrousua.setBorder(null);
        cuadrousua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        separador2.setForeground(new java.awt.Color(0, 0, 0));

        textcorreo.setBackground(new java.awt.Color(255, 255, 255));
        textcorreo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textcorreo.setText("Correo");

        cuadrocorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocorreo.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocorreo.setText("Ingrese su correo");
        cuadrocorreo.setBorder(null);
        cuadrocorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        separador3.setForeground(new java.awt.Color(0, 0, 0));

        textcontra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textcontra.setText("Contraseña");

        cuadrocontra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuadrocontra.setForeground(new java.awt.Color(204, 204, 204));
        cuadrocontra.setText("Password");
        cuadrocontra.setBorder(null);
        cuadrocontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        separador4.setForeground(new java.awt.Color(0, 0, 0));

        perfil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        perfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        perfil.setText("Perfil");

        listaUsuarios.setBackground(new java.awt.Color(153, 204, 255));
        listaUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Administrador" }));
        listaUsuarios.setBorder(null);
        listaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaUsuariosMouseExited(evt);
            }
        });

        mostrarcontra.setBackground(new java.awt.Color(153, 204, 255));
        mostrarcontra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mostrarcontra.setText("Mostrar contraseña");
        mostrarcontra.setBorder(null);
        mostrarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botoniniciar.setBackground(new java.awt.Color(204, 153, 0));
        botoniniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botoniniciar.setForeground(new java.awt.Color(255, 255, 255));
        botoniniciar.setText("INICIAR SESIÓN");
        botoniniciar.setBorder(null);
        botoniniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoniniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoniniciarMouseExited(evt);
            }
        });
        botoniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarActionPerformed(evt);
            }
        });

        botonregistrrousua.setBackground(new java.awt.Color(204, 153, 0));
        botonregistrrousua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonregistrrousua.setForeground(new java.awt.Color(255, 255, 255));
        botonregistrrousua.setText("<html>Registro <P>Usuario<html>");
        botonregistrrousua.setBorder(null);
        botonregistrrousua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonregistrrousua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonregistrrousuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonregistrrousuaMouseExited(evt);
            }
        });
        botonregistrrousua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrrousuaActionPerformed(evt);
            }
        });

        botonregistroadmin.setBackground(new java.awt.Color(204, 153, 0));
        botonregistroadmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botonregistroadmin.setForeground(new java.awt.Color(255, 255, 255));
        botonregistroadmin.setText("<html>Registro <P>Administrador<html>");
        botonregistroadmin.setBorder(null);
        botonregistroadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonregistroadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonregistroadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonregistroadminMouseExited(evt);
            }
        });
        botonregistroadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(textlog, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(listaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cuadronombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cuadrocorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separador3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textcontra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cuadrocontra, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separador4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cuadrousua, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonregistrrousua, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(botonregistroadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(botoniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(textlog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuadronombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuadrousua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuadrocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuadrocontra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarcontra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonregistrrousua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonregistroadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosMouseEntered
        jPanel1.setBackground(new java.awt.Color(234, 215, 186));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_listaUsuariosMouseEntered

    private void listaUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosMouseExited
        jPanel1.setBackground(new java.awt.Color(216, 248, 216));
    }//GEN-LAST:event_listaUsuariosMouseExited

    private void botoniniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoniniciarMouseEntered
        jPanel1.setBackground(new java.awt.Color(181, 232, 232));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botoniniciarMouseEntered

    private void botoniniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoniniciarMouseExited
        jPanel1.setBackground(new java.awt.Color(213, 213, 155));
    }//GEN-LAST:event_botoniniciarMouseExited

    private void botonregistrrousuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrrousuaMouseEntered
        jPanel1.setBackground(new java.awt.Color(207, 159, 64));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botonregistrrousuaMouseEntered

    private void botonregistrrousuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistrrousuaMouseExited
        jPanel1.setBackground(new java.awt.Color(235, 194, 207));
    }//GEN-LAST:event_botonregistrrousuaMouseExited

    private void botonregistroadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroadminMouseEntered
        jPanel1.setBackground(new java.awt.Color(216, 248, 216));
        jPanel1.setForeground(Color.white);
    }//GEN-LAST:event_botonregistroadminMouseEntered

    private void botonregistroadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroadminMouseExited
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_botonregistroadminMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        x.setBackground(Color.red);
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        x.setBackground(Color.LIGHT_GRAY);
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmou= evt.getX();
        ymou= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmou, y- ymou);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void botonregistrrousuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrrousuaActionPerformed
        this.setVisible(false);
        LogUsua logus=new LogUsua();
        logus.setVisible(true);
    }//GEN-LAST:event_botonregistrrousuaActionPerformed

    private void botonregistroadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroadminActionPerformed
        this.setVisible(false);
        LogAd logad=new LogAd();
        logad.setVisible(true);
    }//GEN-LAST:event_botonregistroadminActionPerformed

    private void botoniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniniciarActionPerformed
        this.setVisible(false);
        Dashboard dash=new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_botoniniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
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
    private javax.swing.JButton botoniniciar;
    private javax.swing.JButton botonregistroadmin;
    private javax.swing.JButton botonregistrrousua;
    private javax.swing.JPasswordField cuadrocontra;
    private javax.swing.JTextField cuadrocorreo;
    private javax.swing.JTextField cuadronombre;
    private javax.swing.JTextField cuadrousua;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaUsuarios;
    private javax.swing.JCheckBox mostrarcontra;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel perfil;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JLabel textcontra;
    private javax.swing.JLabel textcorreo;
    private javax.swing.JLabel textlog;
    private javax.swing.JLabel textusuario;
    private javax.swing.JPanel x;
    // End of variables declaration//GEN-END:variables
}
