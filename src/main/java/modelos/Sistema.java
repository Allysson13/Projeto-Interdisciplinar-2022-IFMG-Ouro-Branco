package modelos;

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
    
    
    
}
