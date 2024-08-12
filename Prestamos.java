/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.GUI;
import javax.swing.JLabel;
public class Prestamos extends javax.swing.JPanel {
    public Prestamos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imgen = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        cuadrousuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        libro = new javax.swing.JLabel();
        cuadrolbro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        bootonprestamo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(234, 217, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 153, 153));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Nuevo Préstamo");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 570, 40));

        imgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pres.jpg"))); // NOI18N
        jPanel1.add(imgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 300, 260));

        usuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 30));

        cuadrousuario.setBackground(new java.awt.Color(0, 153, 153));
        cuadrousuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cuadrousuario.setForeground(new java.awt.Color(255, 255, 255));
        cuadrousuario.setText("Ingrese el folio de usuario");
        cuadrousuario.setBorder(null);
        cuadrousuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadrousuarioMousePressed(evt);
            }
        });
        jPanel1.add(cuadrousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 310, 40));

        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 310, 10));

        libro.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        libro.setText("Libro ID");
        jPanel1.add(libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 100, 30));

        cuadrolbro.setBackground(new java.awt.Color(0, 153, 153));
        cuadrolbro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cuadrolbro.setForeground(new java.awt.Color(255, 255, 255));
        cuadrolbro.setText("Ingrese el ID del Libro a prestar");
        cuadrolbro.setBorder(null);
        cuadrolbro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadrolbroMousePressed(evt);
            }
        });
        jPanel1.add(cuadrolbro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 310, 40));

        jSeparator3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 310, 10));

        bootonprestamo.setBackground(new java.awt.Color(153, 102, 0));
        bootonprestamo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bootonprestamo.setForeground(new java.awt.Color(255, 255, 255));
        bootonprestamo.setText("Préstamo");
        bootonprestamo.setBorder(null);
        bootonprestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(bootonprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 10, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cuadrousuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadrousuarioMousePressed
        if(cuadrousuario.getText().equals("Ingrese el folio del usuario"))
        cuadrousuario.setText("");
        if(cuadrolbro.getText().equals("") || cuadrolbro.getText() == null || cuadrolbro.getText().equals(" "))
        cuadrolbro.setText("Ingrese el ID del Libro a prestar");
    }//GEN-LAST:event_cuadrousuarioMousePressed

    private void cuadrolbroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadrolbroMousePressed
        if(cuadrolbro.getText().equals("Ingrese el ID del Libro a prestar"))
        cuadrolbro.setText("");
        if(cuadrousuario.getText().equals("") || cuadrousuario.getText() == null || cuadrousuario.getText().equals(" "))
        cuadrousuario.setText("Ingrese el folio del usuario");
    }//GEN-LAST:event_cuadrolbroMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bootonprestamo;
    private javax.swing.JTextField cuadrolbro;
    private javax.swing.JTextField cuadrousuario;
    private javax.swing.JLabel imgen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel libro;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
