package comandos;

import com.mycompany.projetobarbearia.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
                    + "Values(?, ?, ?);";
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement ps1 = conexao.prepareStatement(SQL1);
            ps1.setDate(1, a.getData());
            ps1.setString(2, a.getTipoServico());
            ps1.setDouble(2, a.getValor());
            ps1.setString(2, a.getNomeCliente());
            ps1.setString(2, a.getMusicaFavorita());
            
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
        
        Scanner entrada = new Scanner(System.in);
        
        List<Atendimento> retorno = null;
        
        try {
            
            retorno =  new ArrayList<Atendimento>();
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            String SQL = "SELECT * FROM Gerenciamento_de_Barbearia_BD.Atendimento";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                System.out.println("Informe o ano do atendimento: ");
                int ano = entrada.nextInt();
                
                System.out.println("Informe o mes do atendimento: ");
                int mes = entrada.nextInt();
                
                System.out.println("Informe o dia do atendimento: ");
                int dia = entrada.nextInt();
                
                Date data = new Date(ano, mes, dia);
                
                System.out.println("Informe o tipo do servico: ");
                String tipoServico = entrada.next();
                
                System.out.println("Informe o valor do atendimento: ");
                double valor = entrada.nextDouble();
                
                System.out.println("Informe o nome do cliente: ");
                String nome = entrada.next();
                
                System.out.println("Informe a sua música favorita: ");
                String musica = entrada.next();
                
                Atendimento atual = new Atendimento();
                atual.setData(data);
                atual.setTipoServico(tipoServico);
                atual.setValor(valor);
                atual.setNomeCliente(nome);
                atual.setMusicaFavorita(musica);
                
                
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
            String SQL = "SELECT data, tipoServico, valor, nomeCliente, musicaFavorita FROM Gerenciamento_de_Barbearia_BD.Atendimento\n";
            PreparedStatement ps = conexao.prepareStatement(SQL);
            ResultSet r = ps.executeQuery();
            
            while(r.next()){
                
                Atendimento atual = new Atendimento();
                atual.setData(r.getDate("date"));
                atual.setTipoServico(r.getString("tipoServico"));
                atual.setValor(r.getDouble("valor"));
                atual.setNomeCliente(r.getString("nomeCliente"));
                atual.setMusicaFavorita(r.getString("musicaFavorita"));
                retorno.add(atual);
                
            }
            
            conexao.close();
            
        }catch(SQLException ex){
            
            Logger.getLogger(BarbeariaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
        return retorno;
    }
    
}
