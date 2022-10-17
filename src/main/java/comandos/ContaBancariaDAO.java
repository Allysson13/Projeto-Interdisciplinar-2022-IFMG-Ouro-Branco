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
import modelos.ContaBancaria;

public class ContaBancariaDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirContaBancaria(ContaBancaria cb){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.ContaBancaria"
                    + "(codigo, senha, agencia, nome)"
                    + "Values(?, ?, ?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, cb.getCodigo());
            ps1.setString(2, cb.getSenha());
            ps1.setString(2, cb.getAgencia());
            ps1.setString(2, cb.getNome());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ContaBancariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<ContaBancaria> consultaContaBancaria(){
        
        List<ContaBancaria> retorno = null;
        
        try {
            
            retorno =  new ArrayList<ContaBancaria>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.ContaBancaria";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                ContaBancaria atual = new ContaBancaria();
                atual.setCodigo(r.getString("codigo"));
                atual.setSenha(r.getString("senha"));
                atual.setAgencia(r.getString("agencia"));
                atual.setNome(r.getString("nome"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ContaBancariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<ContaBancaria> RelatorioGeral(){
        
        List<ContaBancaria> retorno = null;
        
        try{
            
            retorno = new ArrayList<ContaBancaria>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT nome, agencia FROM Gerenciamento_de_Barbearia_BD.ContaBancaria";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                ContaBancaria atual = new ContaBancaria();
                atual.setCodigo(r.getString("codigo"));
                atual.setSenha(r.getString("senha"));
                atual.setAgencia(r.getString("agencia"));
                atual.setNome(r.getString("nome"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(ContaBancariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}