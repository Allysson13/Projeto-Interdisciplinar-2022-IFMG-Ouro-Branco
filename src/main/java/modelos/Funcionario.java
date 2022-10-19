package modelos;

public class Funcionario extends Usuario{
    
    //atributos
    
    private double salario;
    private double cargaHoraria;
    
    //construtores

    public Funcionario() {
    }

    public Funcionario(double salario, double cargaHoraria) {
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(double salario, double cargaHoraria, String codigo, String nome, int idade, String senha, String email, String tipoUsuario) {
        super(codigo, nome, idade, senha, email, tipoUsuario);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    //encapsulamento

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    //comportamentos
    
    
    
}
