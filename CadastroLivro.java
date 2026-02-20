import java.util.ArrayList;
public class CadastroLivro {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionar(Livro cadastro) {
        this.livros.add(cadastro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void imprimirCadastros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro l : livros) {
            l.exibirInfor();
        }
    }
}