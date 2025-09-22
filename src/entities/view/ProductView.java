package entities.view;

import entities.model.ImportedProduct;
import entities.model.Product;
import entities.model.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {

    public int Menu () {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nO que deseja fazer?");
            System.out.print("""
                     1 - Adicionar Produto Comum.
                     2 - Adicionar Produto Usado.
                     3 - Adicionar Produto Importado.
                     4 - Listar Produtos.
                     5 - Encerrar Programa.\s
                    \s
                     R:\s""");

            int option = sc.nextInt();
            sc.nextLine(); // Limpa o Buffer

            if (option <= 0 || option > 5) {continue;}
            else return option;
        }
    }

    public void addProduct(ArrayList<Product> model) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do produto #" + (model.size() + 1) + "\nProduto Comum");

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.print("Digite o valor do produto: ");
        double price =  sc.nextDouble();
        sc.nextLine(); // Limpa o Buffer

        model.add(new Product(name,price));
        model.getLast().setId(model.size());

        System.out.println("\nProduto adicionado com sucesso!");
    }

    public void addUsedProduct(ArrayList<Product> model) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do produto #" + (model.size() + 1) + "\nProduto Usado");

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o valor do produto: ");
        double price =  sc.nextDouble();
        sc.nextLine(); // Limpa o Buffer

        System.out.print("Digite a data de fabricação do produto (dia/mês/ano): ");
        String date = sc.nextLine();

        model.add(new UsedProduct(name,price, parseDate(date)));
        model.getLast().setId(model.size());

        System.out.println("\nProduto adicionado com sucesso!");
    }

    public void addImportedProduct(ArrayList<Product> model) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do produto #" + (model.size() + 1) + "\nProduto Importado");

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o valor do produto: ");
        double price =  sc.nextDouble();
        sc.nextLine(); // Limpa o Buffer

        System.out.print("Digite a taxa de importação do produto: ");
        double fee = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer

        model.add(new ImportedProduct(name,price, fee));
        model.getLast().setId(model.size());

        System.out.println("\nProduto adicionado com sucesso!");
    }

    public void listarProdutos(ArrayList<Product> model) {
        for (Product p : model) {
            System.out.println(p.priceTag());
        }
    }

    public LocalDate parseDate(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatter);
    }

}
