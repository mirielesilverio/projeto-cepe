package control.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    //URL (caminho) do banco
    private static final String URL = "jdbc:mysql://localhost/cepe";
    //usuário do banco
    private static final String USER = "root";
    //senha do banco
    private static final String PASS = "";
    
    
    
   public static Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    //encerrando conexão
    public static void closeConnection(Connection conexao)
    {
        if(conexao!=null)
        {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection conexao,Statement stmt)
    {
        
        closeConnection(conexao);
        
        if(stmt!=null)
        {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection conexao,Statement stmt,ResultSet rs)
    {
        closeConnection(conexao,stmt);

        if(rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
