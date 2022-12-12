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
import modelos.Evento;

public class EventoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirEndereco(Evento e){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Evento"
                    + "(nomeConvidados, nomePadrinhos)"
                    + "Values(?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getNomeConvidados());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Evento> consultaNoivo(){
        
        List<Evento> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Evento>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Evento";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Evento atual = new Evento();
                atual.setNomeConvidados(r.getString("nomeConvidados"));
                atual.setFotografo(r.getString("fotografo"));
                atual.setDuracao(r.getDouble("duracao"));
                atual.setData(r.getDate("data"));
                atual.setCenario(r.getString("cenario"));
                atual.setAlimentacao(r.getString("alimentacao"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Evento> RelatorioGeral(){
        
        List<Evento> retorno = null;
        
        try{
            
            retorno = new ArrayList<Evento>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT nome, agencia FROM Gerenciamento_de_Barbearia_BD.Evento";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Evento atual = new Evento();
                atual.setNomeConvidados(r.getString("nomeConvidados"));
                atual.setFotografo(r.getString("fotografo"));
                atual.setDuracao(r.getDouble("duracao"));
                atual.setData(r.getDate("data"));
                atual.setCenario(r.getString("cenario"));
                atual.setAlimentacao(r.getString("alimentacao"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
