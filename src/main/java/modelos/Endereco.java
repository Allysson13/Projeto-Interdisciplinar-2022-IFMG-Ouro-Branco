package modelos;

public class Endereco {
    
    //atributos
    
    private String id;
    private String cep;
    private String bairro;
    private String numero;
    
    //contrutores

    public Endereco() {
    }

    public Endereco(String id, String cep, String bairro, String numero) {
        this.id = id;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    //encapsulamento

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    //comportamentos
    
}
