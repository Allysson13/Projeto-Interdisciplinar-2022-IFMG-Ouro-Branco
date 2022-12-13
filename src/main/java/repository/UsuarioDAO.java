package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Usuario;

public class UsuarioDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirPerfil(Usuario u) {
        
        try {
            String SQL1 = "INSERT INTO \"Gerenciamento_de_Barbearia_BD\".\"Usuario\""
                    + "(nome, idade, senha, email, tipoUsuario)"
                    + "Values(?, ?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL1);
            transacao.setString(1, u.getNome());
            transacao.setInt(2, u.getIdade());
            transacao.setString(3, u.getSenha());
            transacao.setString(4, u.getEmail());
            transacao.setString(5, u.getTipoUsuario());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    public static boolean inserirUsuario(Usuario u){
        
        try {
            String SQL1 = "INSERT INTO \"Gerenciamento_de_Barbearia_BD\".\"Usuario\""
                    + "(senha, email)"
                    + "Values(?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL1);
            transacao.setString(1, u.getSenha());
            transacao.setString(2, u.getEmail());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    public static boolean deletaUsuario(Usuario u) {
        
        try {
	
            String SQL1 = "DELETE FROM \"Gerenciamento_de_Barbearia_BD\".\"Usuario\""
                    + "WHERE email=? and senha=?;";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement transacao = conexao.prepareStatement(SQL1);
            transacao.setString(1, u.getEmail());
            transacao.setString(2, u.getSenha());
            
            transacao.execute();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public static Vector<Usuario> consultaUsuario(){
        
        Vector<Usuario> retorno = null;
        
        try {
            
            retorno =  new Vector<>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM \"Gerenciamento_de_Barbearia_BD\".\"Usuario\" ORDER BY tipoUsuario";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Usuario atual = new Usuario();
                atual.setCodigo(r.getString("codigo"));
                atual.setNome(r.getString("nome"));
                atual.setIdade(r.getInt("idade"));
                atual.setSenha(r.getString("senha"));
                atual.setEmail(r.getString("email"));
                atual.setTipoUsuario(r.getString("tipousUario"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public static Vector<Usuario> RelatorioTipoUsuario(){
        
        Vector<Usuario> retorno = null;
        
        try{
            
            retorno = new Vector<>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT codigo, email, tipoUsuario FROM Gerenciamento_de_Barbearia_BD.Usuario ORDER BY tipoUsuario";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Usuario atual = new Usuario();
                atual.setCodigo(r.getString("codigo"));
                atual.setNome(r.getString("nome"));
                atual.setIdade(r.getInt("idade"));
                atual.setSenha(r.getString("senha"));
                atual.setEmail(r.getString("email"));
                atual.setTipoUsuario(r.getString("tipousUario"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
    
}
