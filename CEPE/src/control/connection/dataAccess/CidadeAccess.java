package control.connection.dataAccess;

import control.connection.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;

public class CidadeAccess {
    public List<Cidade> read(int idEstado)
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
        
        //cria lista do tipo Cidade que irá armazenar os objetos de cidade
        List<Cidade> cidades = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM cidade WHERE estado="+idEstado);
            
            //lê até a última linha
            while(rs.next())
            {
                //objeto de estado (1 estado)
                Cidade cidade = new Cidade();
                //atributo "id" do objeto recebe o valor da coluna "id" da n-ésima linha do banco
                cidade.setId(rs.getInt("id"));
                //atributo "nome" do objeto recebe o valor da coluna "nome" da n-ésima linha do banco
                cidade.setNome(rs.getString("nome"));
                //atributo "uf" do objeto recebe o valor da coluna "uf" da n-ésima linha do banco
                cidade.setEstado(rs.getInt("estado"));
                
                //adiciona cidade a lista
                cidades.add(cidade);  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return cidades;
    }
    
    public Cidade read(int idEstado,int idCidade)
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
        
        //cria lista do tipo Cidade que irá armazenar os objetos de cidade
        Cidade cidade = new Cidade();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM cidade WHERE id="+idCidade);
            
            while(rs.next())
            {
                cidade.setId(rs.getInt("id"));
                cidade.setNome(rs.getString("nome"));
                cidade.setEstado(rs.getInt("estado"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return cidade;
    }
}
