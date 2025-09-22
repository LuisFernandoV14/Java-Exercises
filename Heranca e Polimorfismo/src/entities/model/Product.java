package entities.model;

public class Product {

    protected int id;
    protected String name;
    protected double price;

    // Construtor -------------------------------------------------------------

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters ------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    // Métodos ----------------------------------------------------------------

    public String priceTag() {
        return "Id: " + id + " | Produto: " + name + " | Preço: R$" +  price;
    }

}
