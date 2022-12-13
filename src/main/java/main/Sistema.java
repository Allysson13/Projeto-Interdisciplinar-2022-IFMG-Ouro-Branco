package main;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import telas.Opções;

public class Sistema{
    
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
    
    
    
    public static void teste(){
        
        Connection conexaoBanco = FabricaBanco.getConexao();
        
        try {
            
            if(!conexaoBanco.isClosed()){
                
                System.out.println("Sucesso!!! :D");
                
            }else{
                
                System.out.println("Erro :(");
                
            }
            
        } catch (SQLException err) {
            
            JOptionPane.showMessageDialog(null, "Erro no momento da conexão com o banco: " + err.getMessage(), "Status da conexão", JOptionPane.WARNING_MESSAGE);
            
        }
        
    }
    
    public static void main(String[] args){
        
        teste();
        Opções.main(args);
        
    }
    
}