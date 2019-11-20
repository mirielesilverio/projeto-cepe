package control.connection.dataAccess;

import control.connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Avaliacao;


public class AvalicaoAccess {
    public void create(Avaliacao avaliacao)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO avaliacao(descricao,idTipo,idProfessor,idDisciplina,idClasse,data)"
                    + "                      VALUES (?,?,?,?,?,?)");
            
            stmt.setString(1,avaliacao.getDescricao());
            stmt.setInt(2,avaliacao.getIdTipo());           
            stmt.setInt(3,avaliacao.getIdProfessor()); 
            stmt.setInt(4,avaliacao.getIdDisciplina()); 
            stmt.setInt(5,avaliacao.getIdClasse()); 
            stmt.setString(6,avaliacao.getData()); 
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro finalizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(AvalicaoAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public List<Avaliacao> lista(int id,int classe)
    {
        Connection conexao = Conexao.getConnection();
        Statement stmt = null;  
        
        try {
            stmt = conexao.createStatement();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ex);
        }
        
        ResultSet rs = null;
        
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM avaliacao WHERE idProfessor="+id+" AND idClasse="+classe);
                  
            while(rs.next())
            {
                avaliacao = new Avaliacao();
                
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setData(rs.getString("data"));
                avaliacao.setDescricao(rs.getString("descricao"));
                avaliacao.setIdClasse(rs.getInt("idClasse"));
                avaliacao.setIdDisciplina(rs.getInt("idDisciplina"));
                avaliacao.setIdTipo(rs.getInt("idTipo"));
                avaliacao.setIdProfessor(rs.getInt("idProfessor"));
                avaliacoes.add(avaliacao);
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return avaliacoes;
        
    }
    public Avaliacao read(int id)
    {
        Connection conexao = Conexao.getConnection();
        Statement stmt = null;  
        
        try {
            stmt = conexao.createStatement();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ex);
        }
        
        ResultSet rs = null;
        
        Avaliacao avaliacao = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM avaliacao WHERE id="+id);
                  
            while(rs.next())
            {
                avaliacao = new Avaliacao();
                
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setData(rs.getString("data"));
                avaliacao.setDescricao(rs.getString("descricao"));
                avaliacao.setIdClasse(rs.getInt("idClasse"));
                avaliacao.setIdDisciplina(rs.getInt("idDisciplina"));
                avaliacao.setIdTipo(rs.getInt("idTipo"));
                avaliacao.setIdProfessor(rs.getInt("idProfessor"));
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return avaliacao;
        
    }
    public List<Avaliacao> lista(int id)
    {
        Connection conexao = Conexao.getConnection();
        Statement stmt = null;  
        
        try {
            stmt = conexao.createStatement();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ex);
        }
        
        ResultSet rs = null;
        
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM avaliacao WHERE idProfessor="+id);
                  
            while(rs.next())
            {
                avaliacao = new Avaliacao();
                
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setData(rs.getString("data"));
                avaliacao.setDescricao(rs.getString("descricao"));
                avaliacao.setIdClasse(rs.getInt("idClasse"));
                avaliacao.setIdDisciplina(rs.getInt("idDisciplina"));
                avaliacao.setIdTipo(rs.getInt("idTipo"));
                avaliacao.setIdProfessor(rs.getInt("idProfessor"));
                avaliacoes.add(avaliacao);
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return avaliacoes;
        
    }
}
