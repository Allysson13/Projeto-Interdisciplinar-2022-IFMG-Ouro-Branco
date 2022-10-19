package modelos;

public class Servico {
    
    //atributos
    
    private String produtos;
    private String tipoServiço;
    private String manutencao;
    
    //construtores
    
    public Servico() {
        
    }

    public Servico(String produtos, String tipoServiço, String manutencao) {
        this.produtos = produtos;
        this.tipoServiço = tipoServiço;
        this.manutencao = manutencao;
    }
    
    //encapsulamento

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getTipoServiço() {
        return tipoServiço;
    }

    public void setTipoServiço(String tipoServiço) {
        this.tipoServiço = tipoServiço;
    }

    public String getManutencao() {
        return manutencao;
    }

    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }
    
    //comportamentos

    
    
}
