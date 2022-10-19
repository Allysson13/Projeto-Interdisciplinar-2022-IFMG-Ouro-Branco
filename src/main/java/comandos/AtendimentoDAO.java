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
import modelos.Atendimento;

public class AtendimentoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirAtendimento(Atendimento a){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Atendimento"
                    + "(data, tipoServico, valor, nomeClente, musicaFavorita)"
                    + "Values(?, ?, ?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setDate(1, a.getData());
            ps1.setString(2, a.getTipoServico());
            ps1.setDouble(2, a.getValor());
            ps1.setString(2, a.getNomeCliente());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Atendimento> consultaAtividade(){
        
        List<Atendimento> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Atendimento>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Atendimento";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Atendimento atual = new Atendimento();
                atual.setData(r.getDate("date"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setValor(r.getDouble("valor"));
                atual.setNomeCliente(r.getString("nomeCliente"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Atendimento> RelatorioGeral(){
        
        List<Atendimento> retorno = null;
        
        try{
            
            retorno = new ArrayList<Atendimento>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT data, tipoServico, valor, nomeCliente FROM Gerenciamento_de_Barbearia_BD.Atendimento\n";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Atendimento atual = new Atendimento();
                atual.setData(r.getDate("date"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setValor(r.getDouble("valor"));
                atual.setNomeCliente(r.getString("nomeCliente"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
    
}
