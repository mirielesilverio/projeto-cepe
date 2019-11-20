package control.connection.dataAccess;

import control.connection.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import model.CategoriaUsuario;

public class CategoriaAccess {
    public List<CategoriaUsuario> read()
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
        
        List<CategoriaUsuario> categorias = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM categoriausuario");
            
            while(rs.next())
            {
                CategoriaUsuario categoria = new CategoriaUsuario();

                categoria.setId(rs.getInt("idCategoria"));
                categoria.setNome(rs.getString("nomeCategoria"));

                categorias.add(categoria);  
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return categorias;
    }
}
