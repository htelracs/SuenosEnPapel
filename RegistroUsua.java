
package views.GUI;

import implementacionesDAO.usuarioImpl;
import interfacesDAO.DAOusers;
import interfacesGUI.Dashboard;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.DAO.USsuarios;

public class RegistroUsua extends javax.swing.JPanel {
    public RegistroUsua() {
        initComponents();
        LoadUsers();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(234, 217, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 153));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Usuarios");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, -1));

        userSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userSearch.setForeground(new java.awt.Color(204, 204, 204));
        userSearch.setText("Ingrese el usuario a buscar");
        userSearch.setBorder(null);
        userSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(userSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 40));

        searchButton.setBackground(new java.awt.Color(0, 153, 153));
        searchButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 107, 40));

        jTable1.setBackground(new java.awt.Color(217, 236, 254));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "usuario", "nombre", "correo", "cédula", "código", "contraseña", "teléfono", "facultad", "sancion", "dinero de sancion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 640, 250));

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nuevo");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 130, 50));

        jButton2.setBackground(new java.awt.Color(153, 102, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 50));

        jButton3.setBackground(new java.awt.Color(153, 102, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Borrar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard.ShowJPanel(new Usuarios());
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void LoadUsers() {
        try {
            DAOusers dao= new usuarioImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar().forEach(u -> model.addRow(new Object[]{
                    u.getId(), 
                    u.getNombre(), 
                    u.getUsuario(), 
                    u.getCorreo(), 
                    u.getCedula(), 
                    u.getContrasena(), 
                    u.getCodigo(), 
                    u.getTelefono(), 
                    u.getFacultad(), 
                    u.getDineroSancion(), 
                    u.isSancion()
                }));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userSearch;
    // End of variables declaration//GEN-END:variables

}
