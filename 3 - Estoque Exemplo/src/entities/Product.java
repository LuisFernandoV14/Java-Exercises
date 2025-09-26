package entities;

public class Product {
	public String nome;
	public double price;
	public int quantidade;
	
	public void MostrarProduto() {
		System.out.printf("Nome: %s\nPreço: R$%.2f\nQuantidade: %d\nPreço total do estoque: R$%.2f\n", nome, price, quantidade, (double)quantidade * price);
	}
	
	public void AdicionarProdutos(int nmr) {
		quantidade += nmr;
		System.out.printf("\nForam adicionados %d %s ao estoque!\n", nmr, nome);
	}
	
	public void RemoverProdutos(int nmr) {
		quantidade -= nmr;
		System.out.printf("\nForam removidos %d %s do estoque!\n", nmr, nome);
	}

}
