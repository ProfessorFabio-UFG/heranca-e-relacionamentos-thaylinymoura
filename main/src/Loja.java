import java.util.ArrayList;
import java.util.List;

public class Loja{

    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    // Métodos
    public void empregarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void demitirFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
    }

    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da loja:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void listarClientes() {
        System.out.println("Clientes da loja:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void listarFornecedores() {
        System.out.println("Fornecedores da loja:");
        for (Fornecedor f : fornecedores) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {

        Loja loja = new Loja();

        // Criando objetos
        Funcionario f1 = new Funcionario("João", "Rua A", "1234", "11111111111", 'M', "Casado", 101, 3000.0, "Vendedor");
        Cliente c1 = new Cliente("Maria", "Rua B", "5678", "22222222222", 'F', "Solteiro", 5000.0, "Moda", "Arquiteta");
        Fornecedor for1 = new Fornecedor("Empresa X", "Av. C", "9999", "33333333333333", "Fornecedor X", "Roupas");

        // Usando métodos da loja
        loja.empregarFuncionario(f1);
        loja.cadastrarCliente(c1);
        loja.cadastrarFornecedor(for1);

        loja.listarFuncionarios();
        loja.listarClientes();
        loja.listarFornecedores();

        loja.demitirFuncionario(f1);
        loja.listarFuncionarios();

    }
}
