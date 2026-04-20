// Essa classe também resolve a primeira questão, mas sem usar Scanner

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PrimeiraQ_BufferedReader {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int decidirIntervalo() {

        int t = 0;

        try {

            System.out.print("Entre com um inteiro T (1 <= T <= 2 * 10^5): ");
            t = Integer.parseInt(br.readLine());

            if (t < 1 || t > 2 * Math.pow(10, 5)) {throw new InputMismatchException("Menor que 0 ou maior que 200000");}

        } catch (Exception e) {
            System.out.println("Digite um número válido");
            return 0;
        }

        return t;

    }

    private static List<Integer> decidirNumeros() {
        int t = 0;
        List<Integer> n = new ArrayList<>();
        while (t == 0) {
            t = decidirIntervalo();
        }

        try {
            System.out.println("Digite " + t + " números inteiros n (1 <= n <= 10^7): ");

            for (int i = 0; i < t; i++) {
                int j = Integer.parseInt(br.readLine());
                j = (j < 1 || j > Math.pow(10, 7)) ? 0 : j;
                n.add(j);
            }

        } catch (Exception e) {
            System.out.println("Ué" + e.getMessage());
            return null;
        }

        return n;

    }

    private static boolean isPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void isPrimoArrojado() {

        List<Integer> n = null;
        while (n == null) {
            n = decidirNumeros();
        }

        List<String> res = new ArrayList<>();

        for (Integer num : n) {

            if (num == 0) res.add("Número Inválido");

            while (num > 0) {
                if (isPrimo(num) && num % 10 == num) {
                    res.add("Y");
                    break;
                } else if (isPrimo(num)) {
                    num /= 10;
                } else {
                    res.add("N");
                    break;
                }
            }

        }

        for (String s : res) {
            System.out.println(s);
        }

    }
}
