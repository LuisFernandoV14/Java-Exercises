package Teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SegundoTeste {

    public static void main(String[] args) {

        String caminho = "C:\\Users\\SAMSUNG\\Documents\\Cursos\\Curso de Java\\Java-Exercises\\12 - Trabalhando com Arquivos\\src\\Teste\\Receita de bolo fofinho.txt";

        FileReader leitorFR = null; // Leitor próprio de arquivos, lê streams de caracteres
        BufferedReader leitorBR = null; // Um leitor de arquivos também, só que mais rápido

        try {

            leitorFR = new FileReader(caminho); // Instancia um objeto passando o caminho de um arquivo como parâmetro
            leitorBR = new BufferedReader(leitorFR); // Instancia um objeto passando um FileReader como parâmetro

            // Também seria possível fazer isso:
            // leitorBR = new BufferedReader(new FileReader(caminho));

            String linha = leitorBR.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitorBR.readLine();
            }

        }
        catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        finally {

            // Tentar fechar ambos FileReader e BufferedReader pode lançar exceção por n motivos, nesse caso o jeito é imprimir a StackTrace e ver a melhor forma de corrigir o erro, pra isso tem que colocar um bloco try-catch dentro de um bloco try-catch-finally

            try {
                if (leitorFR != null) {
                    leitorFR.close();
                }
                if(leitorBR != null) {
                    leitorBR.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

// Obs, caso tenha baixado ou copiado esse arquivo do meu repositório para a sua máquina corrija o caminho para abrir o objeto do tipo String, na linha 11, corretamente, com certeza o caminho não será o mesmo
