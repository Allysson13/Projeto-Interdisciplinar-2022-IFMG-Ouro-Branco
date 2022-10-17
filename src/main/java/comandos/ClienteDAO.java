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
    public boolean inserirAtendimento(Cliente b){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Cliente"
                    + "(codigo, nome, idade, senha, email, tipoUsuario)"
                    + "Values(?, ?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, b.getCodigo());
            ps1.setString(2, b.getNome());
            ps1.setInt(2, b.getIdade());
            ps1.setString(2, b.getSenha());
            ps1.setString(2, b.getEmail());
            ps1.setString(2, b.getTipoUsuario());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
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
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
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
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
    
}
