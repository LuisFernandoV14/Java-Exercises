package entities;

public class Pessoas {

    private String nome;
    private double altura;
    private int idade;

    public Pessoas(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public Pessoas() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {

        return "Nome - " + this.getNome() + "\n"
                + "Altura - " + this.getAltura() + " metros \n"
                + "Idade - " + this.getIdade() + " anos \n";

    }

}
