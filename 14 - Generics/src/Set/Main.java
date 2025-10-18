package Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Cliente> log = new TreeSet<>();

        System.out.println("Digite o caminho inteiro do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {

            String linha =  bf.readLine();

            while (linha != null) {
                String[] cortada = linha.split(" ");
                log.add(new Cliente(cortada[0], cortada[1]));
                linha = bf.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Total de Clientes: " + log.size());
        sc.close();


    }
}
