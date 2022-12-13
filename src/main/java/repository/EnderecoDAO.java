package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Endereco;

public class EnderecoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirEndereco(Endereco e){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Endereco"
                    + "(id, cep, bairro, numero)"
                    + "Values(?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getId());
            ps1.setString(2, e.getCep());
            ps1.setString(2, e.getBairro());
            ps1.setString(2, e.getNumero());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<Endereco> consultaEndereco(){
        
        Vector<Endereco> retorno = null;
        
        try {
            
            retorno =  new Vector<Endereco>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Endereco ORDER BY  bairro";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Endereco atual = new Endereco();
                atual.setId(r.getString("id"));
                atual.setCep(r.getString("cep"));
                atual.setBairro(r.getString("bairro"));
                atual.setNumero(r.getString("numero"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public Vector<Endereco> RelatorioGeral(){
        
        Vector<Endereco> retorno = null;
        
        try{
            
            retorno = new Vector<Endereco>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT id FROM Gerenciamento_de_Barbearia_BD.Endereco GROUP BY cep";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Endereco atual = new Endereco();
                atual.setId(r.getString("id"));
                atual.setCep(r.getString("cep"));
                atual.setBairro(r.getString("bairro"));
                atual.setNumero(r.getString("numero"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
