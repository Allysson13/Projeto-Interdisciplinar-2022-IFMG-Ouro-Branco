package modelos;

import java.sql.Date;

public class Atendimento {
    
    //atributos
    
    private Date data;
    private Servico servico;
    private Cliente cliente;
    
    //construtores

    public Atendimento(Date data, Servico servico, Cliente cliente) {
        this.data = data;
        this.servico = servico;
        this.cliente = cliente;
    }

    public Atendimento() {
        
    }
    
    //encapsulamento

    public Date getData() {
        return data;
    }

    public Servico getServico() {
        return servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //comportamentos
    
    
    
}
