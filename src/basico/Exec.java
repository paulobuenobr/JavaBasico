package basico;

import java.util.Date;

public class Exec {

    public static void main(String[] args) {
        //System.out.println("Eu sou um programador Java");
        int x = 10;
        int y = 20;

        int soma = somar(x, y);
        System.out.println("Soma: " + soma);

        double w = 10;
        double z = 20;

        double divisao = dividir(w, z);
        System.out.println("Divisao: " + divisao);

        double divisaoInt = dividir(x, y);
        System.out.println("Divisao: " + divisaoInt);

        imprimir("Avaí rumo ao Mundial 2022");

        Date data = new Date();

    }

    public static int somar(int x, int y) {
        return x + y;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void imprimir(String frase) {
        System.out.println("A frase a imprimir é: "+frase);
    }

}
