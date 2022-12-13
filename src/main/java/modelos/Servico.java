package modelos;

public class Servico {
    
    //atributos
    
    private String produtos;
    private String tipoServico;
    private String manutencao;
    private String modalidade;
    
    //construtores
    
    public Servico() {
        
    }

    public Servico(String produtos, String tipoServiço, String manutencao, String modalidade) {
        this.produtos = produtos;
        this.tipoServico = tipoServiço;
        this.manutencao = manutencao;
        this.modalidade = modalidade;
    }
    
    //encapsulamento

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getManutencao() {
        return manutencao;
    }

    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }
    
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    //comportamentos

    //toString

    @Override
    public String toString() {
        
        return "Produtos: " + this.produtos + ", Tipo de Serviço: " + this.tipoServico + ", Manutencao: " + this.manutencao + ", Modalidade: " + this.modalidade;
    
    }
    
}
