public class Funcionario {
    private String nome;
    private int CPF;
    private String funcao;

public Funcionario(String nome, int CPF, String funcao){
    this.nome = nome;
    this.CPF = CPF;
    this.funcao = funcao;
}


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCPF(){
        return CPF;
    }
    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    
    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public void exibirInfor(){
    System.out.println("Funcionario: " + nome + "/nCPF: " + CPF + "/nFunção: " + funcao);
    System.out.println("-----------------------");
    }
}