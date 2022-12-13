package modelos;

public class ContaBancaria {
    
    //atributos
    
    private String codigo;
    private String senha;
    private String agencia;
    private String nomeTitular;
    
    //construtores

    public ContaBancaria() {
        
    }

    public ContaBancaria(String codigo, String senha, String agencia, String nome) {
        this.codigo = codigo;
        this.senha = senha;
        this.agencia = agencia;
        this.nomeTitular = nome;
    }
    
    //encapsulamento

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    //comportamenetos
    
    //toString

    @Override
    public String toString() {
        
        return "Codigo: " + this.codigo + ", Senha: " + this.senha + ", Agencia: " + this.agencia + ", Nome: " + this.nomeTitular;
        
    }
    
    
    
}
