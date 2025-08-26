package entities;
import java.util.Scanner;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String donoDaConta;
	private double valorNaConta;
	
	public ContaBancaria(Scanner sc, char resposta) {
		
		System.out.print("Entre o número da conta: ");
		numeroDaConta = sc.nextInt();
		
		sc.nextLine(); // Limpa o buffer
		
		System.out.print("Entre o nome do dono da conta: ");
		donoDaConta = sc.nextLine();
		
		System.out.print("Deseja começar a conta com um depósito inicial? (y/n)  R: ");
		resposta = sc.next().charAt(0);
		
		if( resposta == 'y') {
			System.out.print("Digite o valor do depósito inicial: ");
			setValorNaConta(sc.nextDouble());
		} else {
			setValorNaConta(0);
		}
		
		System.out.println(this.toString());
		
	}

	public String getDonoDaConta() {
		return donoDaConta;
	}

	public void setDonoDaConta(String donoDaConta) {
		this.donoDaConta = donoDaConta;
	}

	public double getValorNaConta() {
		return valorNaConta;
	}

	public void setValorNaConta(double valorNaConta) {
		if(valorNaConta < 0) {
			System.out.println("Valor de depósito inválido");
			this.valorNaConta = 0;						
		} else {
			this.valorNaConta = valorNaConta;			
		}
	
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void operacao(int escolha, double money) {
		if(escolha == 1) {
			this.fazerDeposito(money);
		} else {
			this.fazerSaque(money);
		}
	}
	
	public void fazerDeposito(double quantidade) {
		
		if(quantidade <= 0) {
			System.out.println("Valor de depósito inválido ou insignificante");
		} else {
			System.out.println("\nForam depositados R$" + String.format("%.2f", quantidade));
			this.valorNaConta += quantidade;			
		}
		
		System.out.println(this.toString());
		
	}
	
	public void fazerSaque(double quantidade) {
		
		if(quantidade <= 0) {
			System.out.println("Valor de depósito inválido ou insignificante");
		} else {
			System.out.println("\nForam sacados R$" + String.format("%.2f", quantidade));
			this.valorNaConta -= quantidade + 5;			
		}
	
		System.out.println(this.toString());
		
	}
	
	public String toString() {
		return "\n"
				+ "Dados da conta:\n"
				+ "Conta número: "
				+ getNumeroDaConta()
				+  ", Dono da conta: "
				+ getDonoDaConta()
				+ ", Saldo: R$"
				+ String.format("%.2f", getValorNaConta());
	}
	
	
	
	
}
