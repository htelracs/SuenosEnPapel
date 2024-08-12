
package views.GUI;

import implementacionesDAO.usuarioImpl;
import interfacesDAO.DAOusers;
import models.DAO.USsuarios;

public class Usuarios extends javax.swing.JPanel {

    public Usuarios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuario1 = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        usuario2 = new javax.swing.JLabel();
        correotxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        usuario3 = new javax.swing.JLabel();
        cedulatxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        codigotxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        usuario5 = new javax.swing.JLabel();
        celtx = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        conatraseña = new javax.swing.JLabel();
        contrasenatxt = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        facultad = new javax.swing.JLabel();
        txtfacu = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        facultad1 = new javax.swing.JLabel();
        facultad2 = new javax.swing.JLabel();
        multatxt = new javax.swing.JTextField();
        sanciontxt = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(234, 217, 169));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 153));
        title.setText("Registrar nuevo Usuario");

        usuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario.setText("Nombre");

        nombretxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(204, 204, 204));
        nombretxt.setBorder(null);
        nombretxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        usuario1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario1.setText("Usuario");

        usuariotxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(204, 204, 204));
        usuariotxt.setBorder(null);
        usuariotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        usuario2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario2.setText("Correo");

        correotxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correotxt.setForeground(new java.awt.Color(204, 204, 204));
        correotxt.setBorder(null);
        correotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        usuario3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario3.setText("Cédula");

        cedulatxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulatxt.setForeground(new java.awt.Color(204, 204, 204));
        cedulatxt.setBorder(null);
        cedulatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        usuario4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario4.setText("Código ");

        codigotxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigotxt.setForeground(new java.awt.Color(204, 204, 204));
        codigotxt.setBorder(null);
        codigotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        usuario5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usuario5.setText("Teléfono");

        celtx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        celtx.setForeground(new java.awt.Color(204, 204, 204));
        celtx.setBorder(null);
        celtx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        conatraseña.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        conatraseña.setText("Password");

        contrasenatxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contrasenatxt.setForeground(new java.awt.Color(204, 204, 204));
        contrasenatxt.setBorder(null);
        contrasenatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        facultad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        facultad.setText("Facultad");

        txtfacu.setBackground(new java.awt.Color(201, 227, 253));
        txtfacu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtfacu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración de empresas", "Cincia de datos e inteligencia artificial", "Economía", "Física", "Matemática", "Mecánica", "Química", "Computación", "Electricidad", "Geología", "Mecatrónica", "Sistema de información", "Telecomunicaciones", "Ambiental", "Civil", "Electrónica y automatización", "Petróleos", "Software", "Agua y saneamiento ambiental", "Redes y telecomunicaciones", "Electromecánica" }));
        txtfacu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        facultad1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        facultad1.setText("Sancion");

        facultad2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        facultad2.setText("Multa");
        facultad2.setToolTipText("");

        multatxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        multatxt.setForeground(new java.awt.Color(204, 204, 204));
        multatxt.setBorder(null);

        sanciontxt.setBackground(new java.awt.Color(204, 255, 255));
        sanciontxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sanciontxt.setText("si");
        sanciontxt.setBorder(null);
        sanciontxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conatraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfacu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celtx, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(facultad1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sanciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(conatraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtfacu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(celtx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(facultad1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sanciontxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        models.DAO.USsuarios usu= new models.DAO.USsuarios();
        String nombre = nombretxt.getText();
        String usuario = usuariotxt.getText();
        String correo = correotxt.getText();
        String contra = contrasenatxt.getText(); 
        int cedula = Integer.parseInt(cedulatxt.getText()); 
        int codigo = Integer.parseInt(codigotxt.getText()); 
        int telefono = Integer.parseInt(celtx.getText()); 
        boolean sancion = sanciontxt.isSelected();
        double dineroSancion = Double.parseDouble(multatxt.getText());
        USsuarios.Facultad facultadSeleccionada = USsuarios.Facultad.valueOf(txtfacu.getSelectedItem().toString());
  
      if (nombre.isEmpty() || usuario.isEmpty() || correo.isEmpty() || contra.isEmpty() ||
            cedulatxt.getText().isEmpty() || codigotxt.getText().isEmpty() || celtx.getText().isEmpty() || multatxt.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nombretxt.requestFocus();
            return;
        }
        USsuarios usu= new USsuarios();
        usu.setNombre(nombre);
        usu.setUsuario(usuario);
        usu.setCorreo(correo);
        usu.setCedula(cedula);
        usu.setContrasena(contra);
        usu.setCodigo(codigo);
        usu.setTelefono(telefono);
        usu.setFacultad(facultadSeleccionada);
        usu.setSancion(sancion);
        usu.setDineroSancion(dineroSancion);
        try {
            DAOusers dao= new usuarioImpl();
            dao.registrar(usu);
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombretxt.setText(nombre);
            usuariotxt.setText(usuario);
            correotxt.setText(correo);
            contrasenatxt.setText(contra); 
            cedulatxt.setText(String.valueOf(cedula));
            codigotxt.setText(String.valueOf(codigo)); 
            celtx.setText(String.valueOf(telefono)); 
            sanciontxt.setSelected(sancion);
            multatxt.setText(String.valueOf(dineroSancion));
            txtfacu.setSelectedItem(facultadSeleccionada.toString());
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un errror alregistrar el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulatxt;
    private javax.swing.JTextField celtx;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JLabel conatraseña;
    private javax.swing.JPasswordField contrasenatxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JLabel facultad;
    private javax.swing.JLabel facultad1;
    private javax.swing.JLabel facultad2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField multatxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JCheckBox sanciontxt;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> txtfacu;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
