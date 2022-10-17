package modelos;

import java.sql.Date;

public class Atendimento {
    
    //atributos
    
    private Date data;
    private String tipoServico;
    private double valor;
    private String nomeCliente;
    private String musicaFavorita;
    
    //construtores

    public Atendimento() {
    }

    public Atendimento(Date data, String tipoServico, double valor, String nomeCliente, String musicaFavorita) {
        this.data = data;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.musicaFavorita = musicaFavorita;
    }
    
    //encapsulamento

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMusicaFavorita() {
        return musicaFavorita;
    }

    public void setMusicaFavorita(String musicaFavorita) {
        this.musicaFavorita = musicaFavorita;
    }
    
    //comportamentos
    
    
    
}
