/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.aluno;

import control.connection.dataAccess.TurmasAccess;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import model.Aluno;
import view.diretor.CalendarioEscolar;

/**
 *
 * @author User
 */
public class MenuAluno extends javax.swing.JFrame {

    static Color cor = new Color(204,204,204,100);
    static Aluno aluno;
    static TurmasAccess turma;
    static AbaDeEstatisticas estatisticas;
    static AlterarPerfilAluno alterar= new AlterarPerfilAluno();
    private static CalendarioEscolar calendario;
    static PerfilAluno perfil;
    private static SelDiscCt selDisc;
    private static VerCt vernt;

    public MenuAluno(Aluno aluno) {
        initComponents();
        this.setLocationRelativeTo(null);
        MenuAluno.aluno = aluno;
        perfil = new PerfilAluno(MenuAluno.aluno);
        
        estatisticas = new  AbaDeEstatisticas(aluno);

        lblNome.setText(aluno.getNome()+" "+aluno.getSobrenome());
        lblEmail.setText(aluno.getEmail());
        turma = new TurmasAccess();
        lblClasse.setText(turma.read(aluno.getClasse()).getDesc());
        
        vernt = new VerCt();
        selDisc = new SelDiscCt(aluno,vernt);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgPerfil = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblClasse = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblImgEstatistica = new javax.swing.JLabel();
        lblImgNotas = new javax.swing.JLabel();
        lblImgCalendario = new javax.swing.JLabel();
        lblImgPerfil = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1178, 730));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1178, 730));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user-previa.png"))); // NOI18N
        jPanel1.add(imgPerfil);
        imgPerfil.setBounds(70, 150, 130, 150);

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome do Usuário");
        jPanel1.add(lblNome);
        lblNome.setBounds(30, 330, 220, 23);

        lblClasse.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblClasse.setForeground(new java.awt.Color(255, 255, 255));
        lblClasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClasse.setText("usuario@usuario.com");
        jPanel1.add(lblClasse);
        lblClasse.setBounds(30, 390, 220, 19);

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("usuario@usuario.com");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(30, 360, 220, 19);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 133));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Área de Trabalho");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(390, 120, 290, 50);

        lblImgEstatistica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/planning.png"))); // NOI18N
        lblImgEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImgEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImgEstatisticaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImgEstatisticaMousePressed(evt);
            }
        });
        jPanel2.add(lblImgEstatistica);
        lblImgEstatistica.setBounds(580, 220, 176, 172);

        lblImgNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/evaluation.png"))); // NOI18N
        lblImgNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgNotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImgNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImgNotasMouseExited(evt);
            }
        });
        jPanel2.add(lblImgNotas);
        lblImgNotas.setBounds(280, 210, 176, 172);

        lblImgCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/event.png"))); // NOI18N
        lblImgCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImgCalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImgCalendarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImgCalendarioMousePressed(evt);
            }
        });
        jPanel2.add(lblImgCalendario);
        lblImgCalendario.setBounds(290, 420, 176, 172);

        lblImgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/person.png"))); // NOI18N
        lblImgPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImgPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImgPerfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImgPerfilMousePressed(evt);
            }
        });
        jPanel2.add(lblImgPerfil);
        lblImgPerfil.setBounds(590, 410, 176, 172);

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
        jPanel2.add(jButton2);
        jButton2.setBounds(820, 10, 33, 33);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cross-square-button.png"))); // NOI18N
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
        btnClose.setBounds(860, 10, 33, 33);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 133));
        jLabel4.setText("Acessar Perfil");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(630, 530, 100, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 77, 133));
        jLabel5.setText("Minhas estatísticas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(610, 350, 130, 19);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 77, 133));
        jLabel6.setText("Minhas Notas");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(330, 340, 100, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 77, 133));
        jLabel7.setText("Calendário Escolar");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(310, 540, 160, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(260, 0, 1920, 1080);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 77, 133));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Área de Trabalho");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 60, 290, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblImgNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgNotasMouseEntered
        
        lblImgNotas.setBorder(BorderFactory.createLineBorder(cor, 1));
    }//GEN-LAST:event_lblImgNotasMouseEntered

    private void lblImgNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgNotasMouseExited
        lblImgNotas.setBorder(null);
    }//GEN-LAST:event_lblImgNotasMouseExited

    private void lblImgCalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgCalendarioMouseEntered
        lblImgCalendario.setBorder(BorderFactory.createLineBorder(cor, 1));
    }//GEN-LAST:event_lblImgCalendarioMouseEntered

    private void lblImgCalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgCalendarioMouseExited
        lblImgCalendario.setBorder(null);
    }//GEN-LAST:event_lblImgCalendarioMouseExited

    private void lblImgPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgPerfilMouseEntered
        lblImgPerfil.setBorder(BorderFactory.createLineBorder(cor, 1));
    }//GEN-LAST:event_lblImgPerfilMouseEntered

    private void lblImgPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgPerfilMouseExited
        lblImgPerfil.setBorder(null);
    }//GEN-LAST:event_lblImgPerfilMouseExited

    private void lblImgEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgEstatisticaMouseEntered
        lblImgEstatistica.setBorder(BorderFactory.createLineBorder(cor, 1));
    }//GEN-LAST:event_lblImgEstatisticaMouseEntered

    private void lblImgEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgEstatisticaMouseExited
        lblImgEstatistica.setBorder(null);
    }//GEN-LAST:event_lblImgEstatisticaMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lblImgEstatisticaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgEstatisticaMousePressed
        estatisticas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblImgEstatisticaMousePressed

    private void lblImgCalendarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgCalendarioMousePressed
        calendario = new CalendarioEscolar();
        calendario.setVisible(true);
        
    }//GEN-LAST:event_lblImgCalendarioMousePressed

    private void lblImgPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgPerfilMousePressed
        perfil.setVisible(true);
    }//GEN-LAST:event_lblImgPerfilMousePressed

    private void lblImgNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgNotasMouseClicked
        selDisc.setVisible(true);
    }//GEN-LAST:event_lblImgNotasMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Aluno aluno) {
                new MenuAluno(aluno).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClasse;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImgCalendario;
    private javax.swing.JLabel lblImgEstatistica;
    private javax.swing.JLabel lblImgNotas;
    private javax.swing.JLabel lblImgPerfil;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}