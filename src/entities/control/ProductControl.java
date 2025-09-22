package entities.control;

import entities.model.Product;
import entities.view.ProductView;

import java.util.ArrayList;

public class ProductControl {

    private final ArrayList<Product> model;
    private final ProductView view;

    public ProductControl(ArrayList<Product> model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public int Menu () {

        int option = view.Menu();

        return switch (option) {
            case 1 -> {
                view.addProduct(model);
                yield 0;
            }
            case 2 -> {
                view.addUsedProduct(model);
                yield 0;
            }
            case 3 -> {
                view.addImportedProduct(model);
                yield 0;
            }
            case 4 -> {
                view.listarProdutos(model);
                yield 0;
            }
            case 5 -> {
                System.out.print("Encerrando Programa...");
                yield 1;
            }

            default -> throw new IllegalStateException("Valor não esperado: " + option);
        };

    }

}
