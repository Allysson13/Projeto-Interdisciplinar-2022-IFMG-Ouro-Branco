package modelos;

public class Usuario {
    
    //atributos
    
    protected String codigo;
    protected String nome;
    protected int idade;
    protected String senha;
    protected String email;
    protected String tipoUsuario;
    
    //construtores
    
    public Usuario() {
        
    }
    
    public Usuario(String senha, String email) {
        this.senha = senha;
        this.email = email;
    }

    public Usuario(String nome, int idade, String senha, String email, String tipoUsuario) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }
    
    //encapsulamento

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    //comportamentos
    
    //toString
    
    @Override
    public String toString() {
        
        return "Código: " + this.codigo + ", Nome: " + this.nome + ", Idade: " + this.idade + ", Senha: " + this.senha + ", Email: " + this.email + ", User: " + this.tipoUsuario;
    
    }
    
}
