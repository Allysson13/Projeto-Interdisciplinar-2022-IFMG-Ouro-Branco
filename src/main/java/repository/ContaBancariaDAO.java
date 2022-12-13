package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.ContaBancaria;

public class ContaBancariaDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirContaBancaria(ContaBancaria cb){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.ContaBancaria"
                    + "(codigo, senha, agencia, nome)"
                    + "Values(?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, cb.getCodigo());
            ps1.setString(2, cb.getSenha());
            ps1.setString(2, cb.getAgencia());
            ps1.setString(2, cb.getNomeTitular());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ContaBancariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<ContaBancaria> consultaContaBancaria(){
        
        Vector<ContaBancaria> retorno = null;
        
        try {
            
            retorno =  new Vector<ContaBancaria>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.ContaBancaria ORDER BY nome";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                ContaBancaria atual = new ContaBancaria();
                atual.setCodigo(r.getString("codigo"));
                atual.setSenha(r.getString("senha"));
                atual.setAgencia(r.getString("agencia"));
                atual.setNomeTitular(r.getString("nome"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ContaBancariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public Vector<ContaBancaria> RelatorioAgencias(){
        
        Vector<ContaBancaria> retorno = null;
        
        try{
            
            retorno = new Vector<ContaBancaria>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT nome, codigo FROM Gerenciamento_de_Barbearia_BD.ContaBancaria GROUP BY  agencia";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                ContaBancaria atual = new ContaBancaria();
                atual.setCodigo(r.getString("codigo"));
                atual.setSenha(r.getString("senha"));
                atual.setAgencia(r.getString("agencia"));
                atual.setNomeTitular(r.getString("nome"));
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