public class LivroFisico extends Livro {

    private int numeroDePaginas;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public void setNumeroDePaginas (int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de páginas = " + numeroDePaginas);
        System.out.println("Tipo de livro = Físico");
      
    }
}

