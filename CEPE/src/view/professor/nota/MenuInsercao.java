package view.professor.nota;

import control.connection.dataAccess.AlunoAccess;
import control.connection.dataAccess.NotaAccess;
import control.connection.dataAccess.PresencaAccess;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Avaliacao;
import model.Notas;


public class MenuInsercao extends javax.swing.JPanel {

    private static NotaAccess notaAc;
    private static model.Notas nota; 
    private static DefaultTableModel modelo;
    private static InsercaoNotas inserirNotas;
    private static Avaliacao avaliacao;
    
    public MenuInsercao(InsercaoNotas inserirNotas){
        initComponents();
        this.inserirNotas = inserirNotas;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setMinimumSize(new java.awt.Dimension(290, 730));
        setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        add(btnSalvar);
        btnSalvar.setBounds(40, 350, 200, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/bg-img.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 290, 730);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void setAvaliacao(Avaliacao avaliacao) {
        MenuInsercao.avaliacao = avaliacao;
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        modelo = inserirNotas.getModelo();
        
        notaAc = new NotaAccess();
        nota = new model.Notas();
        
        AlunoAccess alunoAc = new AlunoAccess();
        for(int i=0;i<modelo.getRowCount();i++)
        {
            nota.setIdAluno(alunoAc.pegaId((String) modelo.getValueAt(i,0)));
            
            nota.setIdAvaliacao(avaliacao.getId());
            nota.setIdDisciplina(avaliacao.getIdDisciplina());
            nota.setIdProfessor(avaliacao.getIdProfessor());
            
            if((float) modelo.getValueAt(i, 2)<0 || (float) modelo.getValueAt(i, 2)>10)
                JOptionPane.showMessageDialog(null,"Nota do aluno "+(i+1)+" inválida");
            else
            {
                nota.setValor((float) modelo.getValueAt(i, 2));
                notaAc.create(nota);
                btnSalvar.setEnabled(false);
            }
                
            
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
