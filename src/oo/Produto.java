package oo;

public class Produto {

    int codigo;
    String nome;
    int quantidade;
    double preco;
    static String marca;

    double calcularValorTotal() {
        return quantidade*preco;
    }

}
