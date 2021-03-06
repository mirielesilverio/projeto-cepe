/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.aluno;

import control.connection.dataAccess.CidadeAccess;
import control.connection.dataAccess.EstadoAccess;
import javax.swing.JFrame;
import model.Aluno;

/**
 *
 * @author User
 */
public class PerfilAluno extends javax.swing.JFrame {

    static Aluno aluno1 = new Aluno();
    AlterarPerfilAluno altercao = new AlterarPerfilAluno();
    static EstadoAccess estado;
    static CidadeAccess cidade;
    
    public PerfilAluno(Aluno aluno) {
        aluno1 = aluno;
        initComponents();
        lblEmailTexto.setText(aluno1.getEmail());
        lblBairroTexto1.setText(aluno1.getBairro());
        lblCPFTexto.setText(aluno1.getCPF());
        lblDataNascTexto.setText(aluno1.getDataNasc());
        lblRGTexto.setText(aluno1.getRG());
        lblRuaTexto.setText(aluno1.getRua());
        lblTelefoneTexto.setText(aluno1.getTelefone());
        if(aluno1.getGenero()=="M")
            lblGenero.setText("Masculino");
        else if(aluno1.getGenero()=="O")
            lblGenero.setText("Outro");
        else
            lblGenero.setText("Feminino");
        
        estado = new EstadoAccess();
        lblEstadoTexto.setText(estado.read(aluno1.getEstado()).getNome());
        
        cidade = new CidadeAccess();
        lblCidadeTexto.setText(cidade.read(aluno1.getEstado(),aluno1.getCidade()).getNome());
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblDataNascTexto = new javax.swing.JLabel();
        lblGeneroTexto = new javax.swing.JLabel();
        lblCPFTexto = new javax.swing.JLabel();
        lblRGTexto = new javax.swing.JLabel();
        lblTelefoneTexto = new javax.swing.JLabel();
        lblEstadoTexto = new javax.swing.JLabel();
        lblCidadeTexto = new javax.swing.JLabel();
        lblRuaTexto = new javax.swing.JLabel();
        lblBairroTexto1 = new javax.swing.JLabel();
        lblNumeroTexto = new javax.swing.JLabel();
        lblEmailTexto = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back-left-arrow-square-button-outline.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar a Área de Trabalho");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVoltarMousePressed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(20, 10, 40, 33);

        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cross-square-button-white.png"))); // NOI18N
        btnClose1.setToolTipText("Fechar o programa");
        btnClose1.setBorder(null);
        btnClose1.setContentAreaFilled(false);
        btnClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose1);
        btnClose1.setBounds(1280, 20, 33, 33);

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
        getContentPane().add(jButton2);
        jButton2.setBounds(1230, 20, 40, 33);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user-previa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 90, 160, 160);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

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
        jPanel2.add(btnClose);
        btnClose.setBounds(1100, 20, 33, 33);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 133));
        jLabel3.setText("Nome do Usuário");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(360, 50, 520, 31);

        lblDataNasc.setBackground(new java.awt.Color(27, 144, 240));
        lblDataNasc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataNasc.setForeground(new java.awt.Color(0, 77, 133));
        lblDataNasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/calendar.png"))); // NOI18N
        lblDataNasc.setText("Data de Nascimento");
        jPanel2.add(lblDataNasc);
        lblDataNasc.setBounds(290, 130, 290, 30);

        lblGenero.setBackground(new java.awt.Color(27, 144, 240));
        lblGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 77, 133));
        lblGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/gender.png"))); // NOI18N
        lblGenero.setText("Gênero");
        jPanel2.add(lblGenero);
        lblGenero.setBounds(290, 210, 290, 30);

        lblEstado.setBackground(new java.awt.Color(27, 144, 240));
        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 77, 133));
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblEstado.setText("Estado");
        jPanel2.add(lblEstado);
        lblEstado.setBounds(650, 130, 290, 30);

        lblEmail.setBackground(new java.awt.Color(27, 144, 240));
        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 77, 133));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/mail.png"))); // NOI18N
        lblEmail.setText("Email");
        jPanel2.add(lblEmail);
        lblEmail.setBounds(960, 130, 250, 30);

        lblCidade.setBackground(new java.awt.Color(27, 144, 240));
        lblCidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(0, 77, 133));
        lblCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblCidade.setText("Cidade");
        jPanel2.add(lblCidade);
        lblCidade.setBounds(650, 210, 290, 30);

        lblCPF.setBackground(new java.awt.Color(27, 144, 240));
        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 77, 133));
        lblCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblCPF.setText("CPF");
        jPanel2.add(lblCPF);
        lblCPF.setBounds(290, 290, 290, 30);

        lblRua.setBackground(new java.awt.Color(27, 144, 240));
        lblRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(0, 77, 133));
        lblRua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblRua.setText("Rua");
        jPanel2.add(lblRua);
        lblRua.setBounds(650, 290, 290, 30);

        lblRG.setBackground(new java.awt.Color(27, 144, 240));
        lblRG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 77, 133));
        lblRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblRG.setText("RG");
        jPanel2.add(lblRG);
        lblRG.setBounds(290, 370, 290, 30);

        lblBairro.setBackground(new java.awt.Color(27, 144, 240));
        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(0, 77, 133));
        lblBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblBairro.setText("Bairro");
        jPanel2.add(lblBairro);
        lblBairro.setBounds(650, 370, 90, 30);

        lblTelefone.setBackground(new java.awt.Color(27, 144, 240));
        lblTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 77, 133));
        lblTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/phone-call.png"))); // NOI18N
        lblTelefone.setText("Telefone");
        jPanel2.add(lblTelefone);
        lblTelefone.setBounds(290, 450, 240, 30);

        lblNumero.setBackground(new java.awt.Color(27, 144, 240));
        lblNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 77, 133));
        lblNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblNumero.setText("Número");
        jPanel2.add(lblNumero);
        lblNumero.setBounds(650, 450, 90, 30);

        lblDataNascTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblDataNascTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataNascTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblDataNascTexto.setText("Data de Nascimento");
        jPanel2.add(lblDataNascTexto);
        lblDataNascTexto.setBounds(290, 170, 290, 30);

        lblGeneroTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblGeneroTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGeneroTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblGeneroTexto.setText("Gênero");
        jPanel2.add(lblGeneroTexto);
        lblGeneroTexto.setBounds(290, 250, 290, 30);

        lblCPFTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblCPFTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPFTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblCPFTexto.setText("CPF");
        jPanel2.add(lblCPFTexto);
        lblCPFTexto.setBounds(290, 330, 290, 30);

        lblRGTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblRGTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRGTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblRGTexto.setText("RG");
        jPanel2.add(lblRGTexto);
        lblRGTexto.setBounds(290, 410, 290, 30);

        lblTelefoneTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblTelefoneTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTelefoneTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblTelefoneTexto.setText("Telefone");
        jPanel2.add(lblTelefoneTexto);
        lblTelefoneTexto.setBounds(290, 490, 290, 30);

        lblEstadoTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblEstadoTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEstadoTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblEstadoTexto.setText("Estado");
        jPanel2.add(lblEstadoTexto);
        lblEstadoTexto.setBounds(650, 170, 250, 30);

        lblCidadeTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblCidadeTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCidadeTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblCidadeTexto.setText("Cidade");
        jPanel2.add(lblCidadeTexto);
        lblCidadeTexto.setBounds(650, 250, 290, 30);

        lblRuaTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblRuaTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRuaTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblRuaTexto.setText("Rua");
        jPanel2.add(lblRuaTexto);
        lblRuaTexto.setBounds(650, 330, 290, 30);

        lblBairroTexto1.setBackground(new java.awt.Color(27, 144, 240));
        lblBairroTexto1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairroTexto1.setForeground(new java.awt.Color(153, 153, 153));
        lblBairroTexto1.setText("Bairro");
        jPanel2.add(lblBairroTexto1);
        lblBairroTexto1.setBounds(650, 410, 290, 30);

        lblNumeroTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblNumeroTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNumeroTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblNumeroTexto.setText("Numero");
        jPanel2.add(lblNumeroTexto);
        lblNumeroTexto.setBounds(650, 490, 290, 30);

        lblEmailTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblEmailTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmailTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblEmailTexto.setText("Email");
        jPanel2.add(lblEmailTexto);
        lblEmailTexto.setBounds(960, 170, 260, 30);

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 77, 133));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/edition-pencil-interface-symbol-button-of-square-shape.png"))); // NOI18N
        btnEditar.setText("   Editar perfil");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });
        jPanel2.add(btnEditar);
        btnEditar.setBounds(1210, 20, 120, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 140, 1920, 600);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnVoltarMousePressed

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        this.altercao.setVisible(true);
        
    }//GEN-LAST:event_btnEditarMousePressed

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
            java.util.logging.Logger.getLogger(PerfilAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilAluno(aluno1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroTexto1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPFTexto;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidadeTexto;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblDataNascTexto;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailTexto;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoTexto;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroTexto;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroTexto;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRGTexto;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRuaTexto;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneTexto;
    // End of variables declaration//GEN-END:variables
}
