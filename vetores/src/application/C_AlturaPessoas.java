package application;

import entities.*;
import java.util.Scanner;

public class C_AlturaPessoas {

    public static void main(String[] args) {

        Scanner vasco = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? \nR: ");
        int n =  vasco.nextInt();

        Pessoas[] vetorPessoas = new Pessoas[n];


        for (int i = 0; i < vetorPessoas.length; i++) {

            String nome; double altura; int idade;

            vasco.nextLine(); // Limpa o buffer

            System.out.print("Digite o nome da " + (i+1) + "° pessoa: ");
            nome = vasco.nextLine();

            System.out.print("Digite a idade da " + (i+1) + "° pessoa: ");
            idade = vasco.nextInt();

            System.out.print("Digite a altura da " + (i+1) + "° pessoa: ");
            altura = vasco.nextDouble();

            vetorPessoas[i] = new Pessoas(nome, altura, idade);

        }

        vasco.nextLine(); // Limpa buffer

        double media_altura = 0, idade_menor_16 = 0;
        Pessoas[] pessoas_menor_16 = new Pessoas[vetorPessoas.length];

        for (int i = 0; i < vetorPessoas.length; i++) {

            System.out.print("\nDados da pessoa " + (i + 1) + ": \n" + vetorPessoas[i].toString());

            media_altura += vetorPessoas[i].getAltura();

            if(vetorPessoas[i].getIdade() < 16) {

                idade_menor_16 += 1;
                pessoas_menor_16[i] = new Pessoas(vetorPessoas[i].getNome(), vetorPessoas[i].getAltura(), vetorPessoas[i].getIdade());
                //pessoas_menor_16[i] = vetorPessoas[i];

            }

        }

        media_altura /= vetorPessoas.length;
        idade_menor_16 = idade_menor_16 * 100 / vetorPessoas.length;

        System.out.printf("\nAltura média: %.2f metros\n", media_altura);
        System.out.printf("Pessoas com menos de 16 são %.2f%%, sendo elas: \n", idade_menor_16);

        for (int i = 0; pessoas_menor_16[i] != null; i++) {
            System.out.println(pessoas_menor_16[i].toString());
        }

        vasco.close();

    }
}
