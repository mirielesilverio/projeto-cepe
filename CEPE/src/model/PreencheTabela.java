package model;

import control.connection.dataAccess.AlunoAccess;
import control.connection.dataAccess.ChamadaAccess;
import control.connection.dataAccess.PresencaAccess;
import control.connection.dataAccess.UsuarioAccess;
import control.connection.dataAccess.TipoAvAccess;
import control.connection.dataAccess.AvalicaoAccess;
import control.connection.dataAccess.TurmasAccess;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PreencheTabela {
    
    static AlunoAccess alunoAc;
    static ChamadaAccess chamadaAc;
    static TurmasAccess turma;
    static PresencaAccess presencaAc;
    static AvalicaoAccess avaliacaoAc;
    static TipoAvAccess tipoAc;
    
    public PreencheTabela()
    {
    
    }
    
    public PreencheTabela(JTable tabela,int classe)
    {
        
        alunoAc = new AlunoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        TableColumnModel columModel = tabela.getColumnModel();
        
        columModel.getColumn(2).setMinWidth(30);
        columModel.getColumn(2).setMaxWidth(100);
        columModel.getColumn(2).setWidth(100);
        columModel.getColumn(2).setPreferredWidth(100);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        
        for(Aluno alunos:alunoAc.lista(classe))
        {
            Object[] ob={alunos.getRa(),alunos.getNome()+" "+alunos.getSobrenome(),false};
            modelo.addRow(ob);
        }
    }
    public PreencheTabela(int classe,JTable tabela)
    {
        
        alunoAc = new AlunoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        
        for(Aluno alunos:alunoAc.lista(classe))
        {
            Object[] ob={alunos.getRa(),alunos.getNome()+" "+alunos.getSobrenome()};
            modelo.addRow(ob);
        }
    }
    
    public PreencheTabela(JTable tabela,int chamada,int classe)
    {
        
        alunoAc = new AlunoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        TableColumnModel columModel = tabela.getColumnModel();
        
        columModel.getColumn(2).setMinWidth(30);
        columModel.getColumn(2).setMaxWidth(100);
        columModel.getColumn(2).setWidth(100);
        columModel.getColumn(2).setPreferredWidth(100);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        
        presencaAc = new PresencaAccess();
        boolean situacao = true;
        for(Aluno alunos:alunoAc.lista(classe))
        {
            if(presencaAc.read(chamada, alunos.getIdAluno()).getSituacao()!=1)
                situacao = false;
                        
            Object[] ob={alunos.getRa(),alunos.getNome()+" "+alunos.getSobrenome(),situacao};
            modelo.addRow(ob);
        }
    }
    
    public PreencheTabela(JTable tabela,int idProfessor,String data,int turma)
    {
        
        chamadaAc = new ChamadaAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        TableColumnModel columModel = tabela.getColumnModel();
        
        columModel.getColumn(2).setMinWidth(30);
        columModel.getColumn(2).setMaxWidth(100);
        columModel.getColumn(2).setWidth(100);
        columModel.getColumn(2).setPreferredWidth(100);
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        this.turma = new TurmasAccess();
        
        for(Chamada chamadas:chamadaAc.read(idProfessor,turma,data))
        {
            Object[] ob={chamadas.getData(),chamadas.getHorario(),this.turma.read(turma).getDesc()};
            modelo.addRow(ob);
        }
    }
    
    public PreencheTabela(int idProfessor,int turma,JTable tabela)
    {
        
        avaliacaoAc = new AvalicaoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        TableColumnModel columModel = tabela.getColumnModel();
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        this.turma = new TurmasAccess();
        this.tipoAc = new TipoAvAccess();
        for(Avaliacao avaliacao:avaliacaoAc.lista(idProfessor,turma))
        {
            Object[] ob={avaliacao.getId(),this.turma.read(turma).getDesc(),avaliacao.getData(),tipoAc.read(avaliacao.getIdTipo()),avaliacao.getDescricao()};
            modelo.addRow(ob);
        }
    }
    public void preencheAv(int id,JTable tabela)
    {
        avaliacaoAc = new AvalicaoAccess();
        
        
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        tabela.setModel(modelo);
        
        tabela.setBorder(null);
        
        TableColumnModel columModel = tabela.getColumnModel();
        
        tabela.setOpaque(false);
           
        modelo.setNumRows(0);
        this.turma = new TurmasAccess();
        this.tipoAc = new TipoAvAccess();
        
        for(Avaliacao avaliacao:avaliacaoAc.lista(id))
        {
            Object[] ob={avaliacao.getId(),this.turma.read(avaliacao.getIdClasse()).getDesc(),avaliacao.getData(),tipoAc.read(avaliacao.getIdTipo()),avaliacao.getDescricao()};
            modelo.addRow(ob);
        }
    }
}
