package modelos;

public class Gerente extends Usuario{
    
    //atributos
    
    private String cpf;
    
    //construtores

    public Gerente() {
        
    }

    public Gerente(String cpf) {
        this.cpf = cpf;
    }

    public Gerente(String cpf, String nome, int idade, String senha, String email, String tipoUsuario) {
        super(nome, idade, senha, email, tipoUsuario);
        this.cpf = cpf;
    }
    
    //encapsulamento

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //comportamentos
    
    //toString

    @Override
    public String toString() {
        
        return "Código: " + super.codigo + ", Nome: " + super.nome + ", Idade: " + super.idade + ", Senha: " + super.senha + ", Email: " + super.email + 
               ", User: " + super.tipoUsuario + "CPF:" + this.cpf;
        
    }
    
    
    
    
}
