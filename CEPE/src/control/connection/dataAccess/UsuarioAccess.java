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
import model.Usuario;

public class UsuarioAccess {
    
    //CRUD (CREATE,UPDATE,DELETE)
    
    public void create(Usuario usuario)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO usuario(categoria,nome,sobrenome,dataNasc,telefone,genero,RG,CPF,estado,cidade,bairro,rua,num,email,senha)"
                    + "                      VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,usuario.getCategoria());
            stmt.setString(2,usuario.getNome());
            stmt.setString(3,usuario.getSobrenome());
            stmt.setString(4,usuario.getDataNasc());
            stmt.setString(5,usuario.getTelefone());
            stmt.setString(6,usuario.getGenero());
            stmt.setString(7,usuario.getRG());
            stmt.setString(8,usuario.getCPF());
            stmt.setInt(9,usuario.getEstado());
            stmt.setInt(10,usuario.getCidade());
            stmt.setString(11,usuario.getBairro());
            stmt.setString(12,usuario.getRua());
            stmt.setInt(13,usuario.getNum());
            stmt.setString(14,usuario.getEmail());
            stmt.setString(15,usuario.getSenha());
           
            
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
    public Usuario read(String email)
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
        
        Usuario usuarioLogado = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE email='"+email+"'");
            
            while(rs.next())
            {
                
                usuarioLogado = new Usuario();
                usuarioLogado.setId(rs.getInt("id"));
                usuarioLogado.setNome(rs.getString("nome"));
                usuarioLogado.setSobrenome(rs.getString("sobrenome"));  
                usuarioLogado.setRG(rs.getString("RG"));
                usuarioLogado.setCPF(rs.getString("CPF"));
                usuarioLogado.setBairro(rs.getString("bairro"));
                usuarioLogado.setCidade(rs.getInt("cidade"));
                usuarioLogado.setEstado(rs.getInt("estado"));
                usuarioLogado.setRua(rs.getString("rua"));
                usuarioLogado.setNum(rs.getInt("num"));
                usuarioLogado.setEmail(rs.getString("email"));
                usuarioLogado.setSenha(rs.getString("senha"));
                usuarioLogado.setTelefone(rs.getString("telefone"));
                usuarioLogado.setDataNasc(rs.getString("dataNasc"));  
                usuarioLogado.setCategoria(rs.getInt("categoria"));  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return usuarioLogado;
    }
    public Usuario read(int id)
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
        
        Usuario usuarioLogado = null;
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE id='"+id+"'");
            
            while(rs.next())
            {
                
                usuarioLogado = new Usuario();
                usuarioLogado.setNome(rs.getString("nome"));
                usuarioLogado.setSobrenome(rs.getString("sobrenome"));  
                usuarioLogado.setRG(rs.getString("RG"));
                usuarioLogado.setCPF(rs.getString("CPF"));
                usuarioLogado.setBairro(rs.getString("bairro"));
                usuarioLogado.setCidade(rs.getInt("cidade"));
                usuarioLogado.setEstado(rs.getInt("estado"));
                usuarioLogado.setRua(rs.getString("rua"));
                usuarioLogado.setNum(rs.getInt("num"));
                usuarioLogado.setEmail(rs.getString("email"));
                usuarioLogado.setSenha(rs.getString("senha"));
                usuarioLogado.setTelefone(rs.getString("telefone"));
                usuarioLogado.setDataNasc(rs.getString("dataNasc"));     
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return usuarioLogado;
    }
    public boolean verifica(String email,String senha)
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
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE email='"+email+"'");
                  
                if(rs.next())
                {
                    if(rs.getString("senha").equals(senha))   
                        return true;
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Senha Inválida");  
                        return false;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Email Inválido");
                    return false;
                }   
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return true;
        
    }
    public int conta()
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
            rs = stmt.executeQuery("SELECT COUNT(*) FROM usuario");
            rs.next();
            return rs.getInt(1);
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return 0;
        
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
        
        List<String> usuarios = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM usuario");
                  
            while(rs.next())
            {
                usuarios.add(rs.getString("nome")+" "+rs.getString("sobrenome"));
            }
            
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return usuarios;
        
    }
    public int pegaId(String email)
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
            rs = stmt.executeQuery("SELECT * FROM usuario WHERE email='"+email+"'");
              
            rs.next();
            return rs.getInt("id");
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        return 0;
    }
}
