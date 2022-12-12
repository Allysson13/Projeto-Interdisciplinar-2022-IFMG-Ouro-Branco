package modelos;

public class Cliente {
    
    //atributos
    
    private String alergias;
    private String musicaFavorita;
    
    //construtores

    public Cliente() {
    }

    public Cliente(String alergias, String musicaFavorita) {
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
    
    
    
}
