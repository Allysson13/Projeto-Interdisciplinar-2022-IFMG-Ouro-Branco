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
import modelos.Servico;

public class ServicoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirEndereco(Servico e){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Servico"
                    + "(produtos, tipoServico, manutencao)"
                    + "Values(?, ?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getProdutos());
            ps1.setString(2, e.getTipoServiço());
            ps1.setString(2, e.getManutencao());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Servico> consultaEndereco(){
        
        List<Servico> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Servico>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Servico";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Servico atual = new Servico();
                atual.setProdutos(r.getString("produtos"));
                atual.setTipoServiço(r.getString("tipoServico"));
                atual.setManutencao(r.getString("manutencao"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Servico> RelatorioGeral(){
        
        List<Servico> retorno = null;
        
        try{
            
            retorno = new ArrayList<Servico>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT nome, agencia FROM Gerenciamento_de_Barbearia_BD.Servico";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Servico atual = new Servico();
                atual.setProdutos(r.getString("produtos"));
                atual.setTipoServiço(r.getString("tipoServico"));
                atual.setManutencao(r.getString("manutencao"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
