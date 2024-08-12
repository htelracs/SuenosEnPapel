
package interfacesGUI;

import java.awt.BorderLayout;
import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.GUI.IngresoLibro;
import views.GUI.ListaLibros;
import views.GUI.Prestamos;
import views.GUI.Principal;
import views.GUI.RegistroUsua;
import views.GUI.RegresarLibro;
import views.GUI.Reports;
public class Dashboard extends javax.swing.JFrame {
    int xmouse, ymouse;
    public Dashboard() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setImagen(imglogo, "C:\\Users\\Suco\\Pictures\\img\\logo.jpg");
        setImagen(imgdev, "C:\\Users\\Suco\\Pictures\\img\\dev.jpg");
        setImagen(imghome, "C:\\Users\\Suco\\Pictures\\img\\home.jpg");
        setImagen(imgusua, "C:\\Users\\Suco\\Pictures\\img\\usua.jpg");
        setImagen(imgrepo, "C:\\Users\\Suco\\Pictures\\img\\fac.jpg");
        setImagen(imglib, "C:\\Users\\Suco\\Pictures\\img\\libro.jpg");
        setImagen(imgpres, "C:\\Users\\Suco\\Pictures\\img\\presta.jpg");
        dt();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcentral = new javax.swing.JPanel();
        ánelbarra = new javax.swing.JPanel();
        imglogo = new javax.swing.JLabel();
        botonhome = new javax.swing.JButton();
        boonprestamos = new javax.swing.JButton();
        botondev = new javax.swing.JButton();
        botonusua = new javax.swing.JButton();
        botonlib = new javax.swing.JButton();
        botonrep = new javax.swing.JButton();
        imghome = new javax.swing.JLabel();
        imgpres = new javax.swing.JLabel();
        imgdev = new javax.swing.JLabel();
        imgusua = new javax.swing.JLabel();
        imglib = new javax.swing.JLabel();
        imgrepo = new javax.swing.JLabel();
        panelhori = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panelcentro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelcentral.setBackground(new java.awt.Color(255, 255, 255));
        panelcentral.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelcentralMouseDragged(evt);
            }
        });
        panelcentral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelcentralMousePressed(evt);
            }
        });
        panelcentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ánelbarra.setBackground(new java.awt.Color(195, 132, 6));

        imglogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpg"))); // NOI18N
        imglogo.setText("jLabel1");

        botonhome.setBackground(new java.awt.Color(0, 204, 204));
        botonhome.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        botonhome.setForeground(new java.awt.Color(255, 255, 255));
        botonhome.setText("Home");
        botonhome.setBorder(null);
        botonhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhomeActionPerformed(evt);
            }
        });

        boonprestamos.setBackground(new java.awt.Color(0, 204, 204));
        boonprestamos.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        boonprestamos.setForeground(new java.awt.Color(255, 255, 255));
        boonprestamos.setText("Préstamos");
        boonprestamos.setBorder(null);
        boonprestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boonprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boonprestamosActionPerformed(evt);
            }
        });

        botondev.setBackground(new java.awt.Color(0, 204, 204));
        botondev.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        botondev.setForeground(new java.awt.Color(255, 255, 255));
        botondev.setText("Devoluciones");
        botondev.setBorder(null);
        botondev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botondev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondevActionPerformed(evt);
            }
        });

        botonusua.setBackground(new java.awt.Color(0, 204, 204));
        botonusua.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        botonusua.setForeground(new java.awt.Color(255, 255, 255));
        botonusua.setText("Usuarios");
        botonusua.setBorder(null);
        botonusua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonusua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonusuaActionPerformed(evt);
            }
        });

        botonlib.setBackground(new java.awt.Color(0, 204, 204));
        botonlib.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        botonlib.setForeground(new java.awt.Color(255, 255, 255));
        botonlib.setText("Libros");
        botonlib.setBorder(null);
        botonlib.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonlib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlibActionPerformed(evt);
            }
        });

        botonrep.setBackground(new java.awt.Color(0, 204, 204));
        botonrep.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        botonrep.setForeground(new java.awt.Color(255, 255, 255));
        botonrep.setText("Reportes");
        botonrep.setBorder(null);
        botonrep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrepActionPerformed(evt);
            }
        });

        imghome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.jpg"))); // NOI18N
        imghome.setText("jLabel4");

        imgpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/presta.jpg"))); // NOI18N

        imgdev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dev.jpg"))); // NOI18N

        imgusua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usua.jpg"))); // NOI18N

        imglib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/libro.jpg"))); // NOI18N

        imgrepo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fac.jpg"))); // NOI18N

        javax.swing.GroupLayout ánelbarraLayout = new javax.swing.GroupLayout(ánelbarra);
        ánelbarra.setLayout(ánelbarraLayout);
        ánelbarraLayout.setHorizontalGroup(
            ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ánelbarraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imglogo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ánelbarraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imglib, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgusua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgdev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgpres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imghome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgrepo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonrep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boonprestamos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botondev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(botonusua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonlib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ánelbarraLayout.setVerticalGroup(
            ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ánelbarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imglogo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonhome, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(imghome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boonprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(imgpres, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botondev, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(imgdev, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonusua, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(imgusua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonlib, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(imglib, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ánelbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonrep, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(imgrepo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        panelcentral.add(ánelbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 690));

        panelhori.setBackground(new java.awt.Color(201, 136, 5));

        texto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto.setText("Biblioteca/ Permisos/ Disponibilidad");

        fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fecha.setText("Hoy es (dayname) (day) de (month) de (year) ");

        javax.swing.GroupLayout panelhoriLayout = new javax.swing.GroupLayout(panelhori);
        panelhori.setLayout(panelhoriLayout);
        panelhoriLayout.setHorizontalGroup(
            panelhoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelhoriLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        panelhoriLayout.setVerticalGroup(
            panelhoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhoriLayout.createSequentialGroup()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        panelcentral.add(panelhori, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 59, 670, -1));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 204, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SUEÑOS EN PAPEL");
        panelcentral.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 370, 40));

        panelcentro.setBackground(new java.awt.Color(234, 217, 169));

        javax.swing.GroupLayout panelcentroLayout = new javax.swing.GroupLayout(panelcentro);
        panelcentro.setLayout(panelcentroLayout);
        panelcentroLayout.setHorizontalGroup(
            panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        panelcentroLayout.setVerticalGroup(
            panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        panelcentral.add(panelcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 670, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelcentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelcentral, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelcentralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcentralMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_panelcentralMousePressed

    private void panelcentralMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcentralMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this. setLocation(x- xmouse, y- ymouse);
    }//GEN-LAST:event_panelcentralMouseDragged

    private void botonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhomeActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_botonhomeActionPerformed

    private void boonprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boonprestamosActionPerformed
        ShowJPanel(new Prestamos());
    }//GEN-LAST:event_boonprestamosActionPerformed

    private void botondevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondevActionPerformed
        ShowJPanel(new RegresarLibro());
    }//GEN-LAST:event_botondevActionPerformed

    private void botonusuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonusuaActionPerformed
        ShowJPanel(new RegistroUsua());
    }//GEN-LAST:event_botonusuaActionPerformed

    private void botonlibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlibActionPerformed
        ShowJPanel(new ListaLibros());
    }//GEN-LAST:event_botonlibActionPerformed

    private void botonrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrepActionPerformed
        ShowJPanel(new Reports());
    }//GEN-LAST:event_botonrepActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    private void setImagen(JLabel img, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(icon);
        this.repaint();
    }
    public void dt(){
        LocalDate now= LocalDate.now();
        Locale spanishLocale= new Locale("es", "ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMM MM 'de' yyyy", spanishLocale)));
    }
    public static void ShowJPanel(JPanel pnl){
        pnl.setSize(670, 470);
        pnl.setLocation(0, 0);
        
        panelcentro.removeAll();
        panelcentro.add(pnl, BorderLayout.CENTER);
        panelcentro.revalidate();
        panelcentro.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boonprestamos;
    private javax.swing.JButton botondev;
    private javax.swing.JButton botonhome;
    private javax.swing.JButton botonlib;
    private javax.swing.JButton botonrep;
    private javax.swing.JButton botonusua;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel imgdev;
    private javax.swing.JLabel imghome;
    private javax.swing.JLabel imglib;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel imgpres;
    private javax.swing.JLabel imgrepo;
    private javax.swing.JLabel imgusua;
    private javax.swing.JPanel panelcentral;
    private static javax.swing.JPanel panelcentro;
    private javax.swing.JPanel panelhori;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel ánelbarra;
    // End of variables declaration//GEN-END:variables
}
