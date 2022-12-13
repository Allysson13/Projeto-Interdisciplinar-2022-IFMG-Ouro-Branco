package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Servico;

public class ServicoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirEndereco(Servico e){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Servico"
                    + "(produtos, tipoServico, manutencao, modalidade)"
                    + "Values(?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, e.getProdutos());
            ps1.setString(2, e.getTipoServico());
            ps1.setString(2, e.getManutencao());
            ps1.setString(2, e.getModalidade());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<Servico> consultaEndereco(){
        
        Vector<Servico> retorno = null;
        
        try {
            
            retorno =  new Vector<Servico>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Servico ORDER BY modalidade";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Servico atual = new Servico();
                atual.setProdutos(r.getString("produtos"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setManutencao(r.getString("manutencao"));
                atual.setModalidade(r.getString("modalidade"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public Vector<Servico> RelatorioModalidade(){
        
        Vector<Servico> retorno = null;
        
        try{
            
            retorno = new Vector<Servico>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT produtos, manutencao, modalidade FROM Gerenciamento_de_Barbearia_BD.Servico GROUP BY modalidade";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Servico atual = new Servico();
                atual.setProdutos(r.getString("produtos"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setManutencao(r.getString("manutencao"));
                atual.setModalidade(r.getString("modalidade"));
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
