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
import model.Aluno;
import model.Usuario;

public class AlunoAccess {
    static Aluno aluno;
    public void create(Aluno aluno)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO aluno(idUsuario,RA,classe)"
                    + "                      VALUES (?,?,?)");
            stmt.setInt(1,aluno.getId());
            stmt.setString(2,aluno.getRa());
            stmt.setInt(3,aluno.getClasse());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro finalizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(AlunoAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public Aluno read(int id)
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
            rs = stmt.executeQuery("SELECT * FROM aluno WHERE id="+id);
            
            //lê até a última linha
            while(rs.next())
            {
              
                UsuarioAccess usuarioAc = new UsuarioAccess();
                Usuario usuario = new Usuario();
                
                usuario = usuarioAc.read(rs.getInt("id"));
                
                aluno = new Aluno(usuario);
                
                aluno.setIdAluno(rs.getInt("id"));
                
                aluno.setRa(rs.getString("RA"));
                
                aluno.setClasse(rs.getInt("classe"));

                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return aluno;
    }
    public Aluno readGeral(int idUsuario,Usuario usuario)
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
            rs = stmt.executeQuery("SELECT * FROM aluno WHERE idUsuario="+idUsuario);
            
            //lê até a última linha
            while(rs.next())
            {
                              
                aluno = new Aluno(usuario);
                
                aluno.setIdAluno(rs.getInt("id"));
                
                aluno.setRa(rs.getString("RA"));
                
                aluno.setClasse(rs.getInt("classe"));
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
        
        return aluno;
    }
    public int pegaId(String RA)
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
        int id=0;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM aluno WHERE RA='"+RA+"'");
            
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
    public List<Aluno> lista()
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
        
        List<Aluno> alunos = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM aluno");
            
            //lê até a última linha
            while(rs.next())
            {
              
                UsuarioAccess usuarioAc = new UsuarioAccess();
                Usuario usuario = new Usuario();
                
                usuario = usuarioAc.read(rs.getInt("id"));
                
                aluno = new Aluno(usuario);
                
                aluno.setIdAluno(rs.getInt("id"));
                
                aluno.setRa(rs.getString("RA"));
                
                aluno.setClasse(rs.getInt("classe"));

                alunos.add(aluno);  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return alunos;
    }
    public List<Aluno> lista(int classe)
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
        
        List<Aluno> alunos = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM aluno WHERE classe="+classe);
            
            //lê até a última linha
            while(rs.next())
            {
              
                UsuarioAccess usuarioAc = new UsuarioAccess();
                Usuario usuario = new Usuario();
                
                usuario = usuarioAc.read(rs.getInt("idUsuario"));
                
                aluno = new Aluno(usuario);
                
                aluno.setIdAluno(rs.getInt("id"));
                
                aluno.setRa(rs.getString("RA"));
                
                aluno.setClasse(rs.getInt("classe"));

                alunos.add(aluno);  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return alunos;
    }
}
