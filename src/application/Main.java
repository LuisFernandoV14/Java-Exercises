package application;

import entities.model.*;
import entities.control.ProductControl;
import entities.view.ProductView;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductView view = new ProductView();
        ArrayList<Product> model = new ArrayList<Product>();
        ProductControl control = new ProductControl(model, view);

        int keepGoing = 0;

        while (keepGoing == 0) {
            keepGoing = control.Menu();
        }

    }

}
