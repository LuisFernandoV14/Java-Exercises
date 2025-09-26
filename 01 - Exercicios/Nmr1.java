package exercicios;

import java.util.Scanner;

public class Nmr1 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int x = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("A soma entre " + x + " e " + y + " é " + soma);
		
		sc.close();

	}

}
