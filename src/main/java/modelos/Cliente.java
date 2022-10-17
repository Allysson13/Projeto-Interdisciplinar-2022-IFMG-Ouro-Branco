package modelos;

public class Cliente {
    
    //atributos
    
    private String codigo;
    private String nome;
    private int idade;
    private String senha;
    private String email;
    private String tipoUsuario;
    
    //construtores

    public Cliente(String codigo, String nome, int idade, String senha, String email, String tipoUsuario) {
        this.codigo = codigo;
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
    
    
    
}
