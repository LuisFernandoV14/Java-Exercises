import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class ExercicioFixacaoLambda {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
                "Ana", "Bruno", "Amanda", "Carlos", "Aline", "Paulo",
                "Beatriz", "Caio", "Clara", "Bruno", "Ana" // duplicados para testar
        );

        Map<Character, List<String>> grupos = nomes.stream()
                .filter(n -> {
                    char inicial = Character.toUpperCase(n.charAt(0));
                    return inicial == 'A' || inicial == 'B' || inicial == 'C';
                })
                .map(String::toUpperCase)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(n -> n.charAt(0), TreeMap::new, Collectors.toList()));

        grupos.forEach((letra, lista) -> {
            System.out.printf("%c (%d): %s%n", letra, lista.size(), String.join(", ", lista));
        });
    }
}
