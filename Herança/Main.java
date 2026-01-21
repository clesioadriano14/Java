public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Clesio", 312312312, 9000);
        Gerente g1 = new Gerente(f1.getNome(), f1.getCpf(), f1.getSalario(), "TI");
        System.out.println("Funcionario: ");
        f1.Imprimir();
        System.out.println("Gerente: ");
        g1.Imprimir();
        g1.alterarInformacao("Gomes",44242424, 39939, "TI");
        System.out.println("Dados de Gerente alterados: ");
        g1.Imprimir();
        
    }
}
