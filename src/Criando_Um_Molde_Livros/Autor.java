package Criando_Um_Molde_Livros;

public class Autor {

    String nome;
    String email;
    String cpf;

    void mostrarDetalhes(){ //Criação de método
        System.out.println("Mostrar detalhes do autor ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: "+ email);
        System.out.println("CPF: " +cpf);
    }
}
