package Teste;

import java.io.*;
import java.util.ArrayList;

public class QuartoTeste {

    public static void main(String[] args) {

        // Para escrever num arquivo temos o FileWriter e o BufferedWriter

        // Caso queira criar (ou recriar) um arquivo usa-se:
        // FileWriter escritor = new FileWriter(caminho);

        // Caso queira escrever num arquivo que já existe usa-se:
        // FileWriter escritor = new FileWriter(caminho, true);

        // O Tipo de arquivo criado se dá pelo nome passado no construtor do FileWriter: "c:\USERS...\Tabela.csv" vai criar um arquivo ".csv", por exemplo, mas o padrão (caso não especifique a extensão) é um arquivo de texto simples (plain text)

        // O BufferedWriter é um FileWriter mais rápido

        String arquivoLido = "C:\\Users\\SAMSUNG\\Documents\\Cursos\\Curso de Java\\Java-Exercises\\12 - Trabalhando com Arquivos\\src\\Teste\\Receita de bolo fofinho.txt";

        String arquivoEscrito = "C:\\Users\\SAMSUNG\\Documents\\Cursos\\Curso de Java\\Java-Exercises\\12 - Trabalhando com Arquivos\\src\\Teste\\Nova Receita de bolo fofinho.txt";

        try ( BufferedReader leitorBR = new BufferedReader(new FileReader(arquivoLido));
              BufferedWriter escritorBR = new BufferedWriter(new FileWriter(arquivoEscrito)) ) {

            // Importante notar que o write não quebra linha como o println
            escritorBR.write("Esse é um arquivo copiado!\n\nO arquivo original está em: " + arquivoLido + "\n\n");

            ArrayList<String> linhas = new ArrayList<>();

            do {
                linhas.add(leitorBR.readLine());
            } while (linhas.getLast() != null);

            for (String linha : linhas) {

                if (linha != null) {
                    escritorBR.write(linha + "\n");
                } else {
                    escritorBR.newLine();
                }


            }

            System.out.println("\nArquivo copiado com sucesso!");

        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }



    }

}


// Obs, caso tenha baixado ou copiado esse arquivo do meu repositório para a sua máquina corrija os caminhos para abrir os objetos do tipo String, na linha 22 e 24, corretamente, com certeza o caminho não será o mesmo
