public class Funcionario {

    protected String nome; 
    protected int cpf;
    protected double salario;


    Funcionario(String nome, int cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void Imprimir(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Salario: "+ getSalario());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Bonificacao: "+ getBonificacao());
    }

    public double getBonificacao() {
        return getSalario() * 0.10;
    }

}
