
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
import model.Presenca;

public class PresencaAccess {
    public void create(Presenca presenca)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO presenca(idChamada,idAluno,situacao)"
                    + "                      VALUES (?,?,?)");
            stmt.setInt(1,presenca.getIdChamada());
            stmt.setInt(2,presenca.getIdAluno());
            stmt.setInt(3,presenca.getSituacao());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(ChamadaAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public Presenca read(int chamada,int aluno)
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
        
        Presenca presenca = null;
        try {    
            rs = stmt.executeQuery("SELECT * FROM presenca WHERE idAluno="+aluno+" AND idChamada="+chamada);
            
            while(rs.next())
            {
                
                presenca = new Presenca();
                
                presenca.setSituacao(rs.getInt("situacao"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return presenca;
    }
}
