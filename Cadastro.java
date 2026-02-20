import java.util.ArrayList; // Necessário importar a classe

public class Cadastro {
    // Substituímos o Array fixo por uma lista dinâmica
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    // Método para adicionar pessoas
    public void adicionar(Funcionario cadastro) {
        // O ArrayList não tem um limite fixo de 100, ele cresce conforme o uso
        this.funcionarios.add(cadastro);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void imprimirCadastros() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        // Percorremos a lista usando um "for-each", que é mais limpo
        for (Funcionario f : funcionarios) {
            f.exibirInfor();
        }
    }
}