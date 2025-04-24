public class Fornecedor extends PessoaJuridica {

    private String produto;

    public Fornecedor(String nome, String enderco, String telefone, String cnpj, String razaoSocial, String produto) {
        super(nome, enderco, telefone, cnpj, razaoSocial);
        this.produto = produto;
    }

    public String toString() {
        return "Fornecedor: " + nome + " - CNPJ: " +cnpj;
    }
}
