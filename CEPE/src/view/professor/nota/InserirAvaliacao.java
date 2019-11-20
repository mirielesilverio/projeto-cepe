package view.professor.nota;

import model.Professor;
import model.Avaliacao;
import control.connection.dataAccess.AvalicaoAccess;
import control.connection.dataAccess.TurmasAccess;
import control.connection.dataAccess.TipoAvAccess;

public class InserirAvaliacao extends javax.swing.JPanel {
    private static ListaAv listaAv;
    private static MenuCarregar menu;
    private static Professor professor;
    private static Avaliacao avaliacao;
    private static AvalicaoAccess avaliacaoAc;
    private static Espera espera;
    
    public InserirAvaliacao(Espera espera,Professor professor,ListaAv listaAv,MenuCarregar menu) {   
        this.professor = professor;
        initComponents();
        
        this.listaAv = listaAv;
        this.menu = menu;
        this.espera = espera;
        
        TurmasAccess turmasAc = new TurmasAccess();
        jcbTurmas.removeAllItems();
        for(String turma:turmasAc.lista())
        {
            jcbTurmas.addItem(turma);
        }  
        
        TipoAvAccess tipoAc = new TipoAvAccess();
        jcbTipoAv.removeAllItems();
        for(String tipo:tipoAc.lista())
        {
            jcbTipoAv.addItem(tipo);
        }  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jcbTipoAv = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbTurmas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jftData = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(290, 730));
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome da avaliação");
        add(jLabel4);
        jLabel4.setBounds(30, 310, 150, 16);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(30, 370, 220, 10);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de avaliação");
        add(jLabel1);
        jLabel1.setBounds(30, 170, 130, 16);

        jcbTipoAv.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(jcbTipoAv);
        jcbTipoAv.setBounds(30, 190, 220, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turma");
        add(jLabel2);
        jLabel2.setBounds(30, 240, 110, 16);

        jcbTurmas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        add(jcbTurmas);
        jcbTurmas.setBounds(30, 270, 220, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data");
        add(jLabel3);
        jLabel3.setBounds(30, 380, 30, 16);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(30, 440, 220, 10);

        jftData.setBorder(null);
        jftData.setForeground(new java.awt.Color(102, 102, 102));
        try {
            jftData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftData.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jftData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftDataActionPerformed(evt);
            }
        });
        add(jftData);
        jftData.setBounds(30, 410, 220, 30);

        btnCadastrar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        add(btnCadastrar);
        btnCadastrar.setBounds(30, 470, 220, 50);

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(153, 153, 153));
        txtNome.setBorder(null);
        add(txtNome);
        txtNome.setBounds(30, 340, 220, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 290, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void jftDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftDataActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        espera.setVisible(false);
        avaliacao = new Avaliacao();
        avaliacao.setData(jftData.getText());
        avaliacao.setDescricao(txtNome.getText());
        avaliacao.setIdClasse(jcbTurmas.getSelectedIndex()+1);
        avaliacao.setIdDisciplina(professor.getMateria());
        avaliacao.setIdProfessor(professor.getIdProfessor());
        avaliacao.setIdTipo(jcbTipoAv.getSelectedIndex()+1);
        
        avaliacaoAc = new AvalicaoAccess();
        avaliacaoAc.create(avaliacao);
        
 
        listaAv.setVisible(true);
        listaAv.setClasse(avaliacao.getIdClasse());
        listaAv.preencher();
        menu.setVisible(true);
        this.setVisible(false);
 
    }//GEN-LAST:event_btnCadastrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbTipoAv;
    private javax.swing.JComboBox<String> jcbTurmas;
    private javax.swing.JFormattedTextField jftData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
