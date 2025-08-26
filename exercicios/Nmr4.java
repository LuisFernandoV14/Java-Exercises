package exercicios;

import java.util.Scanner;

public class Nmr4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A de B e de C, respectivamente: ");
		System.out.printf("\n");
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		triangulo = (a * c) / 2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = ((a + b) * c) / 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.printf("\nÁrea do Triangulo: %f\nÁrea do Circulo: %f\nÁrea do Trapezio: %f\nÁrea do Quadrado: %f\nÁrea do Retangulo: %f", triangulo, circulo, trapezio, quadrado , retangulo);
		
		sc.close();
		

	}

}
