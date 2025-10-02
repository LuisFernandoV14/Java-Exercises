// O bloco try com resources declara um ou mais recurso e garante que eles serão fechados no fim do bloco
// Disponível no Java 7 em diante

package Teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TerceiroTeste {

    public static void main(String[] args) {

        String caminho = "C:\\Users\\SAMSUNG\\Documents\\Cursos\\Curso de Java\\Java-Exercises\\12 - Trabalhando com Arquivos\\src\\Teste\\Receita de bolo fofinho.txt";

        // Inicializa o BufferedReader como um recurso de try, que será descartado assim que o bloco try acabar
        try (BufferedReader leitorBR = new BufferedReader(new FileReader(caminho))) {

            String linha = leitorBR.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = leitorBR.readLine();
            }

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}

// Obs, caso tenha baixado ou copiado esse arquivo do meu repositório para a sua máquina corrija o caminho para abrir o objeto do tipo String, na linha 14, corretamente, com certeza o caminho não será o mesmo

