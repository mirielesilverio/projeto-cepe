/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.Cidade;
import model.Evento;
import model.Usuario;

public class EventoAccess {
    public void create(Evento evento)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO evento(nome,descricao,data,idUsuario,idCategoriaUsuario)"
                    + "                      VALUES (?,?,?,?,?)");
            
            stmt.setString(1,evento.getNome());
            stmt.setString(2,evento.getDescricao());
            stmt.setString(3,evento.getData());
            stmt.setInt(4,evento.getIdUsuario());
            stmt.setInt(5,evento.getIdCategoriaUsuario());
            
           
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(UsuarioAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
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
        
        List<String> eventos = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM evento");
                  
            while(rs.next())
            {
                eventos.add(rs.getString("nome"));
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return eventos;
        
    }
    
     public Evento read(String nome)
    {
        Connection conexao = Conexao.getConnection();
        Statement stmt = null;  
        Evento evento = new Evento();
        
        try {
            stmt = conexao.createStatement();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ex);
        }
        ResultSet rs = null;
        
        Usuario usuarioLogado = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM evento WHERE nome='"+nome+"'");
            
            while(rs.next())
            {
                
                usuarioLogado = new Usuario();
                evento.setNome(rs.getString("nome"));
                evento.setId(rs.getInt("id"));
                evento.setIdUsuario(rs.getInt("idUsuario"));
                evento.setIdCategoriaUsuario(rs.getInt("idCategoriaUsuario"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setData(rs.getString("data"));
                
                
            }
            
        }
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
       return evento;
    }
     
     
     public String  readData(int i)
    {
        Connection conexao = Conexao.getConnection();
        Statement stmt = null;  
        String data = new String();
        
        try {
            stmt = conexao.createStatement();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro:"+ex);
        }
        ResultSet rs = null;
        
       
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM evento WHERE id="+i);
            
            while(rs.next())
            {
              
                data = rs.getString("data");
                
                
            }
            
        }
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
       return data;
    }
     

    
}
