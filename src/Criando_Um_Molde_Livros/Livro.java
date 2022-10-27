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
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Isbn" + isbn);
        System.out.println("--");

        //Facilita manutenção do código
        //Crie métodos de formas genéricas e reaproveitáveis.
    }
}
