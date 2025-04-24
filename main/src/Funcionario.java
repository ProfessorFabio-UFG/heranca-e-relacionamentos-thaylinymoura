public class Funcionario extends PessoaFisica{

    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String enderco, String telefone, String cpf, char sexo, String estadoCivil, int matricula, double salario, String cargo) {
        super(nome, enderco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String toString() {
        return "Funcionário: " + nome + " - Matrícula: " + matricula;
    }
}
