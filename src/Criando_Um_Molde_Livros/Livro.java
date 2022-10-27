package Criando_Um_Molde_Livros;

public class Livro {  //Caracteristicas de que um liivro deve ter "ATRIBUTOS"

    //Atributos dentro do escopoo da classe, parecem váriaveis mas não são.
    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;

    void mostrarDetalhes(){
    String mensagem = "Mostrando detalhes do livro ";
    System.out.println(mensagem);
    System.out.println(nome);
    System.out.println(descricao);
    System.out.println(valor);
    System.out.println(isbn);
        System.out.println("--");

        //Facilita manutenção do código
        //Crie métodos de formas genéricas e reaproveitáveis.
    }
}
