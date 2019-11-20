/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.graficos;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

/**
 *
 * @author Aluno
 */
public class BarraDeProgresso extends javax.swing.JFrame {

    /**
     * Creates new form BarraDeProgresso
     */
    public BarraDeProgresso() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setValue(0);
        
        
        this.addWindowListener(new WindowAdapter() {
	public void windowOpened(WindowEvent evt) {
		w.execute();
                
                
}
});
        
    }
final SwingWorker w = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                for (int i = 1; i <= 100; i++) {
                    try {
                        jProgressBar1.setValue(i);
                        jProgressBar1.setString(i + "%");
                        Thread.sleep(100);
                        
                        
                     
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                }
               setVisible(false);
               
                return 0;
                
            }
        };
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 182));
        setMinimumSize(new java.awt.Dimension(400, 182));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 182));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 133)));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 182));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 182));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 182));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 77, 133));
        jLabel1.setText("CARREGANDO...");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 40, 130, 30);

        jProgressBar1.setBackground(new java.awt.Color(255, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(0, 73, 137));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(80, 90, 241, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 182);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BarraDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarraDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarraDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarraDeProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarraDeProgresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
