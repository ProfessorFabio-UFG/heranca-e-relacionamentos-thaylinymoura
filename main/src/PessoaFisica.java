public class PessoaFisica  extends  Pessoa {

    private String cpf;
    private char sexo;
    private String estadoCivil;


    public PessoaFisica(String nome, String enderco, String telefone, String cpf, char sexo, String estadoCivil) {
        super(nome, enderco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        return "Cliente: " + nome + " - CPF: " + cpf;
    }

}
