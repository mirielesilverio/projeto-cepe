/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Aluno
 */
public class Inicicializador extends javax.swing.JFrame {

    final JProgressBar pr = new JProgressBar();
    final Login login = new Login();
    public Inicicializador() {
        initComponents();
        this.setLocationRelativeTo(null);
        pr.setStringPainted(true);
        pr.setValue(0);
        pr.setSize(new Dimension(300, 30));
        pr.setLocation(310, 370);
        jLabel1.add(pr);
        jPanel1.add(jLabel1);
        this.add(jPanel1);
        
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
                        pr.setValue(i);
                        pr.setString(i + "%");
                        Thread.sleep(100);
                        if(i==60){
                            jLabel3.setText("INICIALIZANDO...");
                        }
                        else if(i==93)
                            jLabel3.setText("BEM VINDO");
                     
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                }
               setVisible(false);
               login.setVisible(true);
                return 0;
                
            }
        };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 450));
        setMinimumSize(new java.awt.Dimension(900, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 450));
        setSize(new java.awt.Dimension(900, 450));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 450));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARREGANDO...");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 340, 190, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/LOGO B.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 50, 770, 261);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 450));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 450);

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
            java.util.logging.Logger.getLogger(Inicicializador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicicializador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicicializador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicicializador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicicializador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
