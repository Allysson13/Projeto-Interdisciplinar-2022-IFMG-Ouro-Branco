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
import modelos.Funcionario;

public class FuncionarioDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public boolean inserirEndereco(Funcionario f){
        
        try {
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Funcionario"
                    + "(salario, cargaHoraria)"
                    + "Values(?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setDouble(1, f.getSalario());
            ps1.setDouble(0, f.getCargaHoraria());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public List<Funcionario> consultaEndereco(){
        
        List<Funcionario> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Funcionario>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Funcionario";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Funcionario atual = new Funcionario();
                atual.setSalario(r.getDouble("salario"));
                atual.setCargaHoraria(r.getDouble("cargaHoraria"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
    public List<Funcionario> RelatorioGeral(){
        
        List<Funcionario> retorno = null;
        
        try{
            
            retorno = new ArrayList<Funcionario>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT nome, agencia FROM Gerenciamento_de_Barbearia_BD.Funcionario";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Funcionario atual = new Funcionario();
                atual.setSalario(r.getDouble("salario"));
                atual.setCargaHoraria(r.getDouble("cargaHoraria"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
}
