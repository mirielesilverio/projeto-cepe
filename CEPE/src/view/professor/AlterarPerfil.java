/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.professor;

import javax.swing.JFrame;

/**
 *
 * @author Aluno
 */
public class AlterarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form AlterarPerfil
     */
    public AlterarPerfil() {
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

        pnPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblCidade = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        pnBarraClose = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1178, 730));
        getContentPane().setLayout(null);

        pnPerfil.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user-previa.png"))); // NOI18N
        pnPerfil.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 160);

        getContentPane().add(pnPerfil);
        pnPerfil.setBounds(70, 110, 160, 160);

        pnDados.setBackground(new java.awt.Color(255, 255, 255));
        pnDados.setLayout(null);

        lblCidade.setBackground(new java.awt.Color(27, 144, 240));
        lblCidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(0, 77, 133));
        lblCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblCidade.setText("Cidade");
        pnDados.add(lblCidade);
        lblCidade.setBounds(580, 190, 290, 30);

        lblBairro.setBackground(new java.awt.Color(27, 144, 240));
        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(0, 77, 133));
        lblBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblBairro.setText("Bairro");
        pnDados.add(lblBairro);
        lblBairro.setBounds(580, 360, 90, 30);

        lblDataNasc.setBackground(new java.awt.Color(27, 144, 240));
        lblDataNasc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataNasc.setForeground(new java.awt.Color(0, 77, 133));
        lblDataNasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/calendar.png"))); // NOI18N
        lblDataNasc.setText("Data de Nascimento");
        pnDados.add(lblDataNasc);
        lblDataNasc.setBounds(290, 100, 290, 30);

        lblTelefone.setBackground(new java.awt.Color(27, 144, 240));
        lblTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 77, 133));
        lblTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/phone-call.png"))); // NOI18N
        lblTelefone.setText("Telefone");
        pnDados.add(lblTelefone);
        lblTelefone.setBounds(290, 440, 240, 30);

        lblGenero.setBackground(new java.awt.Color(27, 144, 240));
        lblGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 77, 133));
        lblGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/gender.png"))); // NOI18N
        lblGenero.setText("Gênero");
        pnDados.add(lblGenero);
        lblGenero.setBounds(290, 190, 290, 30);

        lblRG.setBackground(new java.awt.Color(27, 144, 240));
        lblRG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 77, 133));
        lblRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblRG.setText("RG");
        pnDados.add(lblRG);
        lblRG.setBounds(290, 360, 290, 30);

        lblCPF.setBackground(new java.awt.Color(27, 144, 240));
        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 77, 133));
        lblCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblCPF.setText("CPF");
        pnDados.add(lblCPF);
        lblCPF.setBounds(290, 270, 290, 30);

        lblEstado.setBackground(new java.awt.Color(27, 144, 240));
        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 77, 133));
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblEstado.setText("Estado");
        pnDados.add(lblEstado);
        lblEstado.setBounds(580, 100, 290, 30);

        lblRua.setBackground(new java.awt.Color(27, 144, 240));
        lblRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(0, 77, 133));
        lblRua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblRua.setText("Rua");
        pnDados.add(lblRua);
        lblRua.setBounds(580, 270, 290, 30);

        lblNumero.setBackground(new java.awt.Color(27, 144, 240));
        lblNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 77, 133));
        lblNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblNumero.setText("Número");
        pnDados.add(lblNumero);
        lblNumero.setBounds(580, 440, 90, 30);

        lblEmail.setBackground(new java.awt.Color(27, 144, 240));
        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 77, 133));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/mail.png"))); // NOI18N
        lblEmail.setText("Email");
        pnDados.add(lblEmail);
        lblEmail.setBounds(900, 100, 250, 30);

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField1);
        jTextField1.setBounds(580, 480, 270, 30);

        jTextField2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField2);
        jTextField2.setBounds(290, 30, 630, 50);

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField3);
        jTextField3.setBounds(290, 230, 270, 30);

        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        pnDados.add(jTextField4);
        jTextField4.setBounds(290, 310, 270, 30);

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField5);
        jTextField5.setBounds(290, 400, 270, 30);

        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField6);
        jTextField6.setBounds(290, 480, 270, 30);

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField7);
        jTextField7.setBounds(890, 140, 270, 30);

        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField8);
        jTextField8.setBounds(580, 230, 270, 30);

        jTextField9.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField9);
        jTextField9.setBounds(580, 310, 270, 30);

        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField10);
        jTextField10.setBounds(580, 400, 270, 30);

        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField11);
        jTextField11.setBounds(580, 140, 270, 30);

        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(153, 153, 153));
        pnDados.add(jTextField12);
        jTextField12.setBounds(290, 140, 270, 30);

        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 77, 133));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus.png"))); // NOI18N
        btnCadastrar.setText("SALVAR ALTERAÇÕES");
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
        pnDados.add(btnCadastrar);
        btnCadastrar.setBounds(910, 450, 240, 60);

        getContentPane().add(pnDados);
        pnDados.setBounds(0, 180, 1180, 550);

        pnBarraClose.setLayout(null);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cross-square-button-white.png"))); // NOI18N
        btnClose.setToolTipText("Fechar o programa");
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnBarraClose.add(btnClose);
        btnClose.setBounds(1100, 20, 33, 33);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/minimize-white.png"))); // NOI18N
        jButton2.setToolTipText("Minimizar o programa");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnBarraClose.add(jButton2);
        jButton2.setBounds(1050, 20, 33, 33);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        pnBarraClose.add(lblBack);
        lblBack.setBounds(-290, 0, 2740, 180);

        getContentPane().add(pnBarraClose);
        pnBarraClose.setBounds(0, 0, 1180, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus-blue.png")));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/plus.png")));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnBarraClose;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnPerfil;
    // End of variables declaration//GEN-END:variables
}
