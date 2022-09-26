package com.mycompany.projetobarbearia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {
    
    public static void main(String[] args){
        try{
        String comando = "SELECT * FROM Gerenciamento_de_Barbearia_BD";
        Conexao c = new Conexao();
        Connection conexao = c.obterConexao();
        Statement s = conexao.createStatement();
        ResultSet r = s.executeQuery(comando);
        
        while(r.next()){
            
            System.out.println("Disciplina: " + r.getString("disciplina"));
            
        }
        
        conexao.close();
        
        }catch(SQLException ex){
            
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        
    }
    
}
