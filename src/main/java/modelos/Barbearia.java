package modelos;

public class Barbearia {
    
    //atributos
    
    public String id;
    public String nomeGerente;
    
    //construtores 

    public Barbearia() {
        
    }

    public Barbearia(String id, String nomeGerente) {
        this.id = id;
        this.nomeGerente = nomeGerente;
    }
    
    //encapsulamento

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
    
    //comportamentos
    
    //toString

    @Override
    public String toString() {
        
        return "Nome: " + this.nomeGerente + ", ID: " + this.id;
        
    }
    
}
