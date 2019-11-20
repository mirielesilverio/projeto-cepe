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
import model.Planejamento;

public class PlanejamentoAccess {
    public void create(Planejamento planejamento)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO planejamento(idProfessor,idClasse,data,descricao,nome)"
                    + "                      VALUES (?,?,?,?,?)");
            
            stmt.setInt(1,planejamento.getIdProfessor());
            stmt.setInt(2,planejamento.getIdClasse());           
            stmt.setString(3,planejamento.getData()); 
            stmt.setString(4,planejamento.getDescricao()); 
            stmt.setString(5,planejamento.getNome()); 
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro finalizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(PlanejamentoAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public List<Planejamento> lista(int idProfessor,int classe)
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
        
        List<Planejamento> planejamentos = new ArrayList<>();
        Planejamento planejamento;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM planejamento WHERE idProfessor="+idProfessor+" AND idClasse="+classe);
                  
            while(rs.next())
            {
                planejamento = new Planejamento();
                
                planejamento.setData(rs.getString("data"));
                planejamento.setDescricao(rs.getString("descricao"));
                planejamento.setId(rs.getInt("id"));
                planejamento.setIdClasse(rs.getInt("idClasse"));
                planejamento.setIdProfessor(rs.getInt("idProfessor"));
                planejamento.setNome(rs.getString("nome"));
                
                planejamentos.add(planejamento);
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return planejamentos;
        
    }
    public Planejamento read(int id)
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
        
        Planejamento planejamento;
        planejamento = new Planejamento();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM planejamento WHERE id="+id);
                  
            while(rs.next())
            {
                
                planejamento.setData(rs.getString("data"));
                planejamento.setDescricao(rs.getString("descricao"));
                planejamento.setId(rs.getInt("id"));
                planejamento.setIdClasse(rs.getInt("idClasse"));
                planejamento.setIdProfessor(rs.getInt("idProfessor"));
                planejamento.setNome(rs.getString("nome"));
                
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return planejamento;
        
    }
}
