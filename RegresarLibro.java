/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.GUI;

public class RegresarLibro extends javax.swing.JPanel {
    public RegresarLibro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        devolucion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        textusua = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        textusua1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(234, 217, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        devolucion.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        devolucion.setForeground(new java.awt.Color(0, 153, 153));
        devolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devolucion.setText("Devolución del libro");
        jPanel1.add(devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dev.jpg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 310, 270));

        usuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usuario.setText("Usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 30));

        textusua.setBackground(new java.awt.Color(0, 153, 153));
        textusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textusua.setForeground(new java.awt.Color(255, 255, 255));
        textusua.setText("Ingrese el usuario");
        textusua.setBorder(null);
        textusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 310, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 310, 10));

        usuario1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usuario1.setText("Libro ID");
        jPanel1.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, 30));

        textusua1.setBackground(new java.awt.Color(0, 153, 153));
        textusua1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textusua1.setForeground(new java.awt.Color(255, 255, 255));
        textusua1.setText("Ingrese el ID del libro");
        textusua1.setBorder(null);
        textusua1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(textusua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 310, 40));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 310, 10));

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolver");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 220, 60));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 70, 10, 400));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel devolucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField textusua;
    private javax.swing.JTextField textusua1;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
