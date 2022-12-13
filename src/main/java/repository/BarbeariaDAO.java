package repository;

import main.FabricaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Barbearia;

public class BarbeariaDAO {
    
    //DAO -> sigla para Data Access Object
    
    //metodo para inserir
    public static boolean inserirAtendimento(Barbearia b){
        
        try {
            
            String SQL1 = "INSERT INTO Gerenciamento_de_Barbearia_BD.Barbearia"
                    + "(id, nomeGerente)"
                    + "Values(?, ?);";
            
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setString(1, b.getId());
            ps1.setString(2, b.getNomeGerente());
            
            ps1.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(BarbeariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return false;
        
    }
    
    // -----> SELECT
    // -----> depois faremos o UPDATE
    
    public Vector<Barbearia> consultaBarbearia(){
        
        Vector<Barbearia> retorno = null;
        
        try {
            
            retorno =  new Vector<Barbearia>();
            FabricaBanco c = new FabricaBanco();
            Connection conexao = c.getConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Barbearia ORDER BY nomeGerente";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Barbearia atual = new Barbearia();
                atual.setId(r.getString("id"));
                atual.setNomeGerente(r.getString("nomeGerente"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(BarbeariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
        
    }
    
}
