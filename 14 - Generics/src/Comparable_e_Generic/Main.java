package Comparable_e_Generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         // --- Exemplo 1: Integers ---
        CaixaOrdenada<Integer> caixaInt = new CaixaOrdenada<>();
        caixaInt.adicionar(5);
        caixaInt.adicionar(2);
        caixaInt.adicionar(9);
        caixaInt.adicionar(2);
        caixaInt.adicionar(7);

        System.out.println("Lista original de Integers:");
        caixaInt.mostrar();

        caixaInt.ordenar();
        System.out.println("\nLista ordenada de Integers:");
        caixaInt.mostrar();

        System.out.println("\nMaior elemento:");
        Integer maior = caixaInt.maiorElemento();
        System.out.println(maior);

        System.out.println("\nLista de elementos únicos:");
        ArrayList<Integer> unicos = caixaInt.elementosUnicos();
        System.out.println(unicos);

        // --- Exemplo 2: Strings ---
        CaixaOrdenada<String> caixaStr = new CaixaOrdenada<>();
        caixaStr.adicionar("banana");
        caixaStr.adicionar("uva");
        caixaStr.adicionar("maçã");
        caixaStr.adicionar("banana");

        System.out.println("\nLista original de Strings:");
        caixaStr.mostrar();

        caixaStr.ordenar();
        System.out.println("\nLista ordenada de Strings:");
        caixaStr.mostrar();

        System.out.println("\nMaior elemento:");
        String maiorB = caixaStr.maiorElemento();
        System.out.println(maiorB);

        System.out.println("\nLista de elementos únicos:");
        ArrayList<String> unicosStr = caixaStr.elementosUnicos();
        System.out.println(unicosStr);

        // --- Exemplo 3: Comparando caixas ---
        CaixaOrdenada<Integer> caixa1 = new CaixaOrdenada<>();
        caixa1.adicionar(3);
        caixa1.adicionar(4);

        CaixaOrdenada<Integer> caixa2 = new CaixaOrdenada<>();
        caixa2.adicionar(5);
        caixa2.adicionar(1);

        int cmp = caixa1.compareTo(caixa2);
        System.out.println("\nComparação de caixas (tamanho): ");

        switch (cmp) {

            case 0 -> System.out.print("As caixas têm o mesmo tamanho");
            case 1 -> System.out.print("A caixa " + caixa1 + " é maior");
            case -1 -> System.out.print("A caixa " + caixa2 + " é maior");

            default -> System.out.print("Unexpected value: " + cmp);
        }

    }
}


