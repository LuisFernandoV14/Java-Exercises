package entities.model;

import java.time.LocalDate;

public final class UsedProduct extends Product {

    // Construtor -------------------------------------------------------------

    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    // Getters e Setters ------------------------------------------------------

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Métodos ----------------------------------------------------------------

    @Override
    public String priceTag() {
        return "Id: " + id + " | Produto: " + name + " (Usado) | Preço: R$" +  price + " | Data de Fabricação: " + manufactureDate;
    }

}
