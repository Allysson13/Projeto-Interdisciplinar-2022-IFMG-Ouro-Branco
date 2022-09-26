package com.mycompany.projetobarbearia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    String link = "jdbc:postgresql://10.90.24.54/aula";
    String usuario = "aula";
    String senha = "aula";
    
    public Connection obterConexao(){
        
        try {
            
            Connection conexao = null;
            
            conexao = DriverManager.getConnection(link, usuario, senha);
            
            return conexao;
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return null;
        
    }
    
}
