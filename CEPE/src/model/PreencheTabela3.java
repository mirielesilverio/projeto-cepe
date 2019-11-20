package model;

import control.connection.dataAccess.NotaAccess;
import control.connection.dataAccess.AvalicaoAccess;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PreencheTabela3 {
    private static NotaAccess notaAc;
    private static AvalicaoAccess avaliacaoAc;
    public PreencheTabela3(JTable tabela,int disc,int aluno)
    {
        notaAc = new NotaAccess();
        avaliacaoAc = new AvalicaoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        
        for(Notas notas:notaAc.lista(aluno,disc))
        {
            Object[] ob={avaliacaoAc.read(notas.getIdAvaliacao()).getDescricao(),avaliacaoAc.read(notas.getIdAvaliacao()).getData()
                    ,notas.getValor()};
            modelo.addRow(ob);
        }
        
    }
}
