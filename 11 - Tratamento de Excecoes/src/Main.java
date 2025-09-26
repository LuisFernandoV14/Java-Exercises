import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta c1 = Conta.construirConta();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Teste ---");

        boolean sucesso = false;
        while (!sucesso) {
            try {
                System.out.print("Quantos reais quer sacar? \nR: ");
                double quantidade = sc.nextDouble();
                c1.saque(quantidade);
                sucesso = true;
            }
            catch (IllegalArgumentException e) {
                System.out.println("\nErro: " + e.getMessage());
            }
            finally {
                if(sucesso) {
                    System.out.println("\nSucesso no teste!");
                    System.out.println("Encerrando Scanner...");
                    sc.close();
                }
                else {
                    System.out.println("Repetindo teste...\n");
                }
            }
        }

    }

}
