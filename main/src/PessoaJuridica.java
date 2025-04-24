public class PessoaJuridica  extends Pessoa{

    String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String enderco, String telefone, String cnpj, String razaoSocial) {
        super(nome, enderco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

}
