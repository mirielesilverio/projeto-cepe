
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
import model.Materias;

public class MateriasAccess {
    public void create(Materias materia)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO disciplinas(nome)"
                    + "                      VALUES (?)");
            stmt.setString(1,materia.getNome());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(MateriasAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    
    public Materias read(int id)
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
        
        Materias materia = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM disciplinas WHERE id="+id);
            
            while(rs.next())
            {
                
                materia = new Materias();
                materia.setId(rs.getInt("id"));
                materia.setNome(rs.getString("nome"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return materia;
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
        
        List<String> materias = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM disciplinas");
                  
            while(rs.next())
            {
                materias.add(rs.getString("nome"));
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return materias;
        
    }
}
