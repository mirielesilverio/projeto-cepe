package control.connection.dataAccess;

import control.connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Professor;
import model.Usuario;

public class ProfessorAccess {
    static Professor professor;
    public void create(Professor professor)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO professor(idUsuario,disciplina,funcao)"
                    + "                      VALUES (?,?,?)");
            stmt.setInt(1,professor.getId());
            stmt.setInt(2,professor.getMateria());
            stmt.setInt(3,professor.getFuncao());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro finalizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(ProfessorAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public Professor readGeral(int idUsuario,Usuario usuario)
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
        
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM professor WHERE idUsuario="+idUsuario);
            
            //lê até a última linha
            while(rs.next())
            {
                              
                professor = new Professor(usuario);
                
                professor.setIdProfessor(rs.getInt("id"));
                
                professor.setMateria(rs.getInt("disciplina"));
                
                professor.setFuncao(rs.getInt("funcao"));
                
                JOptionPane.showMessageDialog(null,"Logado com sucesso!");
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return professor;
    }
}
