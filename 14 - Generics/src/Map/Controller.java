package Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {

    Scanner sc;


    public Controller(Scanner sc) {
        this.sc = sc;
    }

    public Map<Integer, Candidato> construirMap() {

        Map<Integer, Candidato> map = new HashMap<>();

        System.out.println("Digite o caminho do arquivo com os candidatos: ");

        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {

            System.out.println();
            String linha = br.readLine();
            Candidato candidato;

            while (linha != null) {
                String[] cortada = linha.split(",");
                candidato = new Candidato(cortada[0], Integer.parseInt(cortada[1]));

                checarVotos(candidato, map);
                map.put(candidato.getNumeroUrna(), candidato);
                System.out.println("LOG - Voto contado para: " + candidato.getNumeroUrna());


                linha = br.readLine();

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return map;

    }

    public void checarVotos(Candidato obj, Map<Integer, Candidato> map) {
        for (Map.Entry<Integer, Candidato> entry : map.entrySet()) {
            if (entry.getValue().equals(obj)) {
                obj.setVotos(entry.getValue().getVotos() + 1);
            }
        }
    }

    public void imprimirMap(Map<Integer, Candidato> map) {
        System.out.println("Número de Candidatos: " + map.size());
        for (Map.Entry<Integer, Candidato> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void calcularNumeroVotos(Map<Integer, Candidato> map) {
        int totalVotos = 0;
        for (Map.Entry<Integer, Candidato> entry : map.entrySet()) {
            totalVotos += entry.getValue().getVotos();
        }

        System.out.println("Número total de votos: " + totalVotos);
    }

    public void calcularVencedor(Map<Integer, Candidato> map) {
        Candidato vencedor = new Candidato("placeholder", 0);
        for (Map.Entry<Integer, Candidato> entry : map.entrySet()) {
            if (vencedor.getVotos() < entry.getValue().getVotos()) {
                vencedor = entry.getValue();
            }
        }

        System.out.println("Vencedor da eleição (mais votos): " + vencedor);
    }

}
