package oo;

public class Procedural {

    public static void main(String[] args) {
        imprimeProduto(1, "Pão", 1.3);
    }


    private static void imprimeProduto(int codigo, String nome, double preco) {
        // imprimir código e nome de um produto
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(preco);
    }

}
