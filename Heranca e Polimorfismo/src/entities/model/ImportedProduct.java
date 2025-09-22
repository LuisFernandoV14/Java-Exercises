package entities.model;

public final class ImportedProduct extends Product {

    private double customFee;

    // Construtor -------------------------------------------------------------

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    // Getters e Setters ------------------------------------------------------

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    // Métodos ----------------------------------------------------------------

    @Override
    public String priceTag() {
        return "Id: " + id + " | Produto: " + name + " | Preço: R$" +  totalPrice() + " | Taxa de Importação: " + customFee;
    }

    public double totalPrice() {
        return price + customFee;
    }

}
