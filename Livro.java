public class Livro{
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo do livro = " + titulo);
        System.out.println("Ano de publicação do livro = " + anoPublicacao);
        System.out.println("Autor do livro = " + autor.getNome());
        System.out.println("Nacionalidade do Autor do livro = " + autor.getNacionalidade());
    }
}