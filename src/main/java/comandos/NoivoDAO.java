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
import modelos.Noivo;

public class NoivoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirEndereco(Noivo e){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Noivo"
                    + "(nomeConvidados, nomePadrinhos)"
                    + "Values(?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getNomeConvidados());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(NoivoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Noivo> consultaNoivo(){
        
        List<Noivo> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Noivo>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Noivo";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Noivo atual = new Noivo();
                atual.setNomeConvidados(r.getString("nomeConvidados"));
                atual.setNomePadrinhos(r.getString("nomePadrinhos"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(NoivoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Noivo> RelatorioGeral(){
        
        List<Noivo> retorno = null;
        
        try{
            
            retorno = new ArrayList<Noivo>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT nome, agencia FROM Gerenciamento_de_Barbearia_BD.Noivo";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Noivo atual = new Noivo();
                atual.setNomeConvidados(r.getString("nomeConvidados"));
                atual.setNomePadrinhos(r.getString("nomePadrinhos"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(NoivoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
