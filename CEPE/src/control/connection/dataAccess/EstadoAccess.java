package control.connection.dataAccess;

import control.connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Estado;

public class EstadoAccess {
    
    public List<Estado> read()
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
        
        //cria lista do tipo Estado que irá armazenar os objetos de estado
        List<Estado> estados = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM estado");
            
            //lê até a última linha
            while(rs.next())
            {
                //objeto de estado (1 estado)
                Estado estado = new Estado();
                //atributo "id" do objeto recebe o valor da coluna "id" da n-ésima linha do banco
                estado.setId(rs.getInt("id"));
                //atributo "nome" do objeto recebe o valor da coluna "nome" da n-ésima linha do banco
                estado.setNome(rs.getString("nome"));
                //atributo "uf" do objeto recebe o valor da coluna "uf" da n-ésima linha do banco
                estado.setUf(rs.getString("uf"));
                
                //adiciona estado a lista
                estados.add(estado);  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return estados;
    }
    
    public Estado read(int id)
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
        Estado estado = new Estado();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM estado WHERE id="+id);
            
            while(rs.next())
            {
                
                estado.setId(rs.getInt("id"));
                estado.setNome(rs.getString("nome"));
                estado.setUf(rs.getString("uf"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return estado;
    }
    
}
