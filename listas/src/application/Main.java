package application;

import entities.Controller.FuncionariosController;
import entities.Model.Funcionarios;
import entities.View.FuncionariosView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionarios> model = new ArrayList<>();
        FuncionariosView view = new FuncionariosView();
        FuncionariosController controller = new FuncionariosController(view, model);

        boolean continuar = true;

        while (continuar) {

            continuar = controller.rodarMenu();

        }
    }
}