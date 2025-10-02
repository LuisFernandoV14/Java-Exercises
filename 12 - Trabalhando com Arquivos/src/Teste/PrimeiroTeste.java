package Teste;// Esse é um teste para ler um arquivo usando Scanner

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiroTeste {
    public static void main(String[] args) {

        // Abre um objeto do tipo File e passa a receita de bolo pra ele, tem que usar "\\" para o compilador ler "\"
        File arquivo = new File("C:\\Users\\SAMSUNG\\Documents\\Cursos\\Curso de Java\\Java-Exercises\\12 - Trabalhando com Arquivos\\src\\Teste\\Receita de bolo fofinho.txt");

        // Cria um Scanner vazio
        Scanner leitor = null;

        // Atribuir um arquivo pra um leitor pode jogar uma IOException, então é recomendado sempre fazer isso num bloco try-catch
        try {

            leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

        }
        catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        finally {
            if (leitor != null) {
                leitor.close();
            }
        }

        // Por fim, tem que fechar leitor, se ele for nulo não tem o que fechar, vai ser jogado uma exceção, por isso o if

    }
}

// Obs, caso tenha baixado ou copiado esse arquivo do meu repositório para a sua máquina corrija o caminho para abrir o objeto do tipo File, na linha 11, corretamente, com certeza o caminho não será o mesmo
