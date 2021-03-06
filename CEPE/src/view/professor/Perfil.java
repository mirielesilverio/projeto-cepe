/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.professor;

import control.connection.dataAccess.CidadeAccess;
import control.connection.dataAccess.EstadoAccess;
import javax.swing.JFrame;
import model.Professor;

/**
 *
 * @author Aluno
 */
public class Perfil extends javax.swing.JFrame {

    static EstadoAccess estado;
    static CidadeAccess cidade;
    static Professor professor;
    static MenuProfessor menu;
    
    public Perfil(Professor professor) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.professor = professor;
        
        
        lblNome.setText(professor.getNome()+" "+professor.getSobrenome());
        lblDataNascTexto.setText(professor.getDataNasc());
        
        if(professor.getGenero()=="M")
            lblGeneroTexto.setText("Masculino");
        else
            lblGeneroTexto.setText("Feminino");
        
        lblCPFTexto.setText(professor.getCPF());
        lblRGTexto.setText(professor.getRG());
        lblTelefoneTexto.setText(professor.getTelefone());
        
        estado = new EstadoAccess();
        lblEstadoTexto.setText(estado.read(professor.getEstado()).getNome());
        
        cidade = new CidadeAccess();
        lblCidadeTexto.setText(cidade.read(professor.getEstado(),professor.getCidade()).getNome());
        
