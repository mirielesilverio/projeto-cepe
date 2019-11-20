
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
import model.FuncaoProfessor;


public class FuncoesAccess {
    public void create(FuncaoProfessor funcao)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO funcoesprofessor(descricao)"
                    + "                      VALUES (?)");
            stmt.setString(1,funcao.getDesc());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(FuncoesAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    
    public FuncaoProfessor read(int id)
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
        
        FuncaoProfessor funcao = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM funcoesprofessor WHERE id="+id);
            
            while(rs.next())
            {
                
                funcao = new FuncaoProfessor();
                funcao.setDesc(rs.getString("descricao"));
                funcao.setId(rs.getInt("id"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return funcao;
    }
    public List<String> lista()
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
        
        List<String> funcoes = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM funcoesprofessor");
                  
            while(rs.next())
            {
                funcoes.add(rs.getString("descricao"));
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return funcoes;
        
    }
}
