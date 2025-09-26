package application;

import java.util.Scanner;
import uti.ConversorDeMoeda;

public class CalcularDolar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos dólares valem 1 real? ");
		double real = sc.nextDouble();
		
		System.out.print("Quantos dólares você vai comprar? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("\nO quanto que você vai ter que pagar é: R$%.2f", ConversorDeMoeda.Converter(real, quantidade));
		
		sc.close();

	}

}
