package Map;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Scanner(System.in));
        Map<Integer, Candidato> map = controller.construirMap();

        System.out.println("-----------------------------------------------------");

        controller.imprimirMap(map);

        System.out.println("-----------------------------------------------------");

        controller.calcularNumeroVotos(map);
        controller.calcularVencedor(map);

        controller.sc.close();
    }
}

