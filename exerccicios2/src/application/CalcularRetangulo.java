package application;

import entities.Retangulo;
import java.util.Scanner;

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo R1 = new Retangulo();
		
		System.out.print("Digite a altura do retângulo: ");
		R1.height = sc.nextDouble();
		
		System.out.print("Digite a largura do retângulo: ");
		R1.width = sc.nextDouble();
		
		R1.showResults();
		
		sc.close();
	}

}