package application;

import java.util.Scanner;

public class B_NumerosNegativos {

    public static void main(String[] args) {

        Scanner vasco = new Scanner(System.in);

        System.out.print("Quantos números irá digitar? \nR: ");
        int n = vasco.nextInt();

        int[] vetor_numeros = new int[n];

        for (int i = 0; i < vetor_numeros.length; i++) {

            System.out.print("Digite o valor do próximo número: ");
            vetor_numeros[i] = vasco.nextInt();

            if (vetor_numeros[i] > 0) {vetor_numeros[i] *= (-1);}

        }

        System.out.print("NUMEROS NEGATIVOS: \n");

        for (int vetorNumero : vetor_numeros) {

            if (vetorNumero == 0) {System.out.println(" 0 (Zero não pode ser negativo)");}
            else System.out.println(vetorNumero);

        }

        vasco.close();

    }
}
