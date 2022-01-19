/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Faidur
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButtonFullScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        glassfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgresqlBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        glassfishLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        postgresqlLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penampil Gambar Full Screen");
        setUndecorated(true);

        glassfishBT.setText("Glashhfish");
        glassfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishBTActionPerformed(evt);
            }
        });
        buttonPanel.add(glassfishBT);

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });
        buttonPanel.add(javaeeBT);

        postgresqlBT.setText("PostgreSQL");
        postgresqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlBTActionPerformed(evt);
            }
        });
        buttonPanel.add(postgresqlBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        glassfishLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glassfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/glassfish.jpg"))); // NOI18N
        imagePanel.add(glassfishLB, "0");

        javaeeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/JavaEE.jpg"))); // NOI18N
        imagePanel.add(javaeeLB, "1");

        postgresqlLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgresqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/PostgreSQL.jpg"))); // NOI18N
        imagePanel.add(postgresqlLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);
        imagePanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void glassfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) imagePanel.getLayout();
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_glassfishBTActionPerformed

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) imagePanel.getLayout();
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void postgresqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) imagePanel.getLayout();
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_postgresqlBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
                GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton glassfishBT;
    private javax.swing.JLabel glassfishLB;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JButton postgresqlBT;
    private javax.swing.JLabel postgresqlLB;
    // End of variables declaration//GEN-END:variables
}
