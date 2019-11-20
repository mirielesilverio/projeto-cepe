
package view.professor;
import java.awt.Color;
import java.awt.Dimension;
import view.professor.nota.*;
import model.Professor;

public class Notas extends javax.swing.JFrame {

    private Espera espera;
    private MenuInsercao menuSalva;
    private InsercaoNotas inserirNotas;
    private InserirAvaliacao inserir;
    private MenuPrincipal menuPrincipal;
    private MenuCarregar menuCarregar;
    private ListaAv listaAv;
    private Professor professor;
    public Notas(Professor professor) {
        initComponents();
        this.professor = professor;
        this.setLocationRelativeTo(null);
        
        espera = new Espera();
        inserirNotas = new InsercaoNotas();
        menuSalva = new MenuInsercao(inserirNotas);
        menuCarregar = new MenuCarregar();
        listaAv = new ListaAv(professor,menuCarregar,inserirNotas,menuSalva);
        inserir = new InserirAvaliacao(espera,professor,listaAv,menuCarregar);    
        menuPrincipal = new MenuPrincipal(inserir,listaAv,espera,menuCarregar,menuSalva);

        
        getContentPane().add(menuCarregar);
        menuCarregar.setPreferredSize(new Dimension(290,730));
        menuCarregar.setBounds(0, 0, 290, 730);
        menuCarregar.setVisible(false);
        
        
        getContentPane().add(menuPrincipal);
        menuPrincipal.setPreferredSize(new Dimension(290,730));
        menuPrincipal.setBounds(0, 0, 290, 730);
        menuPrincipal.setVisible(true);
        
        getContentPane().add(espera);
        espera.setPreferredSize(new Dimension(888,730));
        espera.setBounds(290, 52, 888, 730);
        espera.setVisible(true);
        
        getContentPane().add(inserir);
        inserir.setPreferredSize(new Dimension(888,730));
        inserir.setBounds(0, 0, 290, 730);
        inserir.setVisible(false);
        
        getContentPane().add(menuSalva);
        menuSalva.setPreferredSize(new Dimension(290,730));
        menuSalva.setBounds(0, 0, 290, 730);
        menuSalva.setVisible(false);
        
        getContentPane().add(inserirNotas);
        inserirNotas.setPreferredSize(new Dimension(888,730));
        inserirNotas.setBounds(290, 52, 888, 730);
        inserirNotas.setVisible(false);
        
        getContentPane().add(listaAv);
        listaAv.setPreferredSize(new Dimension(888,730));
        listaAv.setBounds(290, 52, 888, 730);
        listaAv.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnJanela = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1178, 730));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jpnJanela.setBackground(new java.awt.Color(255, 255, 255));
        jpnJanela.setPreferredSize(new java.awt.Dimension(888, 55));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/minimize.png"))); // NOI18N
        jButton2.setToolTipText("Minimizar o programa");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnJanelaLayout = new javax.swing.GroupLayout(jpnJanela);
        jpnJanela.setLayout(jpnJanelaLayout);
        jpnJanelaLayout.setHorizontalGroup(
            jpnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnJanelaLayout.createSequentialGroup()
                .addContainerGap(834, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        jpnJanelaLayout.setVerticalGroup(
            jpnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnJanelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(jpnJanela);
        jpnJanela.setBounds(290, 0, 890, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back-left-arrow-square-button-outline_1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 33, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MenuProfessor menuProf = new MenuProfessor(professor);
        menuProf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Professor professor) {
                new Notas(professor).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jpnJanela;
    // End of variables declaration//GEN-END:variables
}
