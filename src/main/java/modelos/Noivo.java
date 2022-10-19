package modelos;

public class Noivo {
    
    //atributos
    
    private String nomeConvidados;
    private String nomePadrinhos;
    
    //construtores

    public Noivo() {
    }

    public Noivo(String nomeConvidados, String nomePadrinhos) {
        this.nomeConvidados = nomeConvidados;
        this.nomePadrinhos = nomePadrinhos;
    }
    
    //encapsulamento

    public String getNomeConvidados() {
        return nomeConvidados;
    }

    public void setNomeConvidados(String nomeConvidados) {
        this.nomeConvidados = nomeConvidados;
    }

    public String getNomePadrinhos() {
        return nomePadrinhos;
    }

    public void setNomePadrinhos(String nomePadrinhos) {
        this.nomePadrinhos = nomePadrinhos;
    }
    
    //comportamentos
    
}
