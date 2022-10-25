package comandos;

import com.mycompany.projetobarbearia.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Cliente;

public class ClienteDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirAtendimento(Cliente cl){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Cliente"
                    + "(alergias, musicaFavorita)"
                    + "Values(?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, cl.getAlergias());
            ps1.setString(2, cl.getMusicaFavorita());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Cliente> consultaCliente(){
        
        List<Cliente> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Cliente>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Cliente";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Cliente atual = new Cliente();
                atual.setAlergias(r.getString("alergias"));
                atual.setMusicaFavorita(r.getString("musicaFavorita"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Cliente> RelatorioGeral(){
        
        List<Cliente> retorno = null;
        
        try{
            
            retorno = new ArrayList<Cliente>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT codigo, nome, idade, tipoUsuario FROM Gerenciamento_de_Barbearia_BD.Cliente";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Cliente atual = new Cliente();
                atual.setAlergias(r.getString("alergias"));
                atual.setMusicaFavorita(r.getString("musicaFavorita"));
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
