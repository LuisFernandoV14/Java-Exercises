package application;

import entities.Product;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner vasco = new Scanner(System.in);
		
		System.out.println("Quantos produtos você quer adicionar ao estoque?");
		int quant = vasco.nextInt();
		
		Product[] lista = new Product[quant];

		for(int i = 0; i < quant; i++) {
			
			lista[i] =  new Product();
			
			System.out.printf("\n");
			
			System.out.println("Qual é o nome do produto " + (i + 1) + "?");
			lista[i].nome = vasco.next();
			
			System.out.println("Qual é a quantidade de " + lista[i].nome + " no estoque?");
			lista[i].quantidade = vasco.nextInt();
			
			System.out.println("Qual é o preço do " + lista[i].nome + "?");
			lista[i].price = vasco.nextDouble();
			
		}
		
		for(int i = 0; i < quant; i++) {
			lista[i].MostrarProduto();
			System.out.printf("\n");
		}
		
		vasco.close();
			
	}

}
