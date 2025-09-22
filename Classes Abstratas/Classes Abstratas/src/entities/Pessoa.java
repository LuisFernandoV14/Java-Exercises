package entities;

public abstract class Pessoa {

    protected String nome;
    protected double rendaAnual;
    protected double dividaImposto;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public void setDividaImposto(double dividaImposto) {
        this.dividaImposto = dividaImposto;
    }

    public double calcularDivida() {
        return 0;
    }

    public void mostrarDados() {

    }


}
