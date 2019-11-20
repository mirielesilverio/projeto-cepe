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
import model.CategoriaUsuario;
import model.Notas;

public class NotaAccess {
    public void create(Notas nota)
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conexao.prepareStatement("INSERT INTO nota(valor,idProfessor,idDisciplina,idAluno,idAvaliacao)"
                    + "                      VALUES (?,?,?,?,?)");
            stmt.setFloat(1,nota.getValor());
            stmt.setInt(2,nota.getIdProfessor());
            stmt.setInt(3,nota.getIdDisciplina());
            stmt.setInt(4,nota.getIdAluno());
            stmt.setInt(5,nota.getIdAvaliacao());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
        } 
        catch (SQLException ex) {
            
            Logger.getLogger(NotaAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao,stmt);
        }
    }
    public Notas read(int aluno,int av)
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
        Notas nota = new Notas();
        try {    
            rs = stmt.executeQuery("SELECT * FROM nota WHERE idAluno="+aluno+" AND idAValiacao="+av);
            while(rs.next())
            {
                nota.setId(rs.getInt("id"));
                nota.setIdAluno(rs.getInt("idAluno"));
                nota.setIdAvaliacao(rs.getInt("idAValiacao"));
                nota.setIdDisciplina(rs.getInt("idDisciplina"));
                nota.setIdProfessor(rs.getInt("idProfessor"));
                nota.setValor(rs.getFloat("valor"));
                
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return nota;
    }
    public List<Notas> lista(int aluno,int disc)
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
        List<Notas> notas = new ArrayList<>();
        
        try {    
            rs = stmt.executeQuery("SELECT * FROM nota WHERE idAluno="+aluno+" AND idDisciplina="+disc);
            while(rs.next())
            {
                Notas nota = new Notas();
                nota.setId(rs.getInt("id"));
                nota.setIdAluno(rs.getInt("idAluno"));
                nota.setIdAvaliacao(rs.getInt("idAValiacao"));
                nota.setIdDisciplina(rs.getInt("idDisciplina"));
                nota.setIdProfessor(rs.getInt("idProfessor"));
                nota.setValor(rs.getFloat("valor"));
                notas.add(nota);
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fazer consulta","Erro",JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            Conexao.closeConnection(conexao, stmt, rs);
        }
        
        return notas;
    }
    
}
