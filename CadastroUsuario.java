public class CadastroUsuario {
    private Usuario[] usuarios = new Usuario[100];
    private int posicao = 0;

    // Método para adicionar pessoas no array
    public void adicionar(Usuario cadastro) {
        // Verifico se ainda há espaço no array
        if (posicao < this.usuarios.length) {
            // Usa o valor atual de 'posicao' como índice e armazena 'cliente' no array
            this.usuarios[posicao] = cadastro;
        } else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais usuários.");
        }
        // Incremento a posição para apontar para o próximo índice disponível, isso
        // garante que a próxima pessoa será adicionada na próxima posição do array
        posicao++;
    }

    public void imprimirCadastros() {
        // A contagem (i) inicia em 0. Em programação, arrays começam a ser contados a
        // partir do índice 0.Verifica a Condição: O loop verifica se i é menor que
        // posicao (ou qtde). Em seguido, incrementa i em 1 a cada iteração (i++).
        // Basicamente, isso significa que o loop excutando o código a seguir continuará
        // enquanto i for menor que o número de pessoas atualmente armazenadas no array.
        for (int i = 0; i < posicao; i++) {
            // Chama o método cumprimentar() para cada objeto Pessoa armazenado no array
            // pessoas. Aqui, o polimorfismo entra em ação: mesmo que o array seja do tipo
            // Pessoa, nenhum método tem o mesmo cumprimento, como no mundo real.
            usuarios[i].exibirInfor();
        }
    }
}