import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrimeiraQ {
    private static int dedicirIntervalo(Scanner leitor) {
        System.out.print("Entre com um inteiro T (1 <= T <= 2 * 10^5): ");
        int T = 0;
        try {
            T = Integer.parseInt(leitor.nextLine());
            if (T < 1 || T > 2 * Math.pow(10, 5)) {
                throw new InputMismatchException("Menor que 0 ou maior que 200000");
            }
        } catch (Exception e) {
            System.out.println("Valor inválido: "+ e.getMessage());
            return 0;
        }
        return T;
    }
    private static List<Integer> decidirNumeros(Scanner leitor) {
        List<Integer> n = new ArrayList<>();
        int T = 0;
        while (T == 0) {
            T = dedicirIntervalo(leitor);
        }
        for (int i = 1; i <= T; i++) {
            int j;
            System.out.print("Digite um número inteiro n (1 <= n <= 10^7): ");
            try {
                j = Integer.parseInt(leitor.nextLine());
                if (j < 1 || j > Math.pow(10, 7)) {
                    throw new InputMismatchException("Insira um valor n válido");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
                continue;
            }
            n.add(j);
        }
        return n;
    }
    public static void isPrimoArrojado(Scanner leitor) {
        List<Integer> n = decidirNumeros(leitor);
        for (Integer numero : n ) {
            while (numero > 0) {
                if (isPrimo(numero) && numero < 10) {
                    System.out.println("S");
                    break;
                } else if (isPrimo(numero)) {
                    numero /= 10;
                } else {
                    System.out.println("N");
                    break;
                }
            }
        }
    }
    private static boolean isPrimo(Integer numero) {
        int count = 0;
        if (numero == 1) { return false;}
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }
}
