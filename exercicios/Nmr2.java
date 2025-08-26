package exercicios;

import java.util.Scanner;

public class Nmr2 {

	public static void main(String[] args) {
		
		Scanner tome = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		
		int raio = tome.nextInt();
		
		double pi = 3.14159;
		
		double area = (double) pi * (Math.pow(raio, 2));

		System.out.printf("A área de um círculo com raio %d é %.4f", raio, area);
		
		tome.close();
		
	}

}
