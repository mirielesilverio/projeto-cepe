
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
import model.Chamada;

public class ChamadaAccess {
    public void create(Chamada chamada)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO chamada(idClasse,idProfessor,idDisciplina,data,horario)"
                    + "                      VALUES (?,?,?,?,?)");
            stmt.setInt(1,chamada.getIdClasse());
            stmt.setInt(2,chamada.getIdProfessor());
            stmt.setInt(3,chamada.getIdDisciplina());
            stmt.setString(4,chamada.getData());
            stmt.setString(5,chamada.getHorario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public int pegaId(String horario,int idProfessor,String data)
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
        
        int id = 0;
        try {    
            rs = stmt.executeQuery("SELECT * FROM chamada WHERE horario='"+horario+"' AND data='"+data+"' AND idProfessor="+idProfessor);
            
            while(rs.next())
            {
                
                id = rs.getInt("id");
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return id;
    }
    public List<Chamada> read(int idProfessor,int turma,String data)
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
        
        Chamada chamada = null;
        List<Chamada> chamadas = new ArrayList<>();
        try {    
            rs = stmt.executeQuery("SELECT * FROM chamada WHERE idClasse="+turma+" AND idProfessor="+idProfessor+" AND data='"+data+"'");
            
            while(rs.next())
            {
                
                chamada = new Chamada();
                chamada.setId(rs.getInt("id"));
                chamada.setData(rs.getString("data"));
                chamada.setIdClasse(rs.getInt("idClasse"));
                chamada.setIdDisciplina(rs.getInt("idDisciplina"));
                chamada.setIdProfessor(rs.getInt("idProfessor"));
                chamada.setHorario(rs.getString("horario"));
                chamadas.add(chamada);
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return chamadas;
    }
    public Chamada read(int id)
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
        
        Chamada chamada = null;
        try {    
            rs = stmt.executeQuery("SELECT * FROM chamada WHERE id="+id);
            
            while(rs.next())
            {
                
                chamada = new Chamada();
                chamada.setId(rs.getInt("id"));
                chamada.setData(rs.getString("data"));
                chamada.setIdClasse(rs.getInt("idClasse"));
                chamada.setIdDisciplina(rs.getInt("idDisciplina"));
                chamada.setIdProfessor(rs.getInt("idProfessor"));
                chamada.setHorario(rs.getString("horario"));
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return chamada;
    }
}
