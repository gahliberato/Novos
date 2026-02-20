import java.util.ArrayList; // Necessário importar a classe

public class CadastroEmprestimo {
    // Substituímos o Array fixo por uma lista dinâmica
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    // Método para adicionar pessoas
    public void adicionar(Emprestimo cadastro) {
        // O ArrayList não tem um limite fixo de 100, ele cresce conforme o uso
        this.emprestimos.add(cadastro);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void imprimirCadastros() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        // Percorremos a lista usando um "for-each", que é mais limpo
        for (Emprestimo e : emprestimos) {
            e.exibirInfor();
        }
    }
}