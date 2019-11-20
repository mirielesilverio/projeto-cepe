/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.professor;

import control.connection.dataAccess.FuncoesAccess;
import control.connection.dataAccess.MateriasAccess;
import control.connection.dataAccess.ProfessorAccess;
import control.connection.dataAccess.UsuarioAccess;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Professor;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class CadastroEspecificoProfessor extends javax.swing.JFrame {
    static Usuario usuario;
    static Professor professor ;
    static MenuProfessor menu;
    
    public CadastroEspecificoProfessor(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuario = user;
        
        jcbMaterias.removeAllItems();
        MateriasAccess materiasAc = new MateriasAccess();
        for(String materia:materiasAc.lista())
        {
            jcbMaterias.addItem(materia);
        }   
        
        jcbFuncao.removeAllItems();
        FuncoesAccess funcoesAc = new FuncoesAccess();
        for(String funcao:funcoesAc.lista())
        {
            jcbFuncao.addItem(funcao);
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        btnClose1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbFuncao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 77, 133));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus.png"))); // NOI18N
        btnCadastrar.setText("  FINALIZAR CADASTRO");
        btnCadastrar.setActionCommand("btnCadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 77, 133), 1, true));
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(110, 310, 390, 60);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 133));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMAÇÕES ESPECÍFICAS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 540, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 133));
        jLabel4.setText("Matéria:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 180, 100, 19);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 77, 133));
        jLabel5.setText("Função:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 230, 90, 30);

        jcbMaterias.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jcbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matéria" }));
        jPanel1.add(jcbMaterias);
        jcbMaterias.setBounds(190, 180, 290, 30);

        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cross-square-button.png"))); // NOI18N
        btnClose1.setToolTipText("Fechar o programa");
        btnClose1.setBorder(null);
        btnClose1.setContentAreaFilled(false);
        btnClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose1);
        btnClose1.setBounds(560, 10, 33, 33);

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
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 10, 33, 33);

        jcbFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcbFuncao);
        jcbFuncao.setBounds(190, 230, 290, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus-blue.png")));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus.png")));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        professor = new Professor(usuario);
   
        professor.setMateria(jcbMaterias.getSelectedIndex()+1);
        professor.setFuncao(jcbFuncao.getSelectedIndex()+1);
        
        ProfessorAccess acesso = new ProfessorAccess();
        acesso.create(professor);
        
        this.dispose();
        menu = new MenuProfessor(professor);
        menu.setVisible(true);
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEspecificoProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEspecificoProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEspecificoProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEspecificoProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Usuario usuario) {
                new CadastroEspecificoProfessor(usuario).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnClose1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbFuncao;
    private javax.swing.JComboBox<String> jcbMaterias;
    // End of variables declaration//GEN-END:variables
}
