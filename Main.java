import java.util.ArrayList;

public class Main {
    public static void main (String [] args){

        Autor autor1 = new Autor("Edgar Allan Poe", "Estadunidense");
        Autor autor2 = new Autor("Arthur Conan Doyle", "Escocês");

        ArrayList <Livro> Biblioteca = new ArrayList<>();

        Biblioteca.add(new LivroFisico("Os Assassinatos na Rua Morgue", 1841, autor1, 96));
        Biblioteca.add(new LivroFisico("Um estudo em vermelho", 1877, autor2, 192));

        Biblioteca.add(new LivroDigital("O gato preto", 1843, autor1, 6.9));
        Biblioteca.add(new LivroDigital("O vale do medo", 1915, autor2, 9.6));

        System.out.println("Minha Biblioteca");
        for(Livro livro : Biblioteca){
            livro.exibirDetalhes();
        }
    }
}
