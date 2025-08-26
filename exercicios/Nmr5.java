package exercicios;

import java.util.Scanner;

public class Nmr5 {

	public static void main(String[] args) {
		
		Scanner vasco = new Scanner(System.in);
		
		System.out.println("Digite quantos números inteiros você quiser, ao digitar 0 eu mostrarei a soma dos números inteiros digitados");
		
		int count = vasco.nextInt();
		int soma = 0;
		
		while(count != 0) {
			soma += count;
			System.out.print("Digite o próximo número: ");
			count = vasco.nextInt();
		}
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		vasco.close();
		
	}

}
