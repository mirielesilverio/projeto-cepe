/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.connection.dataAccess.PlanejamentoAccess;
import control.connection.dataAccess.TurmasAccess;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jaqueline
 */
public class PreencheTabela2 {
    private static PlanejamentoAccess planejamentoAc;
    private static TurmasAccess turma = new TurmasAccess();
    public PreencheTabela2(JTable tabela,int classe,int idProf)
    {
        planejamentoAc = new PlanejamentoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        
        for(Planejamento planejamentos:planejamentoAc.lista(idProf,classe))
        {
            Object[] ob={this.turma.read(classe).getDesc(),planejamentos.getData(),planejamentos.getNome()};
            modelo.addRow(ob);
        }
        
    }
}
