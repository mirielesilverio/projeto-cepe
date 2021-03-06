/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.diretor;

import control.connection.dataAccess.EventoAccess;
import javax.swing.JTextArea;
import model.Evento;

/**
 *
 * @author Aluno
 */
public class Planejamentos extends javax.swing.JFrame {

    private EventoAccess acesso = new EventoAccess();
    private Evento ev = new Evento();
    private NovoEvento novoEvento =  new NovoEvento();
    private JTextArea txtArea;
    
    public Planejamentos() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton1.setVisible(false);
        jComboBox1.removeAllItems();
        for(String evento:acesso.lista()){
            jComboBox1.addItem(evento);
        }
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel4.setVisible(false);
     jScrollPane1.setVisible(false);
        jLabel5.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTXTNome = new javax.swing.JLabel();
        jTXTData = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imgPerfil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblEmail = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1173, 730));
        setMinimumSize(new java.awt.Dimension(1173, 730));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1173, 730));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1173, 730));
        jPanel1.setMinimumSize(new java.awt.Dimension(1173, 730));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1173, 730));
        jPanel2.setMinimumSize(new java.awt.Dimension(1173, 730));
        jPanel2.setPreferredSize(new java.awt.Dimension(1173, 730));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 77, 133));
        jLabel7.setText("NOME:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(24, 36, 100, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 77, 133));
        jLabel8.setText("DATA:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(24, 84, 100, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 133));
        jLabel4.setText("DESCRIÇÃO:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(22, 138, 90, 19);

        jTXTNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTXTNome.setForeground(new java.awt.Color(0, 77, 133));
        jPanel4.add(jTXTNome);
        jTXTNome.setBounds(142, 36, 203, 30);

        jTXTData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTXTData.setForeground(new java.awt.Color(0, 77, 133));
        jPanel4.add(jTXTData);
        jTXTData.setBounds(142, 84, 203, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/list.png"))); // NOI18N
        jPanel5.add(jLabel3);
        jLabel3.setBounds(100, 160, 256, 313);

        jScrollPane1.setForeground(new java.awt.Color(0, 77, 133));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(150, 210, 190, 80);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, -70, 470, 520);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/wedding-planning_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(310, -40, 910, 750);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back-left-arrow-square-button-outline.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 10, 70, 40);

        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user-previa.png"))); // NOI18N
        jPanel1.add(imgPerfil);
        imgPerfil.setBounds(70, 100, 128, 128);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECIONE A DATA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 380, 130, 16);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 480, 170, 30);

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BUSCAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 480, 170, 30);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("INCLUIR EVENTO");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 530, 170, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(50, 410, 170, 30);

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("usuario@usuario.com");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(60, 280, 145, 19);

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome do Usuário");
        jPanel1.add(lblNome);
        lblNome.setBounds(60, 250, 153, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(1173, 730));
        jLabel1.setPreferredSize(new java.awt.Dimension(1173, 730));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1173, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1173, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        jButton1.setVisible(true);
         
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        this.dispose();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
       
        
    }//GEN-LAST:event_jComboBox1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel4.setVisible(true);
        jLabel3.setVisible(false);
        jPanel5.setVisible(true);
        jPanel4.setVisible(true);
        jScrollPane1.setVisible(true);
        ev = acesso.read(jComboBox1.getSelectedItem().toString());
        jTXTData.setText(ev.getData());
        jTXTNome.setText(ev.getNome());
        jTextArea1.setVisible(true);
        jTextArea1.setText(ev.getDescricao());
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        novoEvento.setVisible(true);
        
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Planejamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planejamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planejamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planejamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planejamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTXTData;
    private javax.swing.JLabel jTXTNome;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
