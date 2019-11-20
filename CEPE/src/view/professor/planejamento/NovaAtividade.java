/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.professor.planejamento;

import control.connection.dataAccess.PlanejamentoAccess;
import control.connection.dataAccess.TurmasAccess;
import model.Planejamento;
import model.Professor;

/**
 *
 * @author Jaqueline
 */
public class NovaAtividade extends javax.swing.JPanel {

    private String texto = "";
    private static Planejamento planejamento;
    private static PlanejamentoAccess planejamentoAc;
    private static Professor professor;
    public NovaAtividade(Professor professor) {
        this.professor = professor;
        initComponents();
        TurmasAccess turmasAc = new TurmasAccess();
        jcbTurmas.removeAllItems();
        for(String turma:turmasAc.lista())
        {
            jcbTurmas.addItem(turma);
        }  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbTurmas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jftData = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 77, 133));
        jLabel6.setText("INSERIR EVENTO");
        add(jLabel6);
        jLabel6.setBounds(340, 90, 190, 31);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 77, 133));
        jLabel5.setText("Descrição");
        add(jLabel5);
        jLabel5.setBounds(200, 360, 460, 19);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 77, 133));
        jLabel2.setText("Turma");
        add(jLabel2);
        jLabel2.setBounds(200, 270, 200, 19);

        jcbTurmas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTurmasActionPerformed(evt);
            }
        });
        add(jcbTurmas);
        jcbTurmas.setBounds(200, 300, 210, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 133));
        jLabel4.setText("Nome do evento");
        add(jLabel4);
        jLabel4.setBounds(200, 180, 460, 19);

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(153, 153, 153));
        txtNome.setText("Clique para inserir o nome do evento");
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        add(txtNome);
        txtNome.setBounds(200, 210, 440, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 133));
        jLabel3.setText("Data");
        add(jLabel3);
        jLabel3.setBounds(430, 270, 120, 19);

        jftData.setBorder(null);
        jftData.setForeground(new java.awt.Color(153, 153, 153));
        try {
            jftData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftData.setText("00/00/0000");
        jftData.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jftData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jftDataMouseClicked(evt);
            }
        });
        jftData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftDataActionPerformed(evt);
            }
        });
        add(jftData);
        jftData.setBounds(430, 300, 220, 30);

        jSeparator1.setForeground(new java.awt.Color(0, 77, 133));
        add(jSeparator1);
        jSeparator1.setBounds(430, 330, 210, 10);

        jSeparator2.setForeground(new java.awt.Color(0, 77, 133));
        add(jSeparator2);
        jSeparator2.setBounds(200, 240, 440, 10);

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDesc);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 390, 440, 96);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 77, 133));
        jButton1.setText("SALVAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 133)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(200, 510, 440, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jftDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftDataActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
            texto = texto+"\n"+txtDesc.getText()+"\n";
    }//GEN-LAST:event_txtDescKeyTyped

    private void jcbTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTurmasActionPerformed

    private void jftDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftDataMouseClicked
        jftData.setText("");
    }//GEN-LAST:event_jftDataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.planejamento = new Planejamento();
        planejamento.setData(jftData.getText());
        planejamento.setDescricao(txtDesc.getText());
        planejamento.setIdProfessor(professor.getIdProfessor());
        planejamento.setNome(txtNome.getText());
        planejamento.setIdClasse(jcbTurmas.getSelectedIndex()+1);
        
        planejamentoAc = new PlanejamentoAccess();
        planejamentoAc.create(planejamento);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbTurmas;
    private javax.swing.JFormattedTextField jftData;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
