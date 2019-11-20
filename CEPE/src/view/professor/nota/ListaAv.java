/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.professor.nota;

import control.connection.dataAccess.AvalicaoAccess;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Avaliacao;
import model.Professor;
import model.PreencheTabela;

/**
 *
 * @author benedito
 */
public class ListaAv extends javax.swing.JPanel {

    static private int classe;
    static private Professor professor;
    static private MenuCarregar menu;
    static private InsercaoNotas insere;
    static private MenuInsercao menuSalva;
    public ListaAv(Professor professor,MenuCarregar menu,InsercaoNotas insere,MenuInsercao menuSalva) {
        initComponents();
        this.menu = menu;
        this.professor = professor;
        this.insere = insere;
        this.menuSalva = menuSalva;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Turma", "Data", "Tipo", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        this.setVisible(false);
        menu.setVisible(false);  
        insere.setClasse(classe);
        insere.preencher();
        insere.setVisible(true);
        menuSalva.setVisible(true);
        Avaliacao avaliacao = new Avaliacao();
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        
        AvalicaoAccess avaliacaoAc = new AvalicaoAccess();
        
        avaliacao=avaliacaoAc.read((int) modelo.getValueAt(jTable1.getSelectedRow(), 0));
        
        insere.setClasse(avaliacaoAc.read((int) modelo.getValueAt(jTable1.getSelectedRow(), 0)).getIdClasse());
        menuSalva.setAvaliacao(avaliacao);
        
    }//GEN-LAST:event_jTable1MouseClicked

    public void setClasse(int classe)
    {
        this.classe = classe;
    }
    public void preencher()
    {
        PreencheTabela preencher = new PreencheTabela(professor.getIdProfessor(),classe,jTable1);
    }
    public void preencher2()
    {
        PreencheTabela preencher = new PreencheTabela();
        preencher.preencheAv(professor.getIdProfessor(), jTable1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
