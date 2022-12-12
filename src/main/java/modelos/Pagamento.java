package modelos;

import java.sql.Date;

public class Pagamento {
    
    //atributos
    
    private Date data;
    private String nome;
    private String comprovante;
    private double valor;
    private String formaPag;
    
    //construtores

    public Pagamento() {
    }

    public Pagamento(Date data, String nome, String comprovante, double valor, String formaPag) {
        this.data = data;
        this.nome = nome;
        this.comprovante = comprovante;
        this.valor = valor;
        this.formaPag = formaPag;
    }
    
    //encapsulamento

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
    
    //construtores
    
    
    
}
