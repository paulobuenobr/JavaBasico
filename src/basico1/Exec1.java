package basico1;

import basico.Exec;

public class Exec1 {

    public static void main(String[] args) {

        Exec.imprimir("Figueira rumo ao Mundial 2023");

        // Sobrecarga: métodos com mesma assinatura, diferindo no tipo e/ou número de parâmetros

        System.out.println();
        System.out.println("lalala");
        System.out.println(1);
        System.out.println(true);

        int x = somar(3, 2);

        double y = somar(9.5, 8.9);

    }

    // Meus métodos com sobrecarga:
    private static int somar(int a, int b) {
        return a+b;
    }

    private static double somar(double a, double b) {
        return a+b;
    }





}
