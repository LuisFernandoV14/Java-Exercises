package entities.View;

import entities.Controller.FuncionariosController;
import entities.Model.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionariosView {

    public void mostrarFuncionarios(List<Funcionarios> obj) {
        int i = 1;
        System.out.print("\n---------------------------------------");
        for(Funcionarios f : obj) {
            System.out.print("\nFuncionario #" + i + ":"
                    + "\nID: " + f.getID()
                    + "\nNome: " + f.getNome()
                    + "\nSalario: " + f.getSalario()
                    + "\n---------------------------------------");
            i++;
        }
    }

    public int voltarMenu() {

        int option = 0;
        Scanner leitor = new Scanner(System.in);

        while (option < 1) {
            System.out.print("""
                    \nO que deseja fazer?
                    1 - Registrar funcionários.
                    2 - Aumentar salário de um funcionário.
                    3 - Listar funcionários.
                    4 - Encerrar programa. \s
                    R:\s""");

            option = leitor.nextInt();
            leitor.nextLine(); // Limpar buffer

            if (option < 1 || option > 4) {
                System.out.println("Erro 3: O número digitado não é uma opção.");
                limparConsole();
                option = 0;
            }
        }

        limparConsole();

        return option;
    }

    public void limparConsole() {
        pausarConsole();
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public void pausarConsole() {
        Scanner  leitor = new Scanner(System.in);
        System.out.println("\nAperte ENTER para continuar...");
        leitor.nextLine();
    }

    public ArrayList<Funcionarios> voltarListaFuncionarios() {

        ArrayList<Funcionarios> obj = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos funcionários novos serão registrados? \nR: ");
        int n = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer

        for (int i = 0; i < n; i++) {

            int ID; String nome; double salario;

            System.out.print("\nNome do funcionário #" + (i + 1) + ": ");
            nome = leitor.nextLine();

            System.out.print("Salario do funcionário #" + (i + 1) + ": ");
            salario = leitor.nextDouble();

            System.out.print("Id do funcionário #" + (i + 1) + ": " );
            ID = leitor.nextInt();

            leitor.nextLine(); // Limpa o buffer

            try {
                FuncionariosController.checarID(ID, obj);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                limparConsole();
                continue;
            }

            obj.add(new Funcionarios(ID, salario, nome));


        }

        return obj;
    }

    public void listarIDs(List<Funcionarios> obj) {

        System.out.print("IDs: " + obj.getFirst().getID());

        for (int i = 1; i < obj.size(); i++) {
            System.out.print(", " + obj.get(i).getID());
        }

        System.out.println(".");
    }



}

