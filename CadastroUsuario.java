import java.util.ArrayList; // Necessário importar a classe

public class CadastroUsuario {
    // Substituímos o Array fixo por uma lista dinâmica
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Método para adicionar pessoas
    public void adicionar(Usuario cadastro) {
        // O ArrayList não tem um limite fixo de 100, ele cresce conforme o uso
        this.usuarios.add(cadastro);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void imprimirCadastros() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        // Percorremos a lista usando um "for-each", que é mais limpo
        for (Usuario u : usuarios) {
            u.exibirInfor();
        }
    }
}
