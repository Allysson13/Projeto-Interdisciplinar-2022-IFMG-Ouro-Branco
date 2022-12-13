package modelos;

public class Funcionario extends Usuario{
    
    //atributos
    
    private double salario;
    private double cargaHoraria;
    
    //construtores

    public Funcionario() {
        
    }

    public Funcionario(double salario, double cargaHoraria, String nome, int idade, String senha, String email, String tipoUsuario) {
        super(nome, idade, senha, email, tipoUsuario);
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
    
    public void aumentaSalario(double salario){
        
        this.salario += salario;
        
    }
    
    //toString

    @Override
    public String toString() {
        
        return "Código: " + super.codigo + ", Nome: " + super.nome + ", Idade: " + super.idade + ", Senha: " + super.senha + ", Email: " + super.email + 
               ", User: " + super.tipoUsuario + "Salario: " + this.salario + ", Carga Horaria: " + this.cargaHoraria;
        
    }
    
}
