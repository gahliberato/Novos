public class Livro {
    private int id;
    private int qtEstoque;
    private String titulo;
    private String genero;
    private boolean reserva, disponibilidade;

    public Livro(int id, int qtEstoque, String titulo, String genero, boolean reserva, boolean disponibildade){
        this.id = id;
        this.qtEstoque = qtEstoque;
        this.titulo = titulo;
        this.genero = genero;
        this.reserva = false;
        this.disponibilidade = true;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getQtEstoque(){
        return qtEstoque;
    }
    public void setQtEstoque(int qtEstoque){
        this.qtEstoque = qtEstoque;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean getReserva(){
        return reserva;
    }
    public void setGenero(boolean reserva){
        this.reserva = reserva;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }

    public void exibirInfor(){
        System.out.println("Livro: " + titulo + "/nId: " + id + "/nGênero: " + genero + "/nQuantidade  em estoque: " + qtEstoque + "/nReserva(s): " + reserva + "/nDisponível? " + disponibilidade); 
        System.out.println("-----------------------");
        }
}
