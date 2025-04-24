public class Cliente extends  PessoaFisica {

    private double renda;
    private String interesse;
    private String profissao;

    public Cliente(String nome, String enderco, String telefone, String cpf, char sexo, String estadoCivil, double renda, String interesse, String profissao) {
        super(nome, enderco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesse = interesse;
        this.profissao = profissao;
    }




}
