package modelos;

public class Cliente extends Usuario{
    
    //atributos
    
    private String alergias;
    private String musicaFavorita;
    
    //construtores

    public Cliente() {
        
    }

    public Cliente(String alergias, String musicaFavorita, String nome, int idade, String senha, String email, String tipoUsuario) {
        super(nome, idade, senha, email, tipoUsuario);
        this.alergias = alergias;
        this.musicaFavorita = musicaFavorita;
    }

    
    
    //encapsulamento

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMusicaFavorita() {
        return musicaFavorita;
    }

    public void setMusicaFavorita(String musicaFavorita) {
        this.musicaFavorita = musicaFavorita;
    }
    
    //comportamentos
    
    //toString

    @Override
    public String toString() {
        
        return "Código: " + super.codigo + ", Nome: " + super.nome + ", Idade: " + super.idade + ", Senha: " + super.senha + ", Email: " + super.email + 
               ", User: " + super.tipoUsuario + ", Alergias: " + this.alergias + ", Música Favorita: " + this.musicaFavorita;
    
    }
    
}