        lblRuaTexto.setText(professor.getRua());
        lblBairroTexto.setText(professor.getBairro());
        lblNumeroTexto.setText(String.valueOf(professor.getNum()));
        lblEmailTexto.setText(professor.getEmail());
        
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
        pnBarraClose = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        pnDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCidadeTexto = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblBairroTexto = new javax.swing.JLabel();
        lblDataNascTexto = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblTelefoneTexto = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblGeneroTexto = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblRGTexto = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCPFTexto = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblEstadoTexto = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblRuaTexto = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblNumeroTexto = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEmailTexto = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1178, 730));
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnPerfil.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user-previa.png"))); // NOI18N
        pnPerfil.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 160);

        getContentPane().add(pnPerfil);
        pnPerfil.setBounds(70, 110, 160, 160);

        pnBarraClose.setLayout(null);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back-left-arrow-square-button-outline.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar a Área de Trabalho");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnBarraClose.add(btnVoltar);
        btnVoltar.setBounds(40, 20, 40, 40);

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
        btnClose.setBounds(1100, 20, 1, 1);

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
        jButton2.setBounds(1050, 20, 1, 1);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        pnBarraClose.add(lblBack);
        lblBack.setBounds(-300, 0, 2740, 180);

        getContentPane().add(pnBarraClose);
        pnBarraClose.setBounds(0, 0, 1180, 180);

        pnDados.setBackground(new java.awt.Color(255, 255, 255));
        pnDados.setLayout(null);

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 77, 133));
        lblNome.setText("Nome do Usuário");
        pnDados.add(lblNome);
        lblNome.setBounds(290, 40, 520, 31);

        lblCidade.setBackground(new java.awt.Color(27, 144, 240));
        lblCidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(0, 77, 133));
        lblCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblCidade.setText("Cidade");
        pnDados.add(lblCidade);
        lblCidade.setBounds(580, 190, 290, 30);

        lblCidadeTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblCidadeTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCidadeTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblCidadeTexto.setText("Cidade");
        pnDados.add(lblCidadeTexto);
        lblCidadeTexto.setBounds(580, 230, 290, 30);

        lblBairro.setBackground(new java.awt.Color(27, 144, 240));
        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(0, 77, 133));
        lblBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblBairro.setText("Bairro");
        pnDados.add(lblBairro);
        lblBairro.setBounds(580, 350, 90, 30);

        lblBairroTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblBairroTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairroTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblBairroTexto.setText("Bairro");
        pnDados.add(lblBairroTexto);
        lblBairroTexto.setBounds(580, 390, 290, 30);

        lblDataNascTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblDataNascTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataNascTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblDataNascTexto.setText("Data de Nascimento");
        pnDados.add(lblDataNascTexto);
        lblDataNascTexto.setBounds(290, 140, 290, 30);

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

        lblTelefoneTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblTelefoneTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTelefoneTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblTelefoneTexto.setText("Telefone");
        pnDados.add(lblTelefoneTexto);
        lblTelefoneTexto.setBounds(290, 480, 290, 30);

        lblGenero.setBackground(new java.awt.Color(27, 144, 240));
        lblGenero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 77, 133));
        lblGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/gender.png"))); // NOI18N
        lblGenero.setText("Gênero");
        pnDados.add(lblGenero);
        lblGenero.setBounds(290, 190, 290, 30);

        lblGeneroTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblGeneroTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGeneroTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblGeneroTexto.setText("Gênero");
        pnDados.add(lblGeneroTexto);
        lblGeneroTexto.setBounds(290, 230, 290, 30);

        lblRG.setBackground(new java.awt.Color(27, 144, 240));
        lblRG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 77, 133));
        lblRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblRG.setText("RG");
        pnDados.add(lblRG);
        lblRG.setBounds(290, 360, 290, 30);

        lblRGTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblRGTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRGTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblRGTexto.setText("RG");
        pnDados.add(lblRGTexto);
        lblRGTexto.setBounds(290, 390, 290, 30);

        lblCPF.setBackground(new java.awt.Color(27, 144, 240));
        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 77, 133));
        lblCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/id-card.png"))); // NOI18N
        lblCPF.setText("CPF");
        pnDados.add(lblCPF);
        lblCPF.setBounds(290, 270, 290, 30);

        lblCPFTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblCPFTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPFTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblCPFTexto.setText("CPF");
        pnDados.add(lblCPFTexto);
        lblCPFTexto.setBounds(290, 310, 290, 30);

        lblEstado.setBackground(new java.awt.Color(27, 144, 240));
        lblEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 77, 133));
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblEstado.setText("Estado");
        pnDados.add(lblEstado);
        lblEstado.setBounds(580, 100, 290, 30);

        lblEstadoTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblEstadoTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEstadoTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblEstadoTexto.setText("Estado");
        pnDados.add(lblEstadoTexto);
        lblEstadoTexto.setBounds(580, 140, 250, 30);

        lblRua.setBackground(new java.awt.Color(27, 144, 240));
        lblRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRua.setForeground(new java.awt.Color(0, 77, 133));
        lblRua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblRua.setText("Rua");
        pnDados.add(lblRua);
        lblRua.setBounds(580, 270, 290, 30);

        lblRuaTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblRuaTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRuaTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblRuaTexto.setText("Rua");
        pnDados.add(lblRuaTexto);
        lblRuaTexto.setBounds(580, 300, 290, 30);

        lblNumero.setBackground(new java.awt.Color(27, 144, 240));
        lblNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 77, 133));
        lblNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/marker.png"))); // NOI18N
        lblNumero.setText("Número");
        pnDados.add(lblNumero);
        lblNumero.setBounds(580, 440, 90, 30);

        lblNumeroTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblNumeroTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNumeroTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblNumeroTexto.setText("Numero");
        pnDados.add(lblNumeroTexto);
        lblNumeroTexto.setBounds(580, 480, 290, 30);

        lblEmail.setBackground(new java.awt.Color(27, 144, 240));
        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 77, 133));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/mail.png"))); // NOI18N
        lblEmail.setText("Email");
        pnDados.add(lblEmail);
        lblEmail.setBounds(900, 100, 250, 30);

        lblEmailTexto.setBackground(new java.awt.Color(27, 144, 240));
        lblEmailTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmailTexto.setForeground(new java.awt.Color(153, 153, 153));
        lblEmailTexto.setText("Email");
        pnDados.add(lblEmailTexto);
        lblEmailTexto.setBounds(900, 140, 260, 30);

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 77, 133));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/edition-pencil-interface-symbol-button-of-square-shape.png"))); // NOI18N
        btnEditar.setText("   Editar perfil");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnDados.add(btnEditar);
        btnEditar.setBounds(1020, 10, 120, 40);

        getContentPane().add(pnDados);
        pnDados.setBounds(0, 180, 1180, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        menu = new MenuProfessor(professor);
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Professor professor) {
                new Perfil(professor).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroTexto;
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
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroTexto;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRGTexto;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRuaTexto;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneTexto;
    private javax.swing.JPanel pnBarraClose;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnPerfil;
    // End of variables declaration//GEN-END:variables
}
