package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
	
		char resposta = 0; int operacao; double money;	boolean continuar = true;
		Scanner vasco = new Scanner(System.in);
		ContaBancaria conta_1 = new ContaBancaria(vasco, resposta);
		
		while (continuar) {
			
			System.out.print("\nDeseja fazer alguma operação? (y/n)  R: ");
			resposta = vasco.next().charAt(0);
			
			if (resposta == 'y') {
				
				System.out.print("\nQual operação deseja realizar?\n1 - Depósito\n2 - Saque\n\nR: ");
				operacao = vasco.nextInt();
				
				if(operacao == 1) {
					
					System.out.println("Quantos reais você quer depositar?");
					money = vasco.nextDouble();
					
					conta_1.operacao(operacao, money);
				
				} else if (operacao == 2) {
					
					System.out.println("Quantos reais você quer sacar?");
					money = vasco.nextDouble();
					
					conta_1.operacao(operacao, money);
				
				}
				
			} else {
				continuar = false;
			}
		}
		
		
		
	}
}
	