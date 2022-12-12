package modelos;

import java.sql.Date;

public class Evento {
    
    //atributos
    
    private String nomeConvidados;
    private String fotografo;
    private Double duracao;
    private Date data;
    private String cenario;
    private String alimentacao;
    
    //construtores

    public Evento() {
    }

    public Evento(String nomeConvidados, String fotografo, Double duracao, Date data, String cenario, String alimentacao) {
        this.nomeConvidados = nomeConvidados;
        this.fotografo = fotografo;
        this.duracao = duracao;
        this.data = data;
        this.cenario = cenario;
        this.alimentacao = alimentacao;
    }
    
    //encapsulamento

    public String getNomeConvidados() {
        return nomeConvidados;
    }

    public void setNomeConvidados(String nomeConvidados) {
        this.nomeConvidados = nomeConvidados;
    }

    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
    
    //comportamentos

    
    
}
