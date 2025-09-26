package application;

import entities.Produto;
import java.util.Scanner;

public class A_MediaEntreObjetosProduto {
    public static void main(String[] args) {

        Scanner vasco = new Scanner(System.in);

        int n;
        System.out.print("Digite o numero de produtos que serão armazenados: ");
        n = vasco.nextInt();

        Produto[] vetor_produtos = new Produto[n];

        for(int i = 0; i < vetor_produtos.length; i++) {

            String nome_produto;
            double preco_produto;

            System.out.print("Digite o nome do produto: ");
            vasco.nextLine(); // Limpa o Buffer
            nome_produto = vasco.nextLine();

            System.out.print("Digite o valor do produto: ");
            preco_produto = vasco.nextDouble();

            vetor_produtos[i] = new Produto(nome_produto, preco_produto);

        }

        double media_preco = 0;

        for (Produto vetorProduto : vetor_produtos) {
            media_preco += vetorProduto.getPreco_produto();
        }

        media_preco = media_preco / vetor_produtos.length;

        System.out.printf("\nA média de preço entre os produtos que digitaste é de: R$%.2f", media_preco);

        vasco.close( );
    }
}