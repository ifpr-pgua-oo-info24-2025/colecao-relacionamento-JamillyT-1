public class LivroDigital extends Livro {
    
    private double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, int anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }
    
    public double getTamanhoDoArquivoMB(){
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivo (double tamanhoDoArquivoMB){
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo = " + tamanhoDoArquivoMB + "MB");
        System.out.println("Tipo de livro = Digital");
      
    }
}
