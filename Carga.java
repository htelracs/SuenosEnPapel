/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesGUI;
public class Carga extends javax.swing.JFrame {
    public Carga() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textlog = new javax.swing.JLabel();
        porcentaje = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        img1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textlog.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        textlog.setForeground(new java.awt.Color(255, 255, 255));
        textlog.setText("Loading...");
        textlog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(textlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 540, 30));

        porcentaje.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        porcentaje.setText("0 %");
        porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 130, 30));

        barra.setBackground(new java.awt.Color(204, 153, 0));
        barra.setForeground(new java.awt.Color(153, 0, 0));
        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 454, 900, 50));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img1.jpg"))); // NOI18N
        img1.setText("jLabel3");
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barra;
    private javax.swing.JLabel img1;
    public static javax.swing.JLabel porcentaje;
    public javax.swing.JLabel textlog;
    // End of variables declaration//GEN-END:variables
}
