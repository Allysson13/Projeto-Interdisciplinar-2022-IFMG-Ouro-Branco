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
import modelos.Pagamento;

public class PagamentoDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirEndereco(Pagamento e){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Pagamento"
                    + "(data, nome, comprovante, valor, formaPag)"
                    + "Values(?, ?, ?, ?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setDate(1, e.getData());
            ps1.setString(2, e.getNome());
            ps1.setString(2, e.getComprovante());
            ps1.setDouble(2, e.getValor());
            ps1.setString(2, e.getFormaPag());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<Pagamento> consultaEndereco(){
        
        Vector<Pagamento> retorno = null;
        
        try {
            
            retorno =  new Vector<Pagamento>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Pagamento ORDER BY data";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Pagamento atual = new Pagamento();
                atual.setData(r.getDate("data"));
                atual.setNome(r.getString("nome"));
                atual.setComprovante(r.getString("comprovante"));
                atual.setValor(r.getDouble("valor"));
                atual.setFormaPag(r.getString("formaPag"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public Vector<Pagamento> RelatorioGeral(){
        
        Vector<Pagamento> retorno = null;
        
        try{
            
            retorno = new Vector<Pagamento>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT data, valor, formaPag FROM Gerenciamento_de_Barbearia_BD.Pagamento ORDER BY valor";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Pagamento atual = new Pagamento();
                atual.setData(r.getDate("data"));
                atual.setNome(r.getString("nome"));
                atual.setComprovante(r.getString("comprovante"));
                atual.setValor(r.getDouble("valor"));
                atual.setFormaPag(r.getString("formaPag"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(PagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
