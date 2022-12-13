package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Evento;

public class EventoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirEndereco(Evento e){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Evento"
                    + "(nomeConvidados, nomePadrinhos, fotografo, duracao, data, cenario, alimentacao)"
                    + "Values(?, ?, ?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getNomeConvidados());
            ps1.setString(1, e.getFotografo());
            ps1.setDouble(1, e.getDuracao());
            ps1.setDate(1, e.getData());
            ps1.setString(1, e.getCenario());
            ps1.setString(1, e.getAlimentacao());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<Evento> consultaNoivo(){
        
        Vector<Evento> retorno = null;
        
        try {
            
            retorno =  new Vector<Evento>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Evento ORDEY BY data";
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
    
    public Vector<Evento> RelatorioCustos(){
        
        Vector<Evento> retorno = null;
        
        try{
            
            retorno = new Vector<Evento>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT cenario, alimentacao, duracao FROM Gerenciamento_de_Barbearia_BD.Evento GROUP BY alimentacao";
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
