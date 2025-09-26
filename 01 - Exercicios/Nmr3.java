package exercicios;

import java.util.Scanner;

public class Nmr3 {

	public static void main(String[] args) {
		
		Scanner botafogo = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		int numero = botafogo.nextInt();
		
		System.out.print("Digite o valor que esse funcionário recebe por hora: ");
		int valor = botafogo.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		int horas = botafogo.nextInt();
		
		double resultado = (double) valor * horas;
		
		System.out.printf("\nNúmero do funcionário: %d\nSalário do funcionário: R$%.2f", numero, resultado);

	}

}
