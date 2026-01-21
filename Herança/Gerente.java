public class Gerente extends Funcionario{
    
    private String setorResponsavel;
    Gerente(String nome_p, int cpf_p, double salario_p, String setorResponsavel_p){
        super(nome_p, cpf_p, salario_p);
        this.setorResponsavel = setorResponsavel_p;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }
    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }
    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Setor: "+ getSetorResponsavel());
    }

    public void alterarInformacao(String nome_p, int cpf_p, double salario_p, String novoSetorResponsavel){
        setNome(nome_p);
        setCpf(cpf_p);
        setSalario(salario_p);
        setSetorResponsavel(novoSetorResponsavel);
    }

    @Override
    public double getBonificacao(){
        return (getSalario() * 0.15) + 1000;
    }
}
