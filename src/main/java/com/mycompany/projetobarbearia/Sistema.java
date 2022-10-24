package com.mycompany.projetobarbearia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sistema {
    
    //atributos
    
    private String nome;
    private String linkDownload;
    
    //construtores

    public Sistema() {
    }

    public Sistema(String nome, String linkDownload) {
        this.nome = nome;
        this.linkDownload = linkDownload;
    }
    
    //encapsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }
    
    //comportamentos
    
    
    
    public static void Teste(){
        
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
            
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        
    }
    
    public static void main(String[] args){
        
        
        
    }
    
}