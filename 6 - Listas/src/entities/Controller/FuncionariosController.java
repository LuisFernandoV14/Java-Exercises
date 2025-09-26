package entities.Controller;

import entities.Model.Funcionarios;
import entities.View.FuncionariosView;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FuncionariosController {

    private List<Funcionarios> model;
    private FuncionariosView view;

    public FuncionariosController(FuncionariosView view, List<Funcionarios> model) {
        this.view = view;
        this.model = model;
    }

    public void listarTodosFuncionarios() {
        view.mostrarFuncionarios(model);
    }
    
    public static void checarID(Integer ID, List<Funcionarios> model) throws RuntimeException {
        for (Funcionarios f : model) {
            if(Objects.equals(f.getID(), ID)){
                throw new RuntimeException("Erro 1: O ID de funcionário: " + ID + " já existe.\n");
            }
        }
    }

    public void aumentarSalario() throws NullPointerException {

        Scanner leitor = new Scanner(System.in);

        view.listarIDs(model);

        System.out.print("\nDigite o ID do funcionário que terá o salário aumentado\nR: ");
        int ID = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer;

        Funcionarios result = model.stream().filter(x -> Objects.equals(x.getID(), ID)).findFirst().orElse(null);


        if (result != null) {

            System.out.print("\nQual foi a porcentagem de aumento no salário? (escreva somente o número, sem o \"%\") \nR: ");
            double percent = leitor.nextDouble();
            leitor.nextLine(); // Limpa o buffer

            System.out.println("\nO salário de " + result.getNome() + " aumentou! \n" + "Antigo salário: " + result.getSalario());

            result.setSalario(result.getSalario() + (result.getSalario() * percent / 100));

            System.out.println("Novo salário: " + result.getSalario());

        } else
            throw new NullPointerException("Erro 2: Não tem funcionário com o ID fornecido.\n");

        /* O que model.stream().filter(x -> Objects.equals(x.getID(), ID)).findFirst().orElse(null); faz?

         * primeiro ele converte model (ArrayList) em stream, depois ele filtra usando uma função lambda
         * nesse caso a função Lambda serve pra achar um objeto que tenha o valor ID igual ao ID que foi fornecido de parâmetro no método aumentarSalario
         * o findFirst diz para a função Lambda parar de procurar valores de ID assim que achar o primeiro que satisfaça a condição
         * o orElse é acionado caso não tenha nenhum funcionário em model com o valor de ID igual ao ID fornecido como parâmetro, nesse caso ele retorna null

         */

        /* (Linha excluída) O que model.get(view.voltarIndex(model, result.getID())).setSalario(result.getSalario()); faz?

         * model.get() pega um elemento de model com base no inteiro passado como parametro
         * o metodo voltarIndex de view retorna um inteiro e ele usa uma lista (model) e um id (result.getID() como parâmetro.
         * o setSalario() vai mudar o salario do elemento de model que está no indice que voltarIndex retornar
         * como eu quero mudar o valor do elemento para um novo valor eu usei um placholder (result) e aqui eu troco o valor antigo pelo valor do novo salario (setSalario(result.getSalario())

         ** Obs: Essa linha de código é inútil KKKKKKKK, porque result não virará uma cópia do elemento em model e sim uma referência direta, o que eu mudar em result mudará no elemento em model sem precisar dessa linha de código, eu vou tirar o método voltarIndex, mas vou deixar esse comentário aqui ainda porque eu gostei da minha solução para um problema inexistente.

         */
    }

    public boolean rodarMenu() {

        int option = view.voltarMenu();

        return switch (option) {

            // Adicioanr funcionário
            case 1 -> {
                model.addAll(view.voltarListaFuncionarios());
                yield true;
            }

            // Aumentar salário com base no ID
            case 2 -> {
                this.aumentarSalario();
                yield true;
            }

            // Listar todos os funcionários
            case 3 -> {
                this.listarTodosFuncionarios();
                yield true;
            }

            // Encerrar o programa
            case 4 -> {
                System.out.println("Encerrando programa...");
                yield false;
            }

            default -> false;
        };

    }

}
