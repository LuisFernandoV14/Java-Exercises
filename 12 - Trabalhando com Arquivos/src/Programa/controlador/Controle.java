package Programa.controlador;

import Programa.entidades.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public final class Controle {
    
    static Scanner ler = new Scanner(System.in);

    // "Construtor" ---------------------------------------------------------------------------------

    private Controle () {} // Isso impede a classe de ser instanciada, eu quero uma classe de utilidade, por isso não vou instanciar ela

    // Métodos Implementados ------------------------------------------------------------------------

    public static String definirArquivo() {
        System.out.println("Digite o caminho absoluto do arquivo: ");
        return ler.nextLine();
    }

    public static ArrayList<String> lerArquivo() {

        ArrayList<String> linhas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(Controle.definirArquivo()))) {

            leitor.readLine(); // lê o Cabeçalho

            do {
                linhas.add(leitor.readLine());
            } while (linhas.getLast() != null);

            System.out.println("Arquivo lido com sucesso!");

        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return linhas;

    }

    public static ArrayList<Produto> parseProduto() {

        ArrayList<String> lista = Controle.lerArquivo();
        ArrayList<Produto> produtos = new ArrayList<>();

        String nome; double preco; int qnt;

        for (String linha : lista) {
            if (linha != null) {
                nome = linha.split(",") [0];
                preco = Double.parseDouble(linha.split(",")[1]);
                qnt = Integer.parseInt(linha.split(",")[2]);
                produtos.add(new Produto(nome, qnt, preco));
            }
        }

        return produtos;

    }

    public static void formatarArquivo() {

        ArrayList<Produto> produtos = Controle.parseProduto();

        System.out.print("\nEm qual diretório o novo arquivo será escrito? ");
        String novoArquivo = definirArquivo();

        try (BufferedWriter caneta = new BufferedWriter(new FileWriter(novoArquivo))) {

            caneta.write("Produto, Preço Total\n"); // Imprime o cabeçalho

            for (Produto produto : produtos) {
                caneta.write(produto.imprimir());
            }

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        System.out.println("Arquivo formatado com sucesso!");

    }

}
