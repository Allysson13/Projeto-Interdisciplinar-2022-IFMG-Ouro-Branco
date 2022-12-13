package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import modelos.Atendimento;

public class AtendimentoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirAtendimento(Atendimento a){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Atendimento"
                    + "(data, tipoServico, valor, nomeClente)"
                    + "Values(?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
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
    
    public DefaultListModel<Atendimento> consultaAtendimento(){
        
        DefaultListModel<Atendimento> retorno = null;
        
        try {
            
            retorno =  new DefaultListModel<>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Atendimento ORDER BY data";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Atendimento atual = new Atendimento();
                atual.setData(r.getDate("date"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setValor(r.getDouble("valor"));
                atual.setNomeCliente(r.getString("nomeCliente"));
                retorno.addElement(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public DefaultListModel<Atendimento> RelatorioDiario(){
        
        DefaultListModel<Atendimento> retorno = null;
        
        try{
            
            retorno = new DefaultListModel<>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT data, tipoServico, valor, nomeCliente FROM Gerenciamento_de_Barbearia_BD.Atendimento GROUP BY A.data";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Atendimento atual = new Atendimento();
                atual.setData(r.getDate("date"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setValor(r.getDouble("valor"));
                atual.setNomeCliente(r.getString("nomeCliente"));
                retorno.addElement(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(AtendimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
    
}
