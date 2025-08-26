package application;

import entities.Estudantes;

import java.util.Scanner;

public class D_Pensionato {

    public static void main(String[] args) {

        Scanner vasco = new Scanner(System.in);
        boolean[] lista_quartos = new boolean[10];
        Estudantes[] estudantes_clientes = new Estudantes[10];
        int n;

        System.out.print("Quantos quartos serão alugados? \nR: ");
        n = vasco.nextInt();
        vasco.nextLine(); // Limpa buffer

        int i = 0;
        while (i < n) {

            String nome, email; int quarto;

            System.out.println("\nQuartos disponíveis: " + QuartosDisponiveis(lista_quartos));

            System.out.print("Digite o nome do estudante que alugará o quarto: ");
            nome = vasco.nextLine();

            System.out.print("Digite o email do estudante que alugará quarto: ");
            email = vasco.nextLine();

            System.out.print("Digite o número do quarto alugado: ");
            quarto = vasco.nextInt();

            vasco.nextLine(); // Limpa o buffer

            try {
                ChecarDisponibilidade(lista_quartos, quarto);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                continue;
            }

            estudantes_clientes[quarto] = new Estudantes(nome, email, quarto);
            lista_quartos[quarto] = true;

            i++;

        }

        System.out.println();
        ImprimirQuartosAlugados(lista_quartos,  estudantes_clientes);

    }

    public static void ChecarDisponibilidade(boolean[] vetor, int index) throws RuntimeException {
        if (vetor[index]) {throw new RuntimeException("O quarto " + index + " ja foi alugado\n");}
    }

    public static String QuartosDisponiveis(boolean[] vetor) {

        StringBuilder disponiveis = new StringBuilder();

        for (int i = 0; i < vetor.length; i++) {
            if(!vetor[i])
                {disponiveis.append(i).append(" ");}
        }

        return disponiveis.toString();

    }

    public static void ImprimirQuartosAlugados(boolean[] V1, Estudantes[] V2) {

        int count_aluguel = 1;

        for (int i = 0; i < V1.length; i++) {

            if (V1[i]) {

                System.out.println("Aluguel #" + count_aluguel + ":");
                System.out.println(V2[i].toString());
                count_aluguel++;

            }

        }


    }


}
